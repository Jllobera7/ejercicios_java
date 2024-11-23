//funcion que cuenta cuanas veces aparece un numero dentro del array
public class main {
    public static void contarOcurrencias(int[] array, int x) {
        int contador=0;
        for(int elemento:array){
            if(elemento == x){
                contador++;
            }
        }
        System.out.println(contador);
    }
        public static void main (String[]args){
        int[] misRiles={1,2,3,4,4,58,6,9,7,5,15,25,35,45,6,7,1,8,2,5,9,5,2,5,7,3};
        contarOcurrencias(misRiles, 5);
        }
    }
