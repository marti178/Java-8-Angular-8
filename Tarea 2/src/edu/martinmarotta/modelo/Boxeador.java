package edu.martinmarotta.modelo;

import java.util.Arrays;

public class Boxeador {
	
	
	private String nombre;
	private String apellido;
	private int edad;
	private int altura;
	private int peso;
	private Entrenador[] profes;
	private Entrenador profe;
	private String categoria;
	
	public Boxeador(String nombre, String apellido, int edad, int altura, int peso,Entrenador[] profes) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.profe = asignarprofe(profes);
		
	}
	
	
	
	// Asignamos profesor si hay cupo, sino mostramos error y devolvemos null
	public Entrenador asignarprofe(Entrenador[] Entrenador) {
		
		if (peso<48 && Entrenador[0].preguntarcupo()) {
			Entrenador[0].Reducircupo(); 
			this.categoria="Mosca";
			return Entrenador[0];
		}if(48<peso && peso<52  && Entrenador[0].preguntarcupo()) {
			Entrenador[0].Reducircupo();
			this.categoria="Mosca";
			return Entrenador[0];
		} if(52<peso && peso<55 && Entrenador[0].preguntarcupo()) {
			Entrenador[0].Reducircupo();
			this.categoria="Gallo";
			return Entrenador[0];
		} if(55<peso && peso<58 && Entrenador[1].preguntarcupo()) {
			Entrenador[1].Reducircupo();
			this.categoria="Pluma";
			return Entrenador[1];
		}if(58<peso && peso<63 && Entrenador[1].preguntarcupo()) {
			Entrenador[1].Reducircupo();
			this.categoria="Ligero";
			return Entrenador[1];
		}if(63<peso && peso<69 && Entrenador[2].preguntarcupo()) {
			Entrenador[2].Reducircupo();
			this.categoria="Welter";
			return Entrenador[2];
		} if(69<peso && peso<76 && Entrenador[2].preguntarcupo()) {
			Entrenador[2].Reducircupo();
			this.categoria="Mediano";
			return Entrenador[2];
		}if(76<peso && peso<91 && Entrenador[3].preguntarcupo()) {
			Entrenador[3].Reducircupo();
			this.categoria="Mediopesado";
			return Entrenador[3];
		} if(peso>91 && Entrenador[3].preguntarcupo()) {
			Entrenador[3].Reducircupo();
			this.categoria="Pesado";
			return Entrenador[3];
		}else {// casos en los que el cupo esta lleno, muestro que no hay cupo y intento mostrar el profesor que se quedo sin cupo
			if(peso<52)
			System.out.println("No hay cupo para el profesor " + Entrenador[0].getNombre() + " cupo: " +Entrenador[0].getCupo() );
			else if(peso<5)
				System.out.println("No hay cupo para el profesor " + Entrenador[1].getNombre() + " cupo: " +Entrenador[0].getCupo()  );
			else if(peso<52)
				System.out.println("No hay cupo para el profesor " + Entrenador[2].getNombre() +" cupo: " +Entrenador[0].getCupo());
			else
				System.out.println("No hay cupo para el profesor " + Entrenador[3].getNombre() + " cupo: " +Entrenador[0].getCupo() );
			
			return Entrenador[4];
		}
	
	

	}




	@Override
	public String toString() {
		return "Boxeador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + ", profe=" + profe.getNombre() + ", categoria="
				+ categoria + "]";
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Entrenador[] getProfes() {
		return profes;
	}
	public void setProfes(Entrenador[] profes) {
		this.profes = profes;
	}
	public Entrenador getProfe() {
		return profe;
	}
	public void setProfe(Entrenador profe) {
		this.profe = profe;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
