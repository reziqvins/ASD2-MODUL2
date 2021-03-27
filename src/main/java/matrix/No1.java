/// Muhammad Reziq Darusman
/// 20090127
/// 2B
package matrix;

public class No1 {
    public static void main(String[] args) {
        int matriks [][] = new int  [3][3];
        matriks[0][0] = 12;
        matriks[0][1] = 65;
        matriks[0][2] = 34;
        matriks[1][0] = 22;
        matriks[1][1] = 45;
        matriks[1][2] = 21;
        matriks[2][0] = 37;
        matriks[2][1] = 29;
        matriks[2][2] = 20;
        for (int r = 0; r < matriks.length; r++) {
            for (int v = 0; v < matriks[0].length; v++) {
                System.out.print(matriks[r][v]+ "  ");   
            }
            System.out.println();   
        }
    }
}

