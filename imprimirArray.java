//  función que imprime cada elemento de un array

//metodo usando un blucle fo
public class main {
    public static void imprimirArray(int[] array){
        for(int i=0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        int [] array = {2,8,2,6};
    imprimirArray(array);
    }
}
// metodo usando bucle for each
public class main {
    public static void imprimirArray(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int [] manuel = {2,8,2,6};
    imprimirArray(manuel);
    }
}

