import java.util.Scanner;

public class Methods {
    public static int factorial(int n){
        if(n<2){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void table(int n, int i){
        System.out.println(n+" x "+i+" = "+(n*i));
        if(i==10){
            return;
        }
        table(n, ++i);
    }
    public static void primeFactors(int n){
        for(int i =2; i<= n/2; i++){
            if(n%i == 0){
                boolean flag = true;
                for(int j=2; j<= Math.sqrt(i); j++){
                    if(i%j == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(" "+i);
                }
            }
        }
    }

    public static int nthFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int a = 0;
        int b = 1;
        int fib = 0;
        for(int i =2; i<= n; i++){
            fib =a+b;
            a = b;
            b = fib;
        }
        return fib;
    }
    public static int nthFibonacciOptimised(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i =2; i<= n; i++){
            fib[i] =fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    public static int power(int n, int b){
        if(b==0) {
            return 1;
        }else if(b==1){
            return n;
        }
        return n*power(n,--b);
    }
    public static int powerOptimised(int n, int b){
        if(b==0) {
            return 1;
        }
        if(b==1){
            return n;
        }
        if(b%2 == 0){
            return powerOptimised(n*n,b/2);
        }else {
            return n*powerOptimised(n*n,b/2);
        }
    }
    public static boolean isPerfectNum(int n){
        int sum = 0;
        for(int i =1; i<= n/2; i++) {
            sum += (n % i == 0) ? i : 0;
        }
        return sum==n;
    }
    private static float taxCalculator(int salary, int totalSaving) {
        float tax = 0;
        int taxableIncome = salary-totalSaving;
        if(taxableIncome <=100000){
            return 0;
        }else if(taxableIncome<=200000){
            tax += 0.10*(taxableIncome-100000);
        }else if (taxableIncome<=500000){
            tax += 10000 + 0.20*(taxableIncome-200000);
        }else if (taxableIncome>500000){
            tax += 70000+0.30*(taxableIncome-500000);
        }
        return tax;
    }

    public void printn(int num) {
        System.out.println("Printing int: " + num);
    }

    public void printn(double num) {
        System.out.println("Printing double: " + num);
    }

    public void printn(float num) {
        System.out.println("Printing float: " + num);
    }

    public void printn(long num) {
        System.out.println("Printing long: " + num);
    }

    public void printn(short num) {
        System.out.println("Printing short: " + num);
    }

    public void printn(byte num) {
        System.out.println("Printing byte: " + num);
    }

    public void printn(char ch) {
        System.out.println("Printing char: " + ch);
    }

    public void printn(boolean flag) {
        System.out.println("Printing boolean: " + flag);
    }
    public void printn(int num, char c){
        System.out.println("Printing integer: " + num);
        System.out.println("Printing character: " + c);
    }
    public void printn(char c, int num){
        System.out.println("Printing character: " + c);
        System.out.println("Printing integer: " + num);
    }

    private static int area(int squareSide) {
        return squareSide*squareSide;
    }
    private static int area(int side1, int side2) {
        return side1*side2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Assignment 9******");
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n+"! = "+factorial(n));
        System.out.println("--------------------------------------");
        System.out.println("*******Assignment 10******");
        System.out.println("Enter a number : ");
        int n2 = sc.nextInt();
        System.out.println("Table of "+n2);
        table(n2, 1);
        System.out.println("--------------------------------------");
        System.out.println("*******Assignment 11******");
        System.out.println("Enter a number : ");
        int n3 = sc.nextInt();
        System.out.print("Prime factors of "+n3+" :");
        primeFactors(n3);
        System.out.println("\n--------------------------------------");
        System.out.println("******Assignment - 12******\n"+ "Using recursion, define a method to know nth term of a Fibonacci series.");
        System.out.println("Enter a number : ");
        int n4 = sc.nextInt();
        System.out.print(n4+"th term of a Fibonacci series: "+nthFibonacci(n4));
        System.out.print("\n"+n4+"th term of a Fibonacci series: "+nthFibonacciOptimised(n4));
        System.out.println("\n--------------------------------------");
        System.out.println("******Assignment - 13******\nDefine a method named 'perfect' that determines if parameter number is a perfect number. \nUse this function in a program that determines and prints all the perfect numbers between 1 and 1000.");
        System.out.print("All perfect numbers from 1 to 100 are : ");
        for (int i = 1; i <=100 ; i++) {
            if(isPerfectNum(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n--------------------------------------");
        System.out.println("******Assignment - 14******\nPower function a^b.");
        System.out.print("Enter number 1 : ");
        int n5 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n6 = sc.nextInt();
        System.out.println(n5+ " raise to power "+n6+" is "+power(n5,n6));
        System.out.println(n5+ " raise to power "+n6+" is "+powerOptimised(n5,n6));
        System.out.println("\n--------------------------------------");
        System.out.println("******Assignment - 14******\ntaxCalculator");
        System.out.print("Enter your gross salary : ");
        int salary = sc.nextInt();
        System.out.print("Enter your total saving : ");
        int totalSaving = sc.nextInt();
        System.out.println("Total tax : ₹"+taxCalculator(salary,totalSaving));
        System.out.println("Enter your gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.println("Enter your total savings: ");
        double savings = sc.nextDouble();
        double taxableIncome = grossSalary - savings;
        if (savings > 100000) {
            savings = 100000;
        }
        double tax = 0;
        if (taxableIncome <= 100000) {
            tax = 0;
        } else if (taxableIncome <= 200000) {
            tax = 0.1 * (taxableIncome - 100000);
        } else if (taxableIncome <= 500000) {
            tax = 0 + 0.1 * 100000 + 0.2 * (taxableIncome - 200000);
        } else {
            tax = 0 + 0.1 * 100000 + 0.2 * 300000 + 0.3 * (taxableIncome - 500000);
        }
        System.out.println("Your tax is: ₹" + tax);
        System.out.println("*******Assignment - 16*******\nCreate a class named 'PrintNumber' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each datatype.");
        Methods printer = new Methods();
        printer.printn(42);
        printer.printn(3.14);
        printer.printn(2.718f);
        printer.printn(1234567890L);
        printer.printn((short) 99);
        printer.printn((byte) 5);
        printer.printn('A');
        printer.printn(true);
        System.out.println("- Assignment - 17\n" +
                "    \n" +
                "    Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.\n" +
                "    \n" +
                "    For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).");

        printer.printn(21, 'y');
        printer.printn('y', 21);
        System.out.println("- Assignment - 18\n" +
                "    \n" +
                "    Create a class to print the area of a square and a rectangle. \n" +
                "    \n" +
                "    The class has two methods with the same name but different number of parameters. \n" +
                "    \n" +
                "    The method for printing area of rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.");

        System.out.print("Enter side of square : ");
        int squareSide = sc.nextInt();
        System.out.print("Area of a square : "+area(squareSide));

        System.out.print("Enter sides of rectangle : ");
        int rectSide1 = sc.nextInt();
        int rectSide2 = sc.nextInt();
        System.out.print("Area of a square : "+area(rectSide1,rectSide2));
        System.out.println("- Assignment - 19\n" +
                "    \n" +
                "    Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as \"unknown\", age as '0' and address as \"not available\". It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.");

    }


}
