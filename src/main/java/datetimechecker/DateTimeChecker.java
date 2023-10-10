/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package datetimechecker;

/**
 *
 * @author ThanhF
 */
public class DateTimeChecker {

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static boolean validateInput(int value, int min, int max) {
        if (value < min || value > max) {
            return false;
        }
        return true;
    }

    public static boolean onlyInt(Object value) {
        if (value instanceof Integer) {
            return true;
        } else if (value instanceof String) {
            try {
                Integer.parseInt((String) value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return false;
    }

    public static boolean validDay(int day) {
        return validateInput(day, 1, 31);
    }

    public static boolean validMonth(int month) {
        return validateInput(month, 1, 12);
    }

    public static boolean validYear(int year) {
        return validateInput(year, 1, 9999);
    }

    public static boolean validDayInMonth(int day, int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day != 31;
        } else if (month == 2) {
            if (day > 29) {
                return false;
            }
            if (!isLeapYear(year) && day == 29) {
                return false;
            }
        }
        return true;
    }

    public static int getDayByMonthAndYear(Object month, Object year) {
        if (onlyInt(month) && onlyInt(year)) {
            int intMonth = Integer.parseInt(month.toString());
            int intYear = Integer.parseInt(year.toString());
            if (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) {
                return 30;
            }
            if (intMonth == 2) {
                if (isLeapYear(intYear)) {
                    return 29;
                }
                return 28;
            }
            return 31;
        }
        return 0;
    }

    public static boolean validDate(Object day, Object month, Object year) {
        if (onlyInt(day) && onlyInt(month) && onlyInt(year)) {
            int intDay = Integer.parseInt(day.toString());
            int intMonth = Integer.parseInt(month.toString());
            int intYear = Integer.parseInt(year.toString());

            return validDay(intDay) && validMonth(intMonth) && validYear(intYear) && validDayInMonth(intDay, intMonth, intYear);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
}
