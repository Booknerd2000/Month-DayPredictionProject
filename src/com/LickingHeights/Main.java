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
		switch
	}
}


