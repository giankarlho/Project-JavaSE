package arrays;

public class PromedioU {

	public static void main(String[] args) {
		// creando el Arreglo Unidimensional
		// de tama�o 5
		int Arreglo[] = new int[4];
		
		// Asignando valores a los �ndices		
		Arreglo[0]= 4;
		Arreglo[1]= 9;
		Arreglo[2]= 15;
		Arreglo[3]= 10;
		
		int suma = 0;
		double promedio =0;
		for(int n=0;n<4;n++){ // 4 elementos
			suma = suma + Arreglo[n];
		}
		promedio = suma/4;
		System.out.println("La suma es: " + suma);
		System.out.println("El promedio es: " + promedio);		
	}

}
