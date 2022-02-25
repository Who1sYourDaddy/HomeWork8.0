package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

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