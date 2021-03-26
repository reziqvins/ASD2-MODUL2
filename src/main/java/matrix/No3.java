
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
        if (matriks_1[0].length == matriks_2.length){
            int[][] jumlah = new int [matriks_1.length][matriks_2[0].length];
            for (int i = 0; i < matriks_1.length; i++) {
                for (int j = 0; j < matriks_2[0].length; j++) {
                    for (int k = 0; k < matriks_1[0].length; k++) {
                        jumlah[i][j] += matriks_1[i][k]*matriks_2[k][j];           
                    }             
                } 
            }
            for (int [] f: jumlah){
                for (int r: f){
                    System.out.print(r+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("kolom matriks_01 harus sama dengan baris matriks_02");
        }
    }
}

