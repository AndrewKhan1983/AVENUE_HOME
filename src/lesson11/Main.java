package lesson11;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);

        matrix.setValueAt(0,0,4);
        matrix.setValueAt(0,1,7);
        matrix.setValueAt(0,2,3);
        matrix.setValueAt(1,0,4);
        matrix.setValueAt(1,1,1);
        matrix.setValueAt(1,2,3);
        matrix.setValueAt(2,0,4);
        matrix.setValueAt(2,1,7);
        matrix.setValueAt(2,2,3);

        Matrix matrix2 = new Matrix(3,3);
        matrix2.setValueAt(0,0,3);
        matrix2.setValueAt(0,1,4);
        matrix2.setValueAt(0,2,5);
        matrix2.setValueAt(1,0,4);
        matrix2.setValueAt(1,1,1);
        matrix2.setValueAt(1,2,3);
        matrix2.setValueAt(2,0,4);
        matrix2.setValueAt(2,1,7);
        matrix2.setValueAt(2,2,3);

       //IMatrix result = matrix2.add(matrix);
       //IMatrix result = matrix2.sub(matrix);
       IMatrix result = matrix2.mul(matrix);
        System.out.println(result);
    }
}
