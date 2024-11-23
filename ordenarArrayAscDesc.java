/*Crea una función ordenarArray(arr, orden) que reciba un array y una cadena "asc" o "desc".
Si la cadena es "asc", el array se ordena de forma ascendente; si es "desc", de forma descendente.*/
public class main {
    public static void ordenarArray(int[] array, String x) {
        if (x.equals("asc")) {
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        } else if (x.equals("desc")) {
            Arrays.sort(array);
            int[] ordenado = array.clone();
            Arrays.sort(ordenado);

            int[] invertido = new int[ordenado.length];
            for (int i = 0; i < ordenado.length; i++) {
                invertido[i] = ordenado[ordenado.length - 1 - i];

            }System.out.println(Arrays.toString(invertido));
        }
    }

    public static void main(String[] args) {
        int[] manolo ={7,4,5,6,1,2,3,8,9};
        ordenarArray(manolo,"desc");
    }
}
