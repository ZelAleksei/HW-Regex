package org.example;

public class CountingTheNumberOfLettersE {

    /**
     * Метод для подсчета вхождения символа в текст
     * @param text исходный текст в котором производится поиск
     * @param ch символ который ищется
     */
    public static void counting(String text, char ch) {

 
        int count = 0; // объявление переменной счётчика
        for (int i = 0; i < text.length(); i++) { // цикл по длине текста в котором по символьно происходит сверка и увеличение счетчика
            if(text.charAt(i) == ch ) {
                count++;
            }
        }
        
        System.out.println("Количество букв 'е' в предствленном тексте " + count);
    }
}
