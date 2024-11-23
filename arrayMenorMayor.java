//funcion que encuentra el mayor y el menor numero de los elementos del array
public class main {
    public static void arrayMenorMayor(int[] arr) {
        int maximo=arr[0];
        int minimo=arr[0];
        for(int i =0 ; i< arr.length;i++){
            if(arr[i]>maximo){
                maximo=arr[i];
            }if(arr[i]<minimo){
                minimo=arr[i];
            }
        }
     System.out.println("el numero mayor es: " + maximo+" y el numero menor es: " + minimo);
    }
    public static void main(String[] args){
        int[] numerikoh={12,2,3,4,5,-6,17,8};
        arrayMenorMayor(numerikoh);

    }
}
