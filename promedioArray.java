//funcion que calcula el promedio de los elementos de un array
public class main {
    public static void promedio(int[] arr) {
      int suma=0;
      int promedio=0;
      for(int edad:arr){
          suma+=edad;
      }
    promedio= suma/arr.length;
      System.out.println(promedio);
    }
    public static void main(String[] args){
        int[] numerikoh={26,21,32,18,19,20,23,24,28,30};
        promedio(numerikoh);

    }
}
