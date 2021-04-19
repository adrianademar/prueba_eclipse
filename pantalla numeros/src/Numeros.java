import java.util.Arrays;
import java.util.Scanner;
public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeros[][] = new int[10][10];
		int a;
		double min;
		double max;
		double numeros2[][] = new double[10][10];
		double numeros3[][] = new double[10][10];
		boolean salir = true;
		double suma = 0;
		int cuenta = 0;
		System.out.println("Introduce numeros para rellenar el array");
		do {
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
			a = sc.nextInt();
			numeros[i][j] = a;
			cuenta++;
			System.out.println("Te quedan " + (numeros.length * numeros.length - cuenta) + " numeros por introducir");
			}
		}
		salir = false;
		} while(salir);	
		for(int i = 0; i < numeros2.length; i++) {
			for(int j = 0; j < numeros2[0].length; j++) {
			numeros2[i][j] = numeros[i][j];
			}
		}
		min = numeros2[0][0];
		max = numeros2[0][0];
		for(int i = 0; i < numeros2.length ;i++) {
			for(int j = 0; j < numeros2[0].length; j++) {
			if (numeros2[i][j] < min) {
				min = numeros2[i][j];
			} else if (numeros2[i][j] > max) {
				max = numeros2[i][j];
				}
			}
		}
		System.out.println("El maximo es " + max);	
		System.out.println("El minimo es " + min);
		for(int i = 0; i < numeros2.length; i++) {
			for(int j = 0; j < numeros2[0].length; j++) {
				suma += numeros2[i][j];
			}
			
		}
		for(int i = numeros2.length - 1; i >= 0; i--) {
			for(int j = numeros2[0].length - 1; j >= 0 ; j--) {
			numeros3[i][j] = numeros2[j][i];
			}
		}
		System.out.println("La suma es " + suma);
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(Arrays.toString(numeros3[i]));
		}
		
	}
	
}
