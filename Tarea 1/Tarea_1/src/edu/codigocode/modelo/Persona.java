package edu.codigocode.modelo;

public class Persona {
	
		//*Atributos	
		private String nombre;
		private String apellido;
		private int edad;
//* Sobrecarga de constructor
public  Persona(String nombre , String apellido, int edad) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;

}

//* Metodos Set y Get  ----> shortcut : boton derecho getters y setters ....
public String Getnombre() {
	return this.nombre;
}
public String Getapellido() {
	return this.apellido;
}

public int Getedad() {
	return this.edad;
}


public  void  Setnombre(String nombre) {
	this.nombre=nombre;
	return;
}
public  void  Setapellido(String apellido) {
	this.apellido=apellido;
	return;
}

public  void  Setedad(int edad) {
	this.edad=edad;
	return;
}


}