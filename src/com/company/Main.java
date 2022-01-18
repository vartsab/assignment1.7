package com.company;

public class Main {

    public static void main(String[] args) {
        //#1
        System.out.println("Задача №1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName + "." );

        //#2
        System.out.println("\nЗадача №2");

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //#3
        System.out.println("\nЗадача №3");

        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(" ", "; "));

        //#3
        System.out.println("\nЗадача №3");

        fullName = "Иванов Семён Семёнович";

        if ( fullName.contains("ё") )
            fullName = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника — " + fullName + ".");
    }
}
