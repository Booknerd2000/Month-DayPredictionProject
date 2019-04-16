package com.LickingHeights;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard;
        keyboard = new Scanner(System.in);
		int year, month, day, q, m, k,a;

		while (true) {
			nurseryRhyme("NurseryRhyme");
			System.out.println();

			System.out.println("What month were you born?");
			month = keyboard.nextInt();
			m = month;

			System.out.println("What day were you born?");
			day = keyboard.nextInt();
			q = day;

			System.out.println("What year were you born?");
			year = keyboard.nextInt();
			k = year;

			a = equation(m,q,k);
			System.out.println(a);
			answer(a);
		}


	}

	public static void nurseryRhyme(String title){
		System.out.println(title +"\n\nMonday's child is fair of face,\n" +
				"Tuesday's child is full of grace,\n" +
				"Wednesday's child is full of woe,\n" +
				"Thursday's child has far to go.\n" +
				"Friday's child is loving and giving,\n" +
				"Saturday's child works hard for a living,\n" +
				"But the child born on the Sabbath Day,\n" +
				"Is fair and wise and good in every way.");
	}
	public static int equation(int m , int q, int k){
		int j;
		int w;
		k = birthYear(k,m);
		m = birthMonth(m);

		k = (k % 100);
		j = (k / 100);
		w= (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;
		return w;
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
    public static void answer(int dateW){
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


