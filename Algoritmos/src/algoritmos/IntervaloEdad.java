package algoritmos;

import java.util.Scanner;

class IntervaloEdades{
	
	public static void main(String[] args){

	    Scanner lectura = new Scanner(System.in);

	    int edad;

	    System.out.printf("Ingrese Edad  : ");
	    edad=lectura.nextInt();
	    
	    if (edad<=10) System.out.printf("Ni�o");
	    else if ((edad<=15) && (edad>10)) System.out.printf("Puber");
	    else if ((edad<=18) && (edad>15))System.out.printf("Adoslecente");
	    else if ((edad<=65)&& (edad>18)) System.out.printf("Adulto");
	    else if (edad>65) System.out.printf("Adulto Mayor");
	    else System.out.printf("??");
	    lectura.close();
	}
		


}
