import java.util.Scanner;

public class MatrixUpdated {
    int row;
    int col;
    int[][] arr;
    private void takeInput(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print("Enter elements for "+i+"th row and "+j+"th col : ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    MatrixUpdated(int row, int col){
        this.row = row;
        this.col = col;
        arr = new int[row][col];
        takeInput();
    }
    public void getElements(){
        for (int[] i : arr){
            for(int j : i){
                System.out.print("  "+j+" \t ");
            }System.out.println();
        }
    }
    public void updateElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you wants to update : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter row no. col no. and value : ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            int value = sc.nextInt();
            try {
                this.setOneElement(row,col,value);
            }catch (Exception e){
                System.out.println("There is no element at arr["+row+"]["+col+"]");
            }
        }
        
    }
    public void getNoOfRows(){
        System.out.println("Number of rows are : " + row);
    }
    public void getNoOfColumns(){
        System.out.println("Number of columns are : " + col);
    }
    public void setOneElement(int row, int col, int value){
        arr[row][col] = value;
    }
    public void addMatrix2(MatrixUpdated other){
        if(this.row == other.row && this.col == other.col){
            Matrix addArr = new Matrix(row,col);
            for (int i = 0; i< row; i++){
                for (int j = 0; j < col; j++) {
                    addArr.setOneElement(i,j,this.arr[i][j] + other.arr[i][j]);
                }
            }
            System.out.println("After addition of two matrix : ");
            addArr.getElements();
        }else {
            System.out.println("We cant add these matrices.");
        }
    }
    public void multiplyMatrix2(MatrixUpdated other){
        if(this.col == other.row) {
            System.out.println("We cant multiply these matrices.");
            return;
        }
        Matrix multiArr = new Matrix(this.row, other.col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < other.col; j++) {
                int val = 0;
                for (int k=0; k < other.col; k++) {
                    val += this.arr[i][k] * other.arr[k][j];
                }
                multiArr.arr[i][j] = val;
            }
        }
        System.out.println("After multiplication of two matrix : ");
        multiArr.getElements();
        
    }
}
