//función  que recibe un número n y devuelva la suma de los números del 1 al n (n incluido)
public class main {
    public static void sumarNumerosHastaN(int n){
       int i=0;
       int resultado=0;
        while(i <= n){
            resultado+= i;
             i++;
        }
        System.out.println(resultado);
    }
    public static void main(String[] args){

    sumarNumerosHastaN(3);
    }
}
