<<<<<<< HEAD
import java.util.Objects;
import java.util.Scanner;
public class ClassObjAssignmentUpdated {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers of rows and columns in a matrix : ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            MatrixUpdated m1 =new MatrixUpdated(row, col);
            m1.getElements();
            m1.getNoOfRows();
            m1.getNoOfColumns();
            m1.getElements();
            m1.updateElement();
            m1.getElements();
            System.out.println("Do you want to add second Matrix : (y/n): ");
            if(Objects.equals(sc.next(), "y")){
                System.out.println("Enter the numbers of rows and columns in a matrix : ");
                row = sc.nextInt();
                col = sc.nextInt();
                MatrixUpdated m2 =new MatrixUpdated(row, col);
//                m2.setElements(takeInput(row,col));
                m2.getElements();
                m2.getNoOfRows();
                m2.getNoOfColumns();
                m2.getElements();
                m2.updateElement();
                m2.getElements();

                m1.addMatrix2(m2);
                m1.multiplyMatrix2(m2);
            }
        sc.close();

        }
    }

=======
import java.util.Objects;
import java.util.Scanner;
public class ClassObjAssignmentUpdated {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers of rows and columns in a matrix : ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            MatrixUpdated m1 =new MatrixUpdated(row, col);
            m1.getElements();
            m1.getNoOfRows();
            m1.getNoOfColumns();
            m1.getElements();
            m1.updateElement();
            m1.getElements();
            System.out.println("Do you want to add second Matrix : (y/n): ");
            if(Objects.equals(sc.next(), "y")){
                System.out.println("Enter the numbers of rows and columns in a matrix : ");
                row = sc.nextInt();
                col = sc.nextInt();
                MatrixUpdated m2 =new MatrixUpdated(row, col);
//                m2.setElements(takeInput(row,col));
                m2.getElements();
                m2.getNoOfRows();
                m2.getNoOfColumns();
                m2.getElements();
                m2.updateElement();
                m2.getElements();

                m1.addMatrix2(m2);
                m1.multiplyMatrix2(m2);
            }
        sc.close();

        }
    }

>>>>>>> f1a423bdd116dfef42cbb577499acab1fbbff14b
