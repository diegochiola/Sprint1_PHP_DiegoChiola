import java.util.Scanner;

public class ejercicio4_DiegaChiola {
	
	
	public static void main(String[] args) {
        static Scanner entrada = new Scanner(System.in); 

   //Definicion de Variables
        int numerousuario = 0;
       
       // double imc = peso / (altura * altura);

        system.out.println("Bienvenido, ingrese un numero positivo entero: ");
        numeroUsuario = entrada.nextInt();
        
        if (numeroUsuario > 0) {
			for (int i = 0 ; i <= numeroUsuario ; i++) { // filas
				for (int j = 1; j <= i; j++ ) { // columnas
					System.out.print("#" + " ");
				}
				System.out.println(); // para que haga salto de linea 
        }

   entrada.close();
}