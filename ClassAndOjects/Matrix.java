public class Matrix {
    int row;
    int col;
    int[][] arr;
    Matrix(int row, int col){
        this.row = row;
        this.col = col;
        arr = new int[row][col];
    }
    public void setElements(int[][]value){
        this.arr= value;
//        for (int i = 0; i< value.length; i++){
//            for (int j = 0; j < value[0].length; j++) {
//                this.arr[i][j] = value[i][j];
//            }
//        }
    }
    public void getElements(){
        for (int[] i : arr){
            for(int j : i){
                System.out.print(j+"\t");
            }System.out.println();
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
    public void addMatrix(Matrix other){
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
    public void multiplyMatrix(Matrix other){
        if(this.col == other.row) {
            Matrix multiArr = new Matrix(this.row, other.col);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < other.col; j++) {
                    int val = 0;
                    for (int k=0; k < other.col; k++) {
                        val += this.arr[i][k] * other.arr[k][j];
                    }
//                    multiArr.setOneElement(i, j, val);
                    multiArr.arr[i][j] = val;
                }
            }
            System.out.println("After multiplication of two matrix : ");
            multiArr.getElements();
        }
        else {
            System.out.println("We cant multiply these matrices.");
        }
    }
}
