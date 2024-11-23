//funcion que encuentra el valor maximo del array
public class main {
    public static void mayorArray(int[] arr) {
        int maximo= arr[0];
        for(int elemento:arr){
            if (elemento > maximo){
                maximo = elemento;
            }
        }
        System.out.println(maximo);
    }
    public static void main(String[] args){
        int[] numerikoh={26,21,32,18,19,20,23,24,28,30};
        mayorArray(numerikoh);

    }
}
