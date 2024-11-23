//funcion que de un array crea otro array con solamente los numeros pares
import java.util.Arrays;
public class main {
    public static void filtrarPares(int[] array) {
       int contador=0;
       for(int elemento :array){
           if(elemento %2 ==0){
               contador++;
           }
       }
       int[] pares = new int[contador];
       int j=0;
       for(int i =0 ; i<array.length ;i++){
           if(array[i] % 2==0){
               pares[j]=array[i];
               j++;
           }
       }
       System.out.println(Arrays.toString(pares));
    }
    public static void main(String[] args){
    int[] misNumeros = {1,2,3,4,5,6,7,8,9};
    filtrarPares(misNumeros);

    }
}
