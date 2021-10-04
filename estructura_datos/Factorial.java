import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para calcular el factorial de un número");
		System.out.print("Ingrese un  numero positivo: ");
		int numero = sc.nextInt();
		if(numero <= 0)
			System.out.println("El valor debe ser positivo");
		else
			System.out.print(factorial(numero));

		sc.close();
	}

	public static int factorial(int n){
		int suma = 1;
		for(int i = 1; i <= n; i++)
			suma = suma * i;
			
		return suma;
	}
}
