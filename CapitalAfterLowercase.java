import java.util.regex.*;

public class CapitalAfterLowercase {
    public static void main(String[] args) {
        String text = "This is a test for aBnormal case and another aC example.";

        // Регулярное выражение для поиска строчной буквы, за которой следует заглавная
        Pattern pattern = Pattern.compile("([a-z][A-Z])");
        Matcher matcher = pattern.matcher(text);

        // Используем StringBuffer для накопления результата
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            // Добавляем вокруг найденной комбинации "!"
            matcher.appendReplacement(result, "!" + matcher.group(1) + "!");
        }

        matcher.appendTail(result);

        // Вывод результата
        System.out.println(result.toString());
    }
}
