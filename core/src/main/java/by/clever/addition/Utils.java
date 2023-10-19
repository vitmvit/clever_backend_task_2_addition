package by.clever.addition;

import static by.clever.util.StringUtils.isPositiveNumber;

public class Utils {

    /**
     * проверяет несколько строк на содержание положительного числа
     */
    public static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
