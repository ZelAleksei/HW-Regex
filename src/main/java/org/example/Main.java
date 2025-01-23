package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        CountingTheNumberOfLettersE count = new CountingTheNumberOfLettersE();
        count.counting("Колобок", 'е');


        System.out.println("Введите номер телефона в международном формате: ");
        Scanner cs = new Scanner(System.in);
        String phoneNumber = cs.nextLine();
        CheckingThePhoneNumber checkPhone = new CheckingThePhoneNumber();
        checkPhone.check(phoneNumber);

        DeletingAllLetters del = new DeletingAllLetters();
        del.deleting("123Мама55мыла 99 раму");
    }
}