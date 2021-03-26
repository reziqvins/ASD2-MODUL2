
package matrix;

public class No2 {
    public static void main(String[] args) {
        int [][] matriks_01 = {
            {17, 10},
            {13, 15},
            {20, 11}};
        int [][] matriks_02 = {
            {10, 7},
            {9, 8},
            {14, 4}};
        if (matriks_01.length == matriks_02.length && matriks_01[0].length == matriks_02[0].length){
        int [][] hasil = new int [matriks_01.length][matriks_01[0].length];
            for (int f = 0; f < matriks_01.length; f++) {
                for (int r = 0; r < matriks_01[0].length; r++) {
                    hasil [f][r] = matriks_01[f][r] - matriks_02[f][r];
                    System.out.print(hasil[f][r]+" ");        
                }
                System.out.println();     
            }
        }
        else {
            System.out.println("Ukuran Matriks tidak sama");
        }
    }
}

