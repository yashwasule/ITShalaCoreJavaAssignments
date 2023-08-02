package OperatorsAssign1_16;
import java.util.Scanner;

public class OperatorsAssign1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		System.out.println("\n************ Assignment 1 **************");
		System.out.println(" enter the sides of rectangle : ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		System.out.println("Perimeter of a rectangle : " + 2*(side1 + side2));
		System.out.println("Area of a rectangle : " + (side1*side2));

		System.out.println("\n************ Assignment 2 **************");
		System.out.println(" enter the sides of Triangle : ");
		int side3 = sc.nextInt();
		int side4 = sc.nextInt();
		int side5 = sc.nextInt();
		System.out.println("Perimeter of a Triangle : " + (side3 + side4 + side5));

		System.out.println("\n************ Assignment 3 **************");
		int num5 = 2345;
		num5 += 8;
		num5 /= 3;
		int res = num5%5;
		res *=5;
		System.out.println("((2345+8)/3)%5)*5) = " + res); 

		System.out.println("\n************ Assignment 4 **************");
        int number = 122;
        number += 8;// this is equal to number = number + 8;
        System.out.println("Addition " + number);//130
        number -= 3; // this is equal to number = number -3;
        System.out.println("substraction " + number);//127

        number /= 3; // this is equal to number = number / 3;
        System.out.println("division " + number);//42

        number *= 3;// this is equal to number = number * 3;
        System.out.println("multiplication " + number);//126

		System.out.println("\n************ Assignment 5 **************");
        System.out.println(" enter two numbers : ");
		int num6 = sc.nextInt();
		int num7 = sc.nextInt();
		System.out.println(num6 + " and " + num7 + (num6==num7 ? " are ":" are not ") + "equal.");

		System.out.println("\n************ Assignment 6 **************");
		System.out.println(" enter two numbers : ");
		int base = sc.nextInt();
		int raisto = sc.nextInt();
		System.out.println(base + " raised to power " + raisto +" = "+ (Math.pow(base, raisto)));

		System.out.println("\n************ Assignment 7 & 8 **************");
		System.out.println(" enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + " <  50 and "+ a + " < " + b +" = " + (a<50 && a<b));
		System.out.println(a + " <  50 or "+ a + " < " + b +" = " + (a<50 || a<b));

		System.out.println("\n************ Assignment 9 **************");
		System.out.println(" enter the marks in three subjects : ");
		int num10 = sc.nextInt();
		int num11 = sc.nextInt();
		int num12 = sc.nextInt();
		System.out.println("Total marks of robert = " + (num10 + num11 + num12));
		System.out.println("Percentage of robert = " + ((float)num10 + num11 + num12)/3 + "%");

		System.out.println("\n************ Assignment 10 -1 **************");
		System.out.print(" enter two numbers : \na = ");
		int a1 = sc.nextInt();
		System.out.print("b = ");
		int b1 = sc.nextInt();
		System.out.println("************After swapping**********");
		int temp = a1;
		a1 = b1;
		b1 = temp;
		System.out.println("a1 = "+ a1 +" and b1 = "+b1);
        
        System.out.println("\n************ Assignment 10 -2 **************");
		System.out.println("a1 = "+ a1 +" and b1 = "+b1);
		System.out.println("************ after swapping**********");
		a1 = a1+b1;
		b1 = a1-b1;
		a1 = a1 - b1;
		System.out.println("a1 = "+ a1 +" and b1 = "+b1);

		System.out.println("\n************ Assignment 11 **************\nEnter a Temperature in degrees : ");
		int deg = sc.nextInt();
		System.out.println(deg + "deg C = "+ (deg*(9.0/5)+32) +" deg F");
        
		System.out.println("\n************ Assignment 13 **************");
		System.out.print(" enter a five digit number : ");
		int fiveDigNum = sc.nextInt();
		System.out.println((fiveDigNum / 10000) + ((fiveDigNum % 100) / 10));
		
		System.out.println("\n************ Assignment 14 **************");
		System.out.print(" enter a four digit number : ");
		int fourDigNum = sc.nextInt();
		int newDig = 0;
		newDig = ((fourDigNum % 10)+2)%10;
		newDig += (((fourDigNum / 10)+2)%10)*10;
		newDig += (((fourDigNum / 100)+2)%10)*100;
		newDig += (((fourDigNum / 1000)+2)%10)*1000;
		System.out.println(newDig);
        
		System.out.println("\n************ Assignment 15 **************");
		System.out.print(" enter a Integer number : ");
		int x = sc.nextInt();
		System.out.printf( "Absolute Value of x: %d \n", Math.abs(x) );
		System.out.print(" enter a float number : ");
		float y = sc.nextFloat();
		System.out.printf( "Absolute Value of y: %f \n", Math.abs(y) );

		System.out.println("\n************ Assignment 16 **************");
		System.out.print(" enter a number : ");
		int n1 = sc.nextInt();
		int res1 = 0;
		System.out.print("Reverse of a number " + n1);
		while(n1>0){
			res1 = res1*10 + (n1 % 10);
			n1 /= 10;
		}
		System.out.println(" is " + res1);
        sc.close();
    }
}
