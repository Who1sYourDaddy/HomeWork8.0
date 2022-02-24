package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String phone = "+960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас наркоман");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("    Task One");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("    TaskTwo");
        //fullName = fullName.replace()
        fullName = fullName.toUpperCase(Locale.ROOT);
        System.out.println(fullName);


            System.out.println("    Task Three");
            String fullName2 = "Иванов Семён Семёнович";
            fullName = fullName2.replace("ё", "е");
            System.out.println(fullName2);


    }
}