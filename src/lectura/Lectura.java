package lectura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import logica.Archivo;

public class Lectura {
	private Scanner sc;	 
	private PrintWriter pw;
	private ArrayList<Archivo> arrayArchivo;
	
	public Lectura(String archivo) throws FileNotFoundException{
		this.arrayArchivo = new ArrayList<Archivo>();
		String nombreArchivo = archivo;
		this.sc = new Scanner(new FileReader(nombreArchivo)); 
	}
	
	public void agregarArreglo(){
		String a = sc.nextLine();
		int contador = 1;
		while(sc.hasNext()){
			System.out.println(contador);
			String stringAux = sc.nextLine();
			String[] aux = stringAux.split(",",6);
			Archivo archivo = new Archivo();
			archivo.setPrograma(aux[0]);
			archivo.setEstado(aux[1]);
			
			if(contador == 1238|| contador == 1239){
				String[] s2 = aux[2].split(",");
				String s3 = s2[0] + s2[1] + s2[2];
				
				//archivo.setMunicipio(s3);
				System.out.println(aux[2]);
			}else{
				archivo.setMunicipio(aux[2]);
			}
			if(!aux[3].isEmpty()){
				archivo.setSuperficie(Double.parseDouble(aux[3]));
			}else{
				archivo.setSuperficie(0.0);
			}
			
			
			archivo.setUnidad(aux[4]);
			aux[5] = aux[5].replace('$', ' ');
			aux[5] = aux[5].replaceAll("\"", "");
			String[] s = aux[5].split(",");
			
			archivo.setMonto(Double.parseDouble(s[0]+s[1]));
			this.arrayArchivo.add(archivo);
			contador++;
		}
	}
	public void convertir(String s){
		/*int inicio;
		int fin;
		String[] aux = new String[5];
		int contador = aux.length;
		for(int i = 0; i < s.length(); i++){
			inicio = i;
			for(int j = i+1; j < s.length()-1; j++){
				fin = j;
				if(s.charAt(j) == ',' ){
					aux[contador] = s.substring(inicio,fin);
					inicio = fin;
				}
			}
		}*/
		
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

	public ArrayList<Archivo> getArrayArchivo() {
		return arrayArchivo;
	}

	public void setArrayArchivo(ArrayList<Archivo> arrayArchivo) {
		this.arrayArchivo = arrayArchivo;
	}
	
	
	
}
