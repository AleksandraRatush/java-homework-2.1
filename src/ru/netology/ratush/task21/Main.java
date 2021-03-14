package ru.netology.ratush.task21;

public class Main {

    public static final double RUBLES_FOR_ONE_MILE = 20.00;

    public static void main(String ... args) {

        double ticketCost = 20000.12;
        double miles = ticketCost / RUBLES_FOR_ONE_MILE;
        System.out.println("Количество милей, начисленных за поездку "  + miles);

    }

}
