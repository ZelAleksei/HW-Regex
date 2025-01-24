package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String text = "Домашнее задание " +
                "1 В тексте, который вы видите на этом избражении, посчитайте количество 'е' в каждом слове " +
                "2 Напишите регулярное выражение для проверки телефона в международном формате" +
                "3 С помощью регулярного выражения напишите функцию удаления всех букв и пробелов из текста";

        CountingTheNumberOfLettersE count = new CountingTheNumberOfLettersE();
        count.counting(text, 'е');

        System.out.println("Введите номер телефона в международном формате: ");
        Scanner cs = new Scanner(System.in);
        String phoneNumber = cs.nextLine();
        CheckingThePhoneNumber checkPhone = new CheckingThePhoneNumber();
        checkPhone.check(phoneNumber);

        DeletingAllLetters del = new DeletingAllLetters();
        del.deleting(text);
    }
}