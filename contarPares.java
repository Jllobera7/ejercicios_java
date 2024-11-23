//una función que cuente cuantos numeros pares hay dentro de un array
public class main {
    public static void contarPares(int [] arr) {
        int contador=0;
        for (int i : arr){
            if(i % 2 ==0)
                contador ++;
        }
       System.out.println(contador);

    }
    public static void main(String[] args){
        int[] numerikos = {1,7,2,41,45,12,87,69,4,6,8,3,3,9,16};
        contarPares(numerikos);
    }
}
