package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int q, m, k, a;

        while (true) {
            nurseryRhyme("Nursery Rhyme:");

            System.out.println("\033[4;30m" + "Find out who you are.");

            System.out.println("Type in the month were you born.");
            m = keyboard.nextInt();

            System.out.println("Type in the day were you born.");
            q = keyboard.nextInt();

            System.out.println("Type in the year were you born." + "\033[0;96m");
            k = keyboard.nextInt();


            a = equation(m, q, k);
            month(m,k);
            answer(a);
            System.out.println(" ");
        }


    }

    public static void nurseryRhyme(String title) {

        System.out.println("\033[4;30m" + title + "\033[1;31m" + "\n\nMonday's child is fair of face,\n" +
                "\033[1;32m" + "Tuesday's child is full of grace,\n" +
                "\033[1;33m" + "Wednesday's child is full of woe,\n" +
                "\033[1;34m" + "Thursday's child has far to go.\n" +
                "\033[1;35m" + "Friday's child is loving and giving,\n" +
                "\033[1;36m" + "Saturday's child works hard for a living,\n" +
                "\033[1;37m" + "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.\n" + "\u001B[0m");
    }

    public static int equation(int m, int q, int k) {
        int j, modYear;
        int w;
        k = birthYear(k, m);

        m = birthMonth(m);

        modYear = (k % 100);

        j = (k / 100);

        w = (q + ((13 * (m + 1)) / 5) + modYear + (modYear / 4) + (j / 4) + 5 * j) % 7;
        return w;
    }

    public static int birthMonth(int dateM) {
        if (dateM <= 2) {
            dateM = dateM + 12;

        }
        return dateM;
    }

    public static int birthYear(int dateY, int dateM) {
        if (dateM <= 2) {
            dateY = dateY - 1;
        }
        return dateY;
    }

    public static void answer(int dateW) {
        switch (dateW) {
            case 0:
                System.out.println("You are Saturday's child that works hard for a living");
                break;
            case 1:
                System.out.println("You are the child born on the Sabbath Day,\n" +
                        "that is fair and wise and good in every way");
                break;
            case 2:
                System.out.println("You are Monday's child that is fair of face");
                break;
            case 3:
                System.out.println("You are Tuesday's child that is full of grace");
                break;
            case 4:
                System.out.println("You are Wednesday's child that is full of woe");
                break;
            case 5:
                System.out.println("You are Thursday's child that has far to go");
                break;
            case 6:
                System.out.println("You are Friday's child that is loving and giving");
                break;
        }
    }

    public static void month(int dateM, int dateY) {
        switch (dateM) {
            case 1:
                System.out.println("You were born in the month of January which has 31 days");
                break;
            case 2:
                if(dateY%400==0){
                    System.out.println("You were born in the month of February when it had 29 days");
                }
                else if(dateY%100==0){
                    System.out.println("You were born in the month of February when it had 28 days");
                }
                else if(dateY%4==0){
                    System.out.println("You were born in the month of February when it had 29 days");
                }
                else{
                    System.out.println("You were born in the month of February when it had 28 days");
        }
                break;
            case 3:
                System.out.println("You were born in the month of March with 31 days");
                break;
            case 4:
                System.out.println("You were born in the month of April with 30 days");
                break;
            case 5:
                System.out.println("You were born in the month of May with 31 days");
                break;
            case 6:
                System.out.println("You were born in the month of June with 30 days");
                break;
            case 7:
                System.out.println("You were born in the month of July with 31 days");
                break;
            case 8:
                System.out.println("You were born in the month of August with 31 days");
                break;
            case 9:
                System.out.println("You were born in the month of September with 30 days");
                break;
            case 10:
                System.out.println("You were born in the month of October with 31 days");
                break;
            case 11:
                System.out.println("You were born in the month of November with 30 days");
                break;
            case 12:
                System.out.println("You were born in the month of December with 31 days");
                break;

        }
    }
}


