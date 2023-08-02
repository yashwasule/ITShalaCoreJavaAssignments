<<<<<<< HEAD
package Loops;

import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******Assignment 1********");
        System.out.println("how many numbers you want to calculate average");
        int numbers = scanner.nextInt();
        System.out.println("Enter the values");
        float sum = 0;
        for (int i = 1; i <= numbers; i++) {
            sum += scanner.nextInt();
        }
        float average = sum / numbers;
        System.out.println("Average " + average);
        System.out.println("*******Assignment 2********");
        System.out.println("Diamond pattern");
        int lines = scanner.nextInt();
        lines /= 2;
        for (int j = 0; j < lines - 1; j++) {
            for (int i = 0; i < lines - j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j <= lines; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < lines - j; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < lines - j - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*******Assignment 2- method 2********");
        System.out.print("Diamond pattern\n no.of lines : ");
        int lines2 = scanner.nextInt();
        lines2 /= 2;
        for (int j = 0; j < lines2 - 1; j++) {
            for (int i = 1; i < lines2 - j; i++) {
                System.out.print(" ");
            }
            for (int i = 2 * j + 1; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = lines2 - 1; j >= 0; j--) {
            for (int i = lines2; i > j + 1; i--) {
                System.out.print(" ");
            }
            for (int i = 2 * j + 1; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*******Assignment 4 ********");
        System.out.print("Triangle pattern\n no.of lines : ");
        int lines3 = scanner.nextInt();
        int k = 0;
        for (int j = lines3; j > 0; j--) {
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }
            for (int i = (2 * j - 1); i > 0; i--) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            k++;
            System.out.println();
        }
        System.out.println("-******Assignment - 06******\nPrint ASCII values and their equivalent characters. ASCII value vary from 0 to 255.");
        System.out.println("|| Asci Value |\tChar value || \tAsci Value |\tChar value ||\tAsci Value |\tChar value ||");
        for (int i = 0; i < 255; i++) {
            System.out.println("\t" + i + "\t\t\t\t" + (char) i + "\t\t\t\t" + (++i) + "\t\t\t\t" + (char) i+ "\t\t\t\t\t"+ (++i) + "\t\t\t\t" + (char) i);
        }
        System.out.println("-******Assignment - 07******\nFactorial of number");
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factoria of " + n + " is " + fact);
        System.out.println("-******Assignment - 08******\nWrite a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers");
        System.out.print("Enter a number1 : ");
        int n1 = scanner.nextInt();
        System.out.print("Enter a number2 : ");
        int n2 = scanner.nextInt();
        int termination = n1 > n2 ?n2 : n1;
        int hcf = 1;
        for (int i = 2; i <= termination+1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF is " + hcf);

        System.out.println("- Assignment - 09\r\n" + //
                "    \r\n" + //
                "    Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.");
        int avg = 0, count = 0;
        for (; ;count++) {
            System.out.println("Enter a number or q to quit program : ");
            if(scanner.hasNextInt()){
                avg+=scanner.nextInt();
            }else if(scanner.next().charAt(0) == 'q'){
                System.out.println("Average of numbers : "+avg/count);
                break;
            }else{
                System.out.println("Invalid input! Please enter an integer or 'q' to quit.");
            }
        }
        System.out.println("-******Assignment - 11******\nTake as input a fraction in the form a/b.\nConvert the same into lowest terms and print. (Lowest terms examples 3/12 = 1/4).");
        System.out.print("Enter a number1 : ");
        int a = scanner.nextInt();
        System.out.print("Enter a number2 : ");
        int b = scanner.nextInt();
        int c = a < b ? a : b;
        for (int i = 1; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        System.out.println("lower fraction : " + a + "/" + b);

        System.out.println("-******Assignment - 12******\nCalculate the sum of digits of a number given by user.");
        System.out.print("Enter a number1 : ");
        int number = scanner.nextInt();
        int sumNum = 0;
        for (; number > 0;) {
            sumNum += number % 10;
            number /= 10;
        }
        System.out.println("sum of digits : " + sumNum);

        System.out.println("-******Assignment - 13******\nArmstrong number");
        System.out.print("Enter a number : ");
        int number1 = scanner.nextInt();
        int number2 = number1;
        int sumNumCube = 0;
        for (;number > 0;) {
            sumNumCube += Math.pow((number % 10),3);
            number /= 10;
        }
        if(number2 == sumNumCube)
            System.out.println(number2 + " is a armstrong Number");
        else{
            System.out.println(number2 + " is not a armstrong Number");
        }
        System.out.println("-******Assignment - 14******\nPrime numbers 1 to 100.");
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for(int j = 2; j<= i/2; j++){
                if(i%j == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.print(i+", ");
            }
        }
        System.out.println("\n- **Assignment - 15** \nWrite a program to find prime factor of a number");
        System.out.println("Enter a number = ");
        int numInput = scanner.nextInt();
        for(int i =2; i<= numInput/2; i++){
            if(numInput%i == 0){
                boolean isPrime = true;
                for(int j =2; j<=i/2; j++){
                    if(i%j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime){
                    System.out.print(i+", ");
                }
            }
        }

        System.out.println("\n- **Assignment - 25** \nwrite a program to find the multiplication of 2 numbers without *using operator");
        System.out.println("Enter  a number 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter  a number 2 : ");
        int num2 = scanner.nextInt();
        int res =0;
        for (int i = 0; i < num2; i++) {
            res += num1;
        }
        System.out.println(num1 +" x "+num2 +" = "+res);

        System.out.println("\n- **Assignment - 25** \nwrite a program to find the division of 2 numbers without using /,% operators and print quotient and the remainder");
        System.out.println("Enter two numbers num1 >num2 ");
        System.out.println("Enter a number 1 : ");
        int num5 = scanner.nextInt();
        System.out.println("Enter a number 2 : ");
        int num6 = scanner.nextInt();
        int l1 = num5;
        int k1 = num6;
        int i1 = 0;
        for (; l1>=k1; i1++) {
            l1 -= k1;
        }
        System.out.println(num5 +" / "+num6 +" = "+i1);
        System.out.println(num5 +" % "+num6 +" = "+l1);

        System.out.println("\n- **Assignment - 26** \nwrite a program to print perfect number in the range of 1-1000");
        for (int i = 1; i<=1000; i++) {
            int sumFactors = 0;
            for(int j =1; j <= i/2; j++){
                if(i%j == 0){
                    sumFactors +=j;
                }
            }
            if(i==sumFactors){
                System.out.println(i+", ");
            }
        }
        scanner.close();
    }
}
=======
package Loops;

import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******Assignment 1********");
        System.out.println("how many numbers you want to calculate average");
        int numbers = scanner.nextInt();
        System.out.println("Enter the values");
        float sum = 0;
        for (int i = 1; i <= numbers; i++) {
            sum += scanner.nextInt();
        }
        float average = sum / numbers;
        System.out.println("Average " + average);
        System.out.println("*******Assignment 2********");
        System.out.println("Diamond pattern");
        int lines = scanner.nextInt();
        lines /= 2;
        for (int j = 0; j < lines - 1; j++) {
            for (int i = 0; i < lines - j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j <= lines; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < lines - j; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < lines - j - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*******Assignment 2- method 2********");
        System.out.print("Diamond pattern\n no.of lines : ");
        int lines2 = scanner.nextInt();
        lines2 /= 2;
        for (int j = 0; j < lines2 - 1; j++) {
            for (int i = 1; i < lines2 - j; i++) {
                System.out.print(" ");
            }
            for (int i = 2 * j + 1; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = lines2 - 1; j >= 0; j--) {
            for (int i = lines2; i > j + 1; i--) {
                System.out.print(" ");
            }
            for (int i = 2 * j + 1; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*******Assignment 4 ********");
        System.out.print("Triangle pattern\n no.of lines : ");
        int lines3 = scanner.nextInt();
        int k = 0;
        for (int j = lines3; j > 0; j--) {
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }
            for (int i = (2 * j - 1); i > 0; i--) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            k++;
            System.out.println();
        }
        System.out.println("-******Assignment - 06******\nPrint ASCII values and their equivalent characters. ASCII value vary from 0 to 255.");
        System.out.println("|| Asci Value |\tChar value || \tAsci Value |\tChar value ||\tAsci Value |\tChar value ||");
        for (int i = 0; i < 255; i++) {
            System.out.println("\t" + i + "\t\t\t\t" + (char) i + "\t\t\t\t" + (++i) + "\t\t\t\t" + (char) i+ "\t\t\t\t\t"+ (++i) + "\t\t\t\t" + (char) i);
        }
        System.out.println("-******Assignment - 07******\nFactorial of number");
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factoria of " + n + " is " + fact);
        System.out.println("-******Assignment - 08******\nWrite a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers");
        System.out.print("Enter a number1 : ");
        int n1 = scanner.nextInt();
        System.out.print("Enter a number2 : ");
        int n2 = scanner.nextInt();
        int termination = n1 > n2 ?n2 : n1;
        int hcf = 1;
        for (int i = 2; i <= termination+1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF is " + hcf);

        System.out.println("- Assignment - 09\r\n" + //
                "    \r\n" + //
                "    Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.");
        int avg = 0, count = 0;
        for (; ;count++) {
            System.out.println("Enter a number or q to quit program : ");
            if(scanner.hasNextInt()){
                avg+=scanner.nextInt();
            }else if(scanner.next().charAt(0) == 'q'){
                System.out.println("Average of numbers : "+avg/count);
                break;
            }else{
                System.out.println("Invalid input! Please enter an integer or 'q' to quit.");
            }
        }
        System.out.println("-******Assignment - 11******\nTake as input a fraction in the form a/b.\nConvert the same into lowest terms and print. (Lowest terms examples 3/12 = 1/4).");
        System.out.print("Enter a number1 : ");
        int a = scanner.nextInt();
        System.out.print("Enter a number2 : ");
        int b = scanner.nextInt();
        int c = a < b ? a : b;
        for (int i = 1; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        System.out.println("lower fraction : " + a + "/" + b);

        System.out.println("-******Assignment - 12******\nCalculate the sum of digits of a number given by user.");
        System.out.print("Enter a number1 : ");
        int number = scanner.nextInt();
        int sumNum = 0;
        for (; number > 0;) {
            sumNum += number % 10;
            number /= 10;
        }
        System.out.println("sum of digits : " + sumNum);

        System.out.println("-******Assignment - 13******\nArmstrong number");
        System.out.print("Enter a number : ");
        int number1 = scanner.nextInt();
        int number2 = number1;
        int sumNumCube = 0;
        for (;number > 0;) {
            sumNumCube += Math.pow((number % 10),3);
            number /= 10;
        }
        if(number2 == sumNumCube)
            System.out.println(number2 + " is a armstrong Number");
        else{
            System.out.println(number2 + " is not a armstrong Number");
        }
        System.out.println("-******Assignment - 14******\nPrime numbers 1 to 100.");
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for(int j = 2; j<= i/2; j++){
                if(i%j == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.print(i+", ");
            }
        }
        System.out.println("\n- **Assignment - 15** \nWrite a program to find prime factor of a number");
        System.out.println("Enter a number = ");
        int numInput = scanner.nextInt();
        for(int i =2; i<= numInput/2; i++){
            if(numInput%i == 0){
                boolean isPrime = true;
                for(int j =2; j<=i/2; j++){
                    if(i%j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime){
                    System.out.print(i+", ");
                }
            }
        }

        System.out.println("\n- **Assignment - 25** \nwrite a program to find the multiplication of 2 numbers without *using operator");
        System.out.println("Enter  a number 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter  a number 2 : ");
        int num2 = scanner.nextInt();
        int res =0;
        for (int i = 0; i < num2; i++) {
            res += num1;
        }
        System.out.println(num1 +" x "+num2 +" = "+res);

        System.out.println("\n- **Assignment - 25** \nwrite a program to find the division of 2 numbers without using /,% operators and print quotient and the remainder");
        System.out.println("Enter two numbers num1 >num2 ");
        System.out.println("Enter a number 1 : ");
        int num5 = scanner.nextInt();
        System.out.println("Enter a number 2 : ");
        int num6 = scanner.nextInt();
        int l1 = num5;
        int k1 = num6;
        int i1 = 0;
        for (; l1>=k1; i1++) {
            l1 -= k1;
        }
        System.out.println(num5 +" / "+num6 +" = "+i1);
        System.out.println(num5 +" % "+num6 +" = "+l1);

        System.out.println("\n- **Assignment - 26** \nwrite a program to print perfect number in the range of 1-1000");
        for (int i = 1; i<=1000; i++) {
            int sumFactors = 0;
            for(int j =1; j <= i/2; j++){
                if(i%j == 0){
                    sumFactors +=j;
                }
            }
            if(i==sumFactors){
                System.out.println(i+", ");
            }
        }
        scanner.close();
    }
}
>>>>>>> f1a423bdd116dfef42cbb577499acab1fbbff14b
