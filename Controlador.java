package Peliculas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
public static ArrayList<Pelicula> peliculas(){
	ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	try {
		BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\abenito\\Downloads\\WebPelis\\peliculas.txt"));
		String linea = "";
		try {
			linea = br.readLine();
			while (linea!=null) {
				String  [] pelicula = linea.split(";");
				String [] actores = linea.split(",");
				Pelicula peli = new Pelicula (Integer.parseInt(pelicula[0]), pelicula[1],Integer.parseInt(pelicula[2]),Integer.parseInt(pelicula[3]), 
						pelicula[4].replace(" " , "").toLowerCase(), pelicula[5], pelicula[6], actores );
				peliculas.add(peli);
				linea = br.readLine();
			}
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();	
	}
	return peliculas;
}

}
