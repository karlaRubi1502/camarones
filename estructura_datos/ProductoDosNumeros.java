import java.util.Scanner;
public class ProductosDosNumeros{

   public static void main(String[] args){
      boolean bandera = true;
      int dato,numDatos,producto;
      Scanner sc =  new Scanner(System.in);
      
      
      // Ciclo infinito 
      while(bandera == true){
         System.out.println("Para salir del ciclo ingrese 0 o 1 para continuar: ");
         int opcion = sc.nextInt();
         if(opcion == 0){
            bandera = false;
            continue;
            }
         System.out.println("--->Multiplicacion de dos numeros<---");
         System.out.print("Ingrese el primero numero: ");
         int num1 = sc.nextInt();
         System.out.print("Ingrese el segundo numero: ");
         int num2 = sc.nextInt();
         System.out.println("El producto es: " + multiplicacionDosNumeros(num1, num2));
      }
   }
   
   public static int multiplicacionDosNumeros(int n, int m){
      return (n * m);
   
  } 
}
