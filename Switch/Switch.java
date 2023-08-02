package Switch;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********Assignment 1********");
        System.out.println("Enter a month number : ");
        int month1 = sc.nextInt();
        switch (month1) {
            case 1 -> System.out.println("1st month is January.");
            case 2 -> System.out.println(month1 + "nd month is February.");
            case 3 -> System.out.println(month1 + "rd month is march.");
            case 4 -> System.out.println(month1 + "th month is april.");
            case 5 -> System.out.println(month1 + "th month is may.");
            case 6 -> System.out.println(month1 + "th month1 is june.");
            case 7 -> System.out.println(month1 + "th month1 is july.");
            case 8 -> System.out.println(month1 + "th month1 is august.");
            case 9 -> System.out.println(month1 + "th month1 is september.");
            case 10 -> System.out.println(month1 + "th month1 is october.");
            case 11 -> System.out.println(month1 + "th month1 is november.");
            case 12 -> System.out.println(month1 + "th month1 is December.");
            default -> System.out.println(month1 + "is not a valid input.");
        }


        System.out.println("********Assignment 2********");
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Method 1 : (Right shift) : ");
        if(num == 0){
            System.out.println("Neutral");
        }else{
            switch (num>>31){
                case -1:
                    System.out.println("negative");
                    break;
                case 0:
                    System.out.println("Positive");
                    break;
            }
        }
        System.out.print("Method 2 : (negation -> Math.abs(num) + ~num) : ");
        int y = Math.abs(num) + ~num;
        switch (y){
            case -1:
                System.out.println("Positive");
                break;
            case 0:
                System.out.println("Neutral");
            default:
                System.out.println("Negative");
                break;
        }


        System.out.println("********Assignment 3********");
        System.out.println("Enter a number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number3 : ");
        int num3 = sc.nextInt();
        int flag = 0;
        if(num1 == num2 && num2 == num3){
            System.out.println("Numbers are equal. ");
        }
        if(num1 >= num2 && num1 >= num3){
            if(num2 >= num3){
                flag = 1;
            }else{
                flag =2;
            }
        }else if(num2 >= num1 && num2 >= num3){
            if(num1 >= num3){
                flag = 3;
            }else{
                flag = 4;
            }
        }else if(num3 >= num1 && num3 >= num2){
            if(num1 >= num2){
                flag = 5;
            }else{
                flag = 6;
            }
        }
        System.out.println("flag = " + flag);
        System.out.print("Numbers in ascending order : ");
        switch (flag){
            case 1 -> System.out.println(num3 +", "+ num2 + ", " + num1);
            case 2 -> System.out.println(num2 +", "+ num3 + ", " + num1);
            case 3 -> System.out.println(num3 +", "+ num1 + ", " + num2);
            case 4 -> System.out.println(num1 +", "+ num3 + ", " + num2);
            case 5 -> System.out.println(num2 +", "+ num1 + ", " + num3);
            case 6 -> System.out.println(num1 +", "+ num2 + ", " + num3);
            default ->System.out.println("Default case");
        }

        System.out.println("********Assignment 4********");
        System.out.println("Enter value of 1st number ::");
        int a = sc.nextInt();
        System.out.println("Enter value of 2nd number ::");
        int b = sc.nextInt();
        System.out.println("Enter operation (+, -, *, /, %");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case '+' :
                System.out.println("Sum of the given two numbers: "+(a+b));
                break;
            case '-' :
                System.out.println("Difference between the two numbers: "+(a-b));
                break;
            case '*' :
                System.out.println("Product of the two numbers: "+(a*b));
            case '/' :
                System.out.println("Result of the division: "+(a/b));
                break;
            case '%' :
                System.out.println("remainder of division: "+(a%b));
                break;
            default :
                System.out.println("Invalid operator");
        }


        System.out.println("********Assignment 5********");
        System.out.println("Enter a age1 : ");
        int age1 = sc.nextInt();
        System.out.println("Enter a age2 : ");
        int age2 = sc.nextInt();
        System.out.println("Enter a age3 : ");
        int age3 = sc.nextInt();
        int flag1 = 0;
        if(age1 == age2 && age2 == age3){
            System.out.println("Age are equal. ");
        }
        if(age1 >= age2 && age1 >= age3){
            if(age2 >= age3){
                flag1 = 1;
            }else{
                flag1 =2;
            }
        }else if(age2 >= age1 && age2 >= age3){
            if(age1 >= age3){
                flag1 = 3;
            }else{
                flag1 = 4;
            }
        }else if(age1 >= age2){
                flag1 = 5;
            }else{
                flag1 = 6;
        }
        System.out.println("flag1 = " + flag1);
        System.out.print("Youngest is : ");
        switch (flag1){
            case 1 -> System.out.println("person3" +", "+ "middle is : person2" + ", " + "oldest is : person1");
            case 2 -> System.out.println("person2" +", "+ "middle is : person3" + ", " + "oldest is : person1");
            case 3 -> System.out.println("person3" +", "+ "middle is : person1" + ", " + "oldest is : person2");
            case 4 -> System.out.println("person1" +", "+ "middle is : person3" + ", " + "oldest is : person2");
            case 5 -> System.out.println("person2" +", "+ "middle is : person1" + ", " + "oldest is : person3");
            case 6 -> System.out.println("person1" +", "+ "middle is : person2" + ", " + "oldest is : person3");
            default ->System.out.println("Default case");
        }

        System.out.println("********Assignment 6********");
        int totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double averageMarks = (double) totalMarks / 5;
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);



        
      System.out.println("Enter value of 1st number ::");
      int a1 = sc.nextInt();

      System.out.println("Enter value of 2nd number ::");
      int b1 = sc.nextInt();

      System.out.println("Select operation");
      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
      char ch1 = sc.next().charAt(0);
      switch(ch1) {
         case 'a' :
         System.out.println("Sum of the given two numbers: "+(a1+b1));
         break;
         case 's' :
         System.out.println("Difference between the two numbers: "+(a1-b1));
         break;
         case 'm' :
         System.out.println("Product of the two numbers: "+(a1*b1));
         case 'd' :
         System.out.println("Result of the division: "+(a1/b1));
         break;
         default :
         System.out.println("Invalid grade");
      }

        System.out.println("********Assignment 8********");
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1 -> System.out.println(1);
                case 2 -> System.out.println(22);
                case 3 -> System.out.println(333);
                case 4 -> System.out.println(4444);
                case 5 -> System.out.println(55555);
                default ->System.out.println("Default case");
            }
        }


        System.out.println("********Assignment 9********");
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1 -> System.out.println("1");
                case 2 -> System.out.println("01");
                case 3 -> System.out.println("101");
                case 4 -> System.out.println("0101");
                case 5 -> System.out.println("10101");
                default ->System.out.println("Default case");
            }
        }


        System.out.println("********Assignment 10********");
        for(int i = 1; i < 5; i++){
            switch (i){
                case 1 -> System.out.println(1);
                case 2 -> System.out.println(23);
                case 3 -> System.out.println(456);
                case 4 -> System.out.println(7890);
                default ->System.out.println("Default case");
            }
        }


        System.out.println("********Assignment 12********");
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1 -> System.out.println(1);
                case 2 -> System.out.println("1 2");
                case 3 -> System.out.println("1 2 3");
                case 4 -> System.out.println("1 2 3 4");
                case 5 -> System.out.println("1 2 3 4 5");
                default ->System.out.println("Default case");
            }
        }


        System.out.println("********Assignment 13********");
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1 -> System.out.print(5);
                case 2 -> System.out.print("45");
                case 3 -> System.out.print("345");
                case 4 -> System.out.print("2345");
                case 5 -> System.out.print("12345");
                default ->System.out.print("Default case");
            }
        }

        

        System.out.println("********Assignment 17********");
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1 -> System.out.println(1);
                case 2 -> System.out.println("1 2");
                case 3 -> System.out.println("1 2 3");
                case 4 -> System.out.println("1 2 3 4");
                case 5 -> System.out.println("1 2 3 4 5");
                default ->System.out.print("Default case");
            }
        }
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1 -> System.out.println("1 2 3 4");
                case 2 -> System.out.println("1 2 3");
                case 3 -> System.out.println("1 2");
                case 4 -> System.out.println(1);
                default ->System.out.print("Default case");
            }
        }
        sc.close();
    }
}
