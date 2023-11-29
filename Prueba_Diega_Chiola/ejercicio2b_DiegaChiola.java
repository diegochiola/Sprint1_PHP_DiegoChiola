import java.util.Scanner;

public class ejercicio2b_DiegaChiola {
	
	
	public static void main(String[] args) {
        static Scanner entrada = new Scanner(System.in); 

   
   //Definicion de Variables
        int numeroInicial = 0;
        int numeroFinal = 0;
       
       // double imc = peso / (altura * altura);

        system.out.println("Bienvenido, ingrese un numero entero positivo a continuacion: ");
        numeroInicial = entrada.nextInt();
        
       /*  if (numeroInicial >= 0 && numeroInicial >=10 ){
            //debe mantener el numero, osea numeroFinal=numeroInicial
            numeroFinal = numeroInicial;
        }else if (numeroInicial > 10){
            //deberia sumar los caracteres ejemplo 11-> 1+1=2
        
        }*/
        System.out.println(CalcularNumeroFinal(numeroInicial));
        //imprimir por pantalla
   entrada.close();
}
public static int CalcularNumeroFinal(int numeroInicial) {
    if (numeroInicial >= 0 && numeroInicial >=10 ){
        //debe mantener el numero, osea numeroFinal=numeroInicial
        numeroFinal = numeroInicial;
    }else if (numeroInicial > 10){
        
        //deberia sumar los caracteres ejemplo 11-> 1+1=2
        //falta desarrollar que recorra los digitos de numero inicial y sumarlos
    }
    return numeroFinal;
}