
package matrix;

public class No4 {
    public static void main(String[] args) {
        int[][] matriks_01 = {
            {65, 12, 23},
            {23, 76, 25}
        };
        int[][] transpose = new int [7][7];
        for (int i = 0; i < matriks_01.length; i++) {
            for (int j = 0; j < matriks_01[0].length; j++) {
                transpose[j][i] = matriks_01[i][j];     
            }  
        }
        for (int i = 0; i < matriks_01[0].length; i++) {
            for (int j = 0; j < matriks_01.length; j++) {
                System.out.print(transpose[i][j]+" ");      
            }
            System.out.println();
        }
    }
}

