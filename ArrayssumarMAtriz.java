//funcion que suma los elementos de una matriz
public class main {

    public static void sumaMatriz(int[][] array) {
        int sumaTotal=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sumaTotal+=array[i][j];
            }
        }
        System.out.println(sumaTotal);
    }
    public static void main(String[] args) {
    int[][] manuela = { {1,2,3,4}, {5,6,7,8,9} };
   sumaMatriz(manuela);
    }
}
