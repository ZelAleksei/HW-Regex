package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeletingAllLetters {

    public static void deleting(String text) {
        String regex = "[a-zA-Zа-яёА-ЯЁ ]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("");
        System.out.println("Результат удаления " + result);
    }
}
