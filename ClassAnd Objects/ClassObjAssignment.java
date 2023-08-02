package ClassAndOjects;
import java.util.Objects;
import java.util.Scanner;

public class ClassObjAssignment{
    public static int[][] takeInput(int row, int col){
        Scanner sc = new Scanner(System.in);
        int[][] value = new int[row][col];
        for(int i = 0; i<row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print("Enter elements for "+i+"th row and "+j+"th col : ");
                value[i][j] = sc.nextInt();
            }
        }
        return value;
    }
    public static void updateElemnt(Matrix m){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you wants to update : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter row no. col no. and value : ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            int value = sc.nextInt();
            try {
                m.setOneElement(row,col,value);
            }catch (Exception e){
                System.out.println("There is no element at arr["+row+"]["+col+"]");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns in a matrix : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        Matrix m1 =new Matrix(row, col);
        m1.setElements(takeInput(row,col));
        m1.getElements();
        m1.getNoOfRows();
        m1.getNoOfColumns();
        m1.getElements();
        updateElemnt(m1);
        m1.getElements();
        System.out.println("Do you want to add second Matrix : (y/n): ");
        if(Objects.equals(sc.next(), "y")){
            System.out.println("Enter the numbers of rows and columns in a matrix : ");
            row = sc.nextInt();
            col = sc.nextInt();
            Matrix m2 =new Matrix(row, col);
            m2.setElements(takeInput(row,col));
//            m2.setElements(takeInput(row,col));
            m2.getElements();
            m2.getNoOfRows();
            m2.getNoOfColumns();
            m2.getElements();
            updateElemnt(m2);
            m2.getElements();

            m1.addMatrix(m2);
            m1.multiplyMatrix(m2);
        }
    }
}
