//Escribe una función esMatrizIdentidad(matriz) que reciba una matriz cuadrada y devuelva true si es una matriz identidad, y false en caso contrario.

public class main {

    public static boolean esMatrizIdentidad(int[][] array) {
        for(int i=0;i<array.length;i++){
            if(array.length != array[i].length){
                return false;
            }
        }
        for(int i=0 ; i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    if(i==j){
                        if(array[i][j] !=1) {
                            return false;
                        }
                    }
                    if(i!=j){
                        if(array[i][j] !=0){
                            return false;
                        }
                    }
                }
            }
            return true;
    }
    public static void main(String[] args) {
    int[][] manuela = { {1,0,0},
                        {0,1,0},
                        {0,0,1}            };
    System.out.println(esMatrizIdentidad(manuela));
    }
}
