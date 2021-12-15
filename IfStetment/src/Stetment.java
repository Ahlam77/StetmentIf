/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */

import java.util.Scanner;

/**
 * 
 * @author mohas
 */
public class Stetment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		do {
			System.out.println("Enter the number of the task (0 to exit) :: ");
			num = in.nextInt();
			switch (num) {
			case 1: {
				System.out.println("Enter two numbers : ");
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				System.out.println("Enter the operator : " + "\n1. +" + "\n2. -" + "\n3. /" + "\n4. *" + "\n5. %"
						+ "\n6. ^" + "\n7. !");
				char operator = in.next().charAt(0);
				switch (operator) {
				case '1':
				case '+':
					System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
					break;
				case '2':
				case '-':
					System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
					break;
				case '3':
				case '/':
					System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
					break;
				case '4':
				case '*':
					System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
					break;
				case '5':
				case '%':
					System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
					break;
				case '6':
				case '^':
					System.out.println(num1 + "^" + num2 + "=" + power(num1, num2));
					break;
				case '7':
				case '!':
					int result = 1;
					for (int i = num1; i > 1; i--) {
						result = result * i;
					}
					System.out.println(num1 + "! " + "=" + result);
					result = 1;
					for (int i = num2; i > 1; i--) {
						result = result * i;
					}
					System.out.println(num2 + "! " + "=" + result);
					break;
				default:
					System.out.println("Wrong Input");
					break;
				}

			}
				break;
			case 2: {
				System.out.println("Enter the year : ");
				int year = in.nextInt();
				System.out.println("Enter the month : ");
				String month = in.next();

				switch (month) {
				case "Jan":
					System.out.println("Jan " + year + " has 31 days");
					break;
				case "Feb":
					if (year % 4 == 0) {
						System.out.println("Feb " + year + " has 29 days");
					} else {
						System.out.println("Feb " + year + " has 28 days");
					}
					break;
				case "Mar":
					System.out.println("Mar " + year + " has 31 days");
					break;
				case "Apr":
					System.out.println("Apr " + year + " has 30 days");
					break;
				case "May":
					System.out.println("May " + year + " has 31 days");
					break;
				case "Jun":
					System.out.println("Jun " + year + " has 30 days");
					break;
				case "Jul":
					System.out.println("Jul " + year + " has 31 days");
					break;
				case "Aug":
					System.out.println("Aug " + year + " has 31 days");
					break;
				case "Sep":
					System.out.println("Sep " + year + " has 30 days");
					break;
				case "Oct":
					System.out.println("Oct " + year + " has 31 days");
					break;
				case "Nov":
					System.out.println("Nov " + year + " has 30 days");
					break;
				case "Dec":
					System.out.println("Dec " + year + " has 31 days");
					break;
				default:
					System.out.println(month + " is not a correct month name");
				}
			}
				break;
			case 0:
				break;
			default:
				System.out.println("Wrong Input");
			}
		} while (num != 0);
	}

	public static int power(int base, int pow) {
		int res = 1;
		for (int i = 0; i < pow; i++) {
			res = res * base;
		}
		return res;
	}

}