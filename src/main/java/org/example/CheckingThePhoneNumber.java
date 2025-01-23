package org.example;

import java.util.regex.*;

public class CheckingThePhoneNumber {

    /**
     * Метод check производит проверку корректности введённого номера с использованием регулярных выражений.
     * @param phoneNumber номер телефона введённый пользователем
     */
    public static void check(String phoneNumber) {


        String regex = "^\\+\\d{10,15}$"; // - регулярное выражение "шаблон" (вначале должен быть плюс,
                                         // состоит из цифр не менее 10 и не более 15)

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Введён корректный номер телефона");

        } else {
            System.out.println("Введён не корректный номер. \nПроверьте правильность ввода и повторите попытку.");
        }
    }
}
