<<<<<<< HEAD
package KnowDataTypes;

import java.util.Scanner;

public class KnowDataTypes {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n**********Assignment 1*********");
        int num = 25;
		double num2 = .12;
		char ch = 'Y';
		System.out.println("int : " + num + ", float : "+ num2 + ", char : "+ ch);

		System.out.println("\n**********Assignment 2*********");
		System.out.println(" enter the sides of rectangle : ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		System.out.println("Perimeter of a rectangle : " + 2*(side1 + side2));
		System.out.println("Area of a rectangle : " + side1 * side2);
        
		System.out.println("\n**********Assignment 3*********");
		System.out.println(" enter the sides of rectangle : ");
		float float1 = sc.nextFloat();
		float float2 = sc.nextFloat();
		System.out.println("product of the numbers "+float1+" and "+ float2 +" is : "+ (float1 * float2));
        
		System.out.println("\n**********Assignment 4*********");
		System.out.println(" Enter any character : ");
		char ch1 = sc.next().charAt(0);
		System.out.println(" ASCII/UNICODE value of the character '"+ch1+"' is : " + ((int)ch1));
        
		System.out.println("\n**********Assignment 5*********");
		System.out.print(" enter the float number : ");
		float float3 = sc.nextFloat();
		System.out.println("value of "+ float3 +" converted to int then : "+((int)float3));
        
		System.out.println("\n**********Assignment 6*********");
		System.out.println(" Enter any character : ");
		char ch2 = sc.next().charAt(0);
		int c = ch2+3;
		char ch3 = (char)c;
		System.out.print("add 3 to the ASCII value of the character '");
		System.out.print(ch2);
		System.out.print("'' then equivalent character : '");
		System.out.println(ch3+"'.");
        
		System.out.println("\n**********Assignment 7*********");
		System.out.println(" Enter a integer : ");
		int num3 = sc.nextInt();
		System.out.println(" Enter a float : ");
		float float4 = sc.nextFloat();
		System.out.println("Sum of "+num3+ " and " +float4 + " is " +( num3 + float4));
        
		System.out.println("\n**********Assignment 8*********");
		System.out.println(" Enter a integer : ");
		float num4 = sc.nextFloat();
		System.out.println("Square of a " + num4 + " is " + (num4*num4));
		System.out.println("Square of a " + num4 + " is " + Math.pow(num4,2));
		sc.close();
    }
}
=======
package KnowDataTypes;

import java.util.Scanner;

public class KnowDataTypes {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n**********Assignment 1*********");
        int num = 25;
		double num2 = .12;
		char ch = 'Y';
		System.out.println("int : " + num + ", float : "+ num2 + ", char : "+ ch);

		System.out.println("\n**********Assignment 2*********");
		System.out.println(" enter the sides of rectangle : ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		System.out.println("Perimeter of a rectangle : " + 2*(side1 + side2));
		System.out.println("Area of a rectangle : " + side1 * side2);
        
		System.out.println("\n**********Assignment 3*********");
		System.out.println(" enter the sides of rectangle : ");
		float float1 = sc.nextFloat();
		float float2 = sc.nextFloat();
		System.out.println("product of the numbers "+float1+" and "+ float2 +" is : "+ (float1 * float2));
        
		System.out.println("\n**********Assignment 4*********");
		System.out.println(" Enter any character : ");
		char ch1 = sc.next().charAt(0);
		System.out.println(" ASCII/UNICODE value of the character '"+ch1+"' is : " + ((int)ch1));
        
		System.out.println("\n**********Assignment 5*********");
		System.out.print(" enter the float number : ");
		float float3 = sc.nextFloat();
		System.out.println("value of "+ float3 +" converted to int then : "+((int)float3));
        
		System.out.println("\n**********Assignment 6*********");
		System.out.println(" Enter any character : ");
		char ch2 = sc.next().charAt(0);
		int c = ch2+3;
		char ch3 = (char)c;
		System.out.print("add 3 to the ASCII value of the character '");
		System.out.print(ch2);
		System.out.print("'' then equivalent character : '");
		System.out.println(ch3+"'.");
        
		System.out.println("\n**********Assignment 7*********");
		System.out.println(" Enter a integer : ");
		int num3 = sc.nextInt();
		System.out.println(" Enter a float : ");
		float float4 = sc.nextFloat();
		System.out.println("Sum of "+num3+ " and " +float4 + " is " +( num3 + float4));
        
		System.out.println("\n**********Assignment 8*********");
		System.out.println(" Enter a integer : ");
		float num4 = sc.nextFloat();
		System.out.println("Square of a " + num4 + " is " + (num4*num4));
		System.out.println("Square of a " + num4 + " is " + Math.pow(num4,2));
		sc.close();
    }
}
>>>>>>> f1a423bdd116dfef42cbb577499acab1fbbff14b
