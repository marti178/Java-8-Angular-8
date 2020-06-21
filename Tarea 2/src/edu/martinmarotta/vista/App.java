package edu.martinmarotta.vista;

import edu.martinmarotta.modelo.Boxeador;
import edu.martinmarotta.modelo.Entrenador;

public class App {

	public static void main(String[] args) {
		
	
	
	Entrenador entrenadores[] = new Entrenador[4];
	entrenadores[0]= new Entrenador(5,"pablo");
	entrenadores[1]= new Entrenador(5,"mariano");
	entrenadores[2]= new Entrenador(5,"pepe");
	entrenadores[3]= new Entrenador(5,"holga");
	
	
	Boxeador alumno1 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno2 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno3 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno4 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno6 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno5 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);

	h
	System.out.println("Hola probando programa /n");
	System.out.println(alumno1.toString()+ "/n");
	System.out.println(alumno2.toString()+ "/n");
	System.out.println(alumno3.toString()+ "/n");
	System.out.println(alumno4.toString()+ "/n");
	System.out.println(alumno5.toString()+ "/n");
	System.out.println(alumno6.toString()+ "/n");
	
	
	
	
	}
	
	
}
