/// Muhammad Reziq Darusman
/// 20090127
/// 2B
package matrix;
public class No3 {
    public static void main(String[] args) {
        int [][] matriks_1 = {
            {4, 9, 2},
            {1, 4, 8}
        };
        int [][] matriks_2 = {
            {2, 3},
            {6, 3},
            {5, 4}          
        };
            int[][] jumlah = new int [matriks_1.length][matriks_2[0].length];
            for (int i = 0; i < matriks_1.length; i++) {
                for (int j = 0; j < matriks_2[0].length; j++) {
                    for (int k = 0; k < matriks_1[0].length; k++) {
                        jumlah[i][j] += matriks_1[i][k]*matriks_2[k][j];           
                    } System.out.print(jumlah[i][j]+" ");    
                } System.out.println();       
            }
        }
    }


