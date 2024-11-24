public class main {

    public static void recorrerMatriz(int[][] array) {
        for(int i =0 ; i<array.length;i++){// Recorremos las filas
            for(int j=0 ; j< array[i].length;j++){ // Recorremos las columnas
                System.out.println(array[i][j]);
            }
        }

    }
    public static void main(String[] args) {
    int[][] manuela = { {1,2,3,4}, {5,6,7,8,9} };
    recorrerMatriz(manuela);
    }
}
