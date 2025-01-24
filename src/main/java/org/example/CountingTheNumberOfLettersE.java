package org.example;

import java.util.ArrayList;

public class CountingTheNumberOfLettersE {

    /**
     * Метод для подсчета вхождения символа в текст
     * @param text исходный текст в котором производится поиск
     * @param ch символ который ищется
     */
    public static void counting(String text, char ch) {

        String[] listOfWords =  text.split(" "); // создаем массив для хранения слов из текста и разбиваем строку на слова


        for (int i = 0; i < listOfWords.length; i++) {
            int count = 0; // объявление переменной счётчика
            for (int j = 0; j < listOfWords[i].length(); j++) { // цикл по длине текста в котором по символьно происходит сверка и увеличение счетчика
                if(listOfWords[i].charAt(j) == ch ) {
                    count++;
                }
            }
            System.out.println("Количество букв 'е' в слове " +"'"+ listOfWords[i] +"'"+ " = " + count);
        }

        //Второй вариант более эфективный и без вложенного цикла
//        for (String word : listOfWords) {
//            int count = word.length() - word.replaceAll(String.valueOf(ch), "").length();
//            System.out.println("Количество букв '" + ch + "' в слове " + "'" + word + "'" + " = " + count);
//        }
    }
}
