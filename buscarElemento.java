//función buscarElemento(arr, n)  un array y un número n. Devuelve true si n está en el array, y false si no.
public class main {
    public static void buscarElemento(int [] arr, int n) {
        boolean resultado=false;
        for (int i : arr) {
            if (i == n) {
                resultado = true;
            }
        }
        System.out.println(resultado);
    }
    public static void main(String[] args){
        int[] numerikos = {1,7,2,41,45,12,87,69,4,6,8,3,3,9,16};
        buscarElemento(numerikos, 8);
    }
}
