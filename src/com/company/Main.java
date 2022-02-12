package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2");
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию для iOS по ссылке ");
        }
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println(" Установите версию для iOS по ссылке ");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println(" Установите версию для Android по ссылке ");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println(" Задача 3");
        int Year = 2021;
        if (Year % 4 == 0 && (Year % 100 != 0 ) || ( Year % 400 == 0)) {
            System.out.println( Year + " год является високосным");
        } else {
            System.out.println( Year + " год не является високосным");
        }
        System.out.println( " Задача 4");
        int DeliveryDistance = 95;
        if (DeliveryDistance <= 20) {
        System.out.println("Для доставки на расстояние до" + DeliveryDistance + " км. потребуется 1 день");
        } else if ( DeliveryDistance <= 20+40)
            {
                System.out.println(" Для доставки на расстояние до  " + DeliveryDistance + " км. потребуется 2 дня");}
        else if ( DeliveryDistance <= 20+40+40){

            System.out.println(" Для доставки на расстояние " + DeliveryDistance + " км. потребуется 3 дня");}

        System.out.println(" Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Месяц принадлежит к сезону Зима");
                return;
            case 3:
            case 4:
            case 5:
                System.out.println(" Месяц принадлежит к сезону Весна");
                return;
            case 6:
            case 7:
            case 8:
                System.out.println(" Месяц принадлежит к сезону Лето");
                return;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону Осень");
                return;
            default: monthNumber = 13;
        }
    }}





	// write your code here


