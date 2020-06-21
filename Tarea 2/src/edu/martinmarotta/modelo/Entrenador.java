package edu.martinmarotta.modelo;

public  class Entrenador {
	private int cupo;
	private String nombre;
	

public Entrenador(int cupo,String nombre) {
		this.cupo = cupo;
		this.nombre = nombre;
		
	}

public boolean preguntarcupo() {
	if (this.cupo>0) {
		return true;		
	}
	return false;
}

public void Reducircupo() {
	this.cupo -- ;
	return;
	
}

public int getCupo() {
	return cupo;
}

public void setCupo(int cupo) {
	this.cupo = cupo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}




}