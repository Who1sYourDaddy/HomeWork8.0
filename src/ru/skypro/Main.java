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
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

//        - в задании сказано, что надо в качествен исходных данных для fullName взять
//        "Иванов Семён Семёнович", но строка fullName уже занята. Надо было полностью менять сначала содержание строки
//        или можно было немного изменить переменную, как в решении ниже?

        System.out.println("    Task Three");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);

    }
}