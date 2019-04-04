package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static int main(String[] args) {
	Scanner keyboard;
	keyboard = new Scanner(System.in);
	int year, month, day, j, q, m, k;

		while (true) {
			System.out.println("What year were you born?");
			year= keyboard.nextInt();
			k =year;
			j =(k/100);
			k=(k%100);

			System.out.println("What month were you born?");
			month= keyboard.nextInt();
			m =month;
			System.out.println("What day were you born?");
			day= keyboard.nextInt();
			q =day;
			System.out.println((q+(13*(m+1)/5)+k+(k/4)+(j/4)-2*j)%7);
		}
		}
	public static int birthMonth(int number) {
		if (number == 1) {
			return 13;
		}
	}
}
