//función que devuelve el array de manera invertida
import java.util.Arrays;
public class main {
    public static void invertirArray(int[] arr) {
        int[] ordenInvertido = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ordenInvertido[i] = arr[arr.length - 1 - i];
        }
         System.out.println(Arrays.toString(ordenInvertido));
    }
    public static void main(String[] args){
        int[] numerikos = {1,2,3,4,5,6,7,8,9,10};
        invertirArray(numerikos);
    }
}
