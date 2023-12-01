package week02;

public class week02examples {


	public static void main(String[] arg) {

		int x = 200;
		boolean flag = (x > 50 && x < 200) || x > 700;
		if (flag) {
			System.out.println("if evaluated to true");
		}else {
			System.out.println("if evaluated to false");
		}
		int yearModel = 2020;
		if (yearModel > 2008 && yearModel < 2010) {
			System.out.println("Condition 1");
		}else if (yearModel >= 2010 && yearModel < 2015) {
			System.out.println("Condition 2");
		}
		else if (yearModel > 2015 && yearModel < 2023) {
			System.out.println("Condition 3");
		} else {
			System.out.println("default condition");

		}
		int dayOfWeek = 1;
		if (dayOfWeek == 1) {

			switch (dayOfWeek) {
			case 1: 
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tuesday");
				break;
			default:
				System.out.println("wednesday");
			}
			String gender = "male";
			int age = 18;
			if (gender.equals ("male")){
				if (age >= 18) {
					System.out.println("male and above or equal 18");
				} else if (age > 20) {
					System.out.println("male and above 20");
				}
			}
			int j = 10;
			j = j++;


			for (int a = 1; a<= 11;a+= 2) {
				System.out.println(a);
			}
			for (int b = 10; b>=1; b--) {
				System.out.println(b);
			}
			int n = 2;
			while (true) {
				System.out.println(n);
				n+= 2;
				if (n>100) {
					break;
				}

			}

			boolean flags = 3 > 10;
			do {
				System.out.println("do while loop here");
			} while (flags);
			
			int age2 = 10;
			String s = age2 > 15 ? "Major" : "Minor";
			System.out.println(s);
					
		} 
		int tokens = 12;
		int costToPlayArcadeGame = 3;

		  System.out.println(!false && (true && !true));
	}
	}
