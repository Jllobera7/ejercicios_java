//Crea una función encontrarX(matriz, n) que reciba una matriz y un número x. Devuelve true si n está en la matriz.
public class main {

    public static boolean encontrarX(int[][] array, int n) {
       for(int i=0;i<array.length;i++){
           for(int j=0; j<array[i].length;j++){
               if(array[i][j] == n){
                   return true;
               }
           }
       }
       return false;
    }
    public static void main(String[] args) {
    int[][] manuela = { {1,2,3,4}, {5,6,7,8,9} };
    System.out.println(encontrarX(manuela,8));
    }
}
