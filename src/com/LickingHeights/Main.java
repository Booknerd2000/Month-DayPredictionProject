package com.LickingHeights;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard;
        keyboard = new Scanner(System.in);
		int year, month, day, j, q, m, k;

		while (true) {
			System.out.println("What year were you born?");
			year = keyboard.nextInt();
			k = year;

			System.out.println("What month were you born?");
			month = keyboard.nextInt();
			m = month;
			System.out.println("What day were you born?");
			day = keyboard.nextInt();
			q = day;
            j = (k / 100);
            k = (k % 100);
            birthYear(m,k);
            birthMonth(m);
			System.out.println((q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7);
		}


	}

	public static int birthMonth(int dateM) {
		if (dateM <= 1) {
			return dateM + 12;
		}
		if (dateM == 2) {
			return dateM + 12;
		}
		return dateM;
	}
	public static int birthYear(int dateM, int dateY){
	    if (dateM <=2 ){
	        return dateY -1;
        }
        return dateY;
    }
}


