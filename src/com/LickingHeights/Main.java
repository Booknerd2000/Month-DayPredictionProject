package com.LickingHeights;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard;
        keyboard = new Scanner(System.in);
		int year, month, day, j, q, m, k,w;

		while (true) {
			System.out.println("What month were you born?");
			month = keyboard.nextInt();
			m = month;

			System.out.println("What day were you born?");
			day = keyboard.nextInt();
			q = day;

			System.out.println("What year were you born?");
			year = keyboard.nextInt();
			k = year;

			k = birthYear(k,m);
			m = birthMonth(m);

			k = (k % 100);
			j = (k / 100);

			w =(q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;
			nurseryRhyme(w);
			System.out.println(w);
		}


	}

	public static int birthMonth(int dateM) {
		if (dateM <= 2) {
			dateM = dateM + 12;

		}
		return dateM;
	}
	public static int birthYear(int dateY, int dateM){
	    if (dateM <=2 ){
	    	dateY = dateY -1;
        }
        return dateY;
    }
    public static void nurseryRhyme (int dateW){
		switch(dateW){
			case 0:
				System.out.println("You are Saturday's child works hard for a living");
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
}


