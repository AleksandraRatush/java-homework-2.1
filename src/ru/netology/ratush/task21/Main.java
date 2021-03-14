package ru.netology.ratush.task21;

public class Main {

    public static int RUBLES_FOR_ONE_MILE = 20;

    public static void main(String... args) {

        double ticketCost = 20000.12;
        int miles = (int) (ticketCost / RUBLES_FOR_ONE_MILE);
        System.out.println("Количество милей, начисленных за поездку " + miles);

    }

}
