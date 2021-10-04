import java.util.Scanner;
public class SumaDosNumeros{

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
         System.out.println("--->Suma dos dos numeros<---");
         System.out.print("Ingrese el primero numero: ");
         int num1 = sc.nextInt();
         System.out.print("Ingrese el segundo numero: ");
         int num2 = sc.nextInt();
         System.out.println("La suma es es: " + SumaNumeros(num1, num2));
      }
   }
   
   public static int SumaNumeros(int n, int m){
      return (n + m);
   
  } 
}
