import java.util.Scanner;
public class ClassifyPennies {
	public static void main(String [] args){
		int huned;
		int fiddy;
		int twenty;
		int ten;
		int five;
		int one;
		double quart;
		double dimes;
		double nickels;
		double pennies;
		double remainder;
		double cash;
		Scanner in = new Scanner(System.in);
		
		System.out.print("enter amount of money with at most 2 decimal places: "); //enter your bank
		cash = in.nextDouble();
		
		//this does the bills
		huned =(int) cash/100;
		remainder = cash % 100;
		System.out.printf("  " + huned + " 100 dollar bills");	
		
		fiddy =(int) remainder/50;
		remainder = remainder % 50;
		System.out.printf("\n  " + fiddy + " 50 dollar bills");
		
		twenty =(int) remainder/20;
		remainder = remainder % 20;
		System.out.printf("\n  " + twenty + " 20 dollar bills");
			
		ten =(int) remainder/10;
		remainder = remainder % 10;
		System.out.printf("\n  " + ten + " 10 dollar bills");
			
		five =(int) remainder/5;
		remainder = remainder % 5;
		System.out.printf("\n  " + five + " 5 dollar bills");
			
		one =(int) remainder/1;
		remainder = remainder % 1;
		System.out.printf("\n  " + one + " 1 dollar bills");
		
		
		//this does the coins
		quart = remainder/.25;
		remainder = remainder % .25;
		System.out.printf("\n  " + "%.0f quarters", quart);
		
		dimes = remainder/.10;
		remainder = remainder % .10;
		System.out.printf("\n  " + "%.0f dimes", dimes);
		
		nickels = remainder/.05;
		remainder = remainder % .05;
		System.out.printf("\n  " + "%.0f nickels", nickels);
		
		pennies = remainder/.01;
		remainder = remainder % .01;
		System.out.printf("\n  " + "%.0f pennies", pennies);
		System.out.printf("\n" + "Thank you for using this program");
	}
}

		