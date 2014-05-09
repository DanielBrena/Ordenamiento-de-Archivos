package lectura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import logica.Archivo;

public class Lectura2 {
	private Scanner sc;	
	private PrintWriter pw;
	private ArrayList<String[]> arreglo;
	private ArrayList<Archivo> arregloArchivos;
	private ArrayList<String> cabecera;
	public Lectura2(){
		
	}
	
	public Lectura2(String archivo) throws FileNotFoundException{
		String nombreArchivo = archivo;
		this.cabecera = new ArrayList<String>();
		this.arregloArchivos = new ArrayList<Archivo>();
		this.sc = new Scanner(new FileReader(nombreArchivo)); 
		this.arreglo = new ArrayList<String[]>();
	}
	
	
	public void guardarArray(){
		
		while(sc.hasNext()){
			String[] aux = this.sc.nextLine().split("\n");
			arreglo.add(aux);
		}
		
		
	}
	
	public void cabecera(){
		String[] cabeceraT = new String[this.sc.nextLine().length()];
	}
	
	public void gurdarCabecera(){
		String[] aux = this.arreglo.get(0)[0].split(",");
		for(int i = 0; i < aux.length; i++){
			this.cabecera.add(aux[i]);
		}
		System.out.println( this.cabecera.get(0));
	}
	
	public void guardarObjetos(){
		
		for(int i = 1; i < this.arreglo.size(); i++){
			String[] aux = this.arreglo.get(i)[0].split(",");
			Archivo archivo = new Archivo();
			archivo.setPrograma(aux[0]);
			archivo.setMunicipio(aux[1]);
			//archivo.setSuperficie(aux[2]);
			archivo.setUnidad(aux[3]);
			//archivo.setMonto(aux[3]);
			this.arregloArchivos.add(archivo);
		}
	}
	
	public void mostrarArregloArchivos(){
		for(int i = 0; i < this.arregloArchivos.size(); i++){
			System.out.println(this.arregloArchivos.get(i));
		}
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public PrintWriter getPw() {
		return pw;
	}

	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}
	
	
	
	
	
}
