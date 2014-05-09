import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import lectura.Lectura;
import logica.Archivo;


public class pruebas {
	public static void main(String[] args) throws FileNotFoundException{
		
		Lectura lectura = new Lectura("/home/daniel/workspace2/OrdenamientoPractica1/padrones-beneficiarios-financiamiento-a-bosques.csv");
		lectura.agregarArreglo();
		/*Archivo a = new Archivo("apas","ss"," ",12,"as",12);
		
		
		Archivo b = new Archivo("apaa","aw","fx",11,"ws",32);
		b.setComparar(1);
		System.out.println(b.compareTo(a));*/
		/*String a = "$123,123.00";
		a = a.replace('$', ' ');
		String[] aux = a.split(",");
		System.out.println(Double.parseDouble(aux[0]+aux[1]));
		*/
		
		
	}
}
