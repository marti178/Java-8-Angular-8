package edu.codigo.vista;

import edu.codigo.modelo.Auto;

public class App { // ambito / scope ---> de la clase lo marca las {}
	
	
	/* Punto de inicio de mi aplicacion (main)
	 * Se escribe ---> Visibilidad estatico tipo nombre reservador (main) argumentos	
	 * 
	 * Atributos y Metodos :
	 * Metodos ---> funciones(retornan cosas)  y procedimientos (no devuelven nada)
	 * Atributos --> 
	 * 
	 */
	
	public static void main(String[] args) { //shortcut crear main --> ctrl + Espacio
		
		System.out.println("hola mundo");
		
		// shortcut importar  --> ctrl + shift + o
		
		//creacion del objeto auto, con new resevo posicion de memoria de tama;o lo que construyo el constructor
		Auto auto1 = new Auto();
		
		//Accedo a datos de la clase
		auto1.marca= "chevrolet";
		auto1.modelo= "corsa";
		auto1.patente = 123124;
		auto1.defecto = "me hace ruido el motor";
		
		//Shortcut System out --> Syso + ctrl + espacio
		System.out.println(" posicion de memoria: " + auto1); // que facil es concatenar cosas en Syso!
		System.out.println(auto1.marca);
		System.out.println(auto1.modelo);
		System.out.println(auto1.defecto);
		System.out.println(auto1.patente);
	}
}
