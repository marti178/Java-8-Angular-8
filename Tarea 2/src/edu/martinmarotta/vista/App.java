/* 
 * Autor: Martin Marotta
 * Tarea 2
 * Enunciado:
Realizar un proyecto que cumpla con la siguientes pautas

Clase Persona que tenga los siguientes atributos
nombre , apellido y edad

Funcionalidad
debe garantizar que la persona es mayor de 18 años para poder conducir

Clase Auto , que tenga los siguientes atributos
marca , modelo y Persona

Funcionalidad
Si la persona es menor de edad el auto no debe ser capaz de arrancar
Velocidad maxima es de 150km por hora si la persona es menor o igual de 30 años y 70 km por si es mayor de 80 años
--------------------------------------------- % ----------------------------------------------------------------------
*/



package edu.martinmarotta.vista;

import edu.martinmarotta.modelo.Boxeador;
import edu.martinmarotta.modelo.Entrenador;

public class App {

	public static void main(String[] args) {
		
	System.out.println("Hola probando programa /n");
	
	Entrenador entrenadores[] = new Entrenador[5];
	entrenadores[0]= new Entrenador(2,"pablo");
	entrenadores[1]= new Entrenador(2,"mariano");
	entrenadores[2]= new Entrenador(2,"pepe");
	entrenadores[3]= new Entrenador(2,"holga");
	// asigno un objeto para cada alumno que quede fuera de cupo en espera
	entrenadores[4]= new Entrenador(10000,"En espera de profesor"); 
	
	
	
	Boxeador alumno1 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno2 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno3 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno4 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno6 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);
	Boxeador alumno5 = new Boxeador("Martin", "marotta", 20,80, 74, entrenadores);

	
	
	System.out.println(alumno1.toString());
	System.out.println(alumno2.toString());
	System.out.println(alumno3.toString());
	System.out.println(alumno4.toString());
	System.out.println(alumno5.toString());
	System.out.println(alumno6.toString());
	
	
	
	
	}
	
}

