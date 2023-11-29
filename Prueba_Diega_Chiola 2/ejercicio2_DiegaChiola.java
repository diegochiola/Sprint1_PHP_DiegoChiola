import java.util.Scanner;

public class ejercicio2_DiegaChiola {
	
	
	public static void main(String[] args) {
        static Scanner entrada = new Scanner(System.in); 

   //altura y un peso, nos devuelva su índice de
   //Definicion de Variables
        int altura = 0;
        int peso = 0;
        String imcUsario = "";
       // double imc = peso / (altura * altura);

        system.out.println("Bienvenido, ingrese su altura");
        altura = entrada.nextInt();
        system.out.println("Bienvenido, ingrese su altura");    
        peso = entrada.nextInt();
        imcUsuario = CalcularImc(altura, peso);
        System.out.println(imcUsuario);
   entrada.close();
}
public static String CalcularImc(int altura, int peso) {
    double imc = 0;
    String respuesta ="";
    imc = peso / (alturta * altura);
    if (imc < 18,5){
        respuesta = "Sota pes normal";
    }else if (imc >= 18,5 && imc >= 24,9){
        respuesta = "Normal";
    }else if(imc >= 25 && imc <= 29,9){
        respuesta = "Sobrepès.";
    }else if (imc >= 30){
        respuesta = "Obesitat";
    }
    return respuesta;
}