/* 
 * Autor: Martin Marotta
 * Tarea 1 
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
package edu.codigocode.vista;
import edu.codigocode.modelo.Persona;
import edu.codigocode.modelo.Auto;
public class App {

	public static void main(String[] args) {
		
		
		Persona persona1= new Persona(" Martin ", " Marotta " , 18);
		Auto auto1 = new Auto(" chevrolet ", " corsa " , persona1);
		
		
		System.out.println("Auto 1 : " + auto1.Getmodelo() + auto1.Getmarca());
		System.out.println("Propietario del auto 1:  " + auto1.Getnombre() + auto1.Getapellido() + auto1.Getedad());
		System.out.println("Arrancara el auto 1? " + auto1.isarranca());
		System.out.println("Velocidad maxima del auto 1: " + auto1.Getvmaxima());


		
	
	
}}
