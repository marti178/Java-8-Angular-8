package edu.codigocode.modelo;

public class Auto {
		
		//* Declaro atributos
		private String marca;
		private String modelo;
		private Persona persona;
		private int vmaxima; 
		private boolean arranca;
		
		public Auto(String marca, String modelo, Persona persona) {
			this.persona = new Persona(persona.Getnombre(),persona.Getapellido(),persona.Getedad()); /// preguntar si va con el this!!!!1
			this.marca=marca;
			this.modelo=modelo;
			//*Determinando velocidad maxima
			this.vmaxima=Velocidamaxima();
			//verifico si arranca
			this.arranca=arrancar();
			
		} // construyo mi clase ( sobrecargo constructor)
		
		//* Metodos  Get SET
		public String Getmarca() {
			return this.marca;
		}
		public String Getmodelo() {
			return this.modelo;
		}
		public boolean isarranca() {
			return this.arranca;
		}

		public String Getnombre() {
			return this.persona.Getnombre();
		}
		public String Getapellido() {
			return this.persona.Getapellido();
		}
		public int Getedad() {
			return this.persona.Getedad();
		}
		public int Getvmaxima() {
			return this.vmaxima;
		}

		public int Velocidamaxima() {
			
			if (18 <= (this.persona.Getedad()) &&  (this.persona.Getedad()) <= 30 ) {
				return 150;
			}else if (this.persona.Getedad()>80) {
				return 70;
			}else if (this.persona.Getedad()<18) {
				return 0;
			}else {
				return 200;
			}
			
		}
		private boolean arrancar() {
			if (18 <= (this.persona.Getedad())) {
				
				return true;
			}
			System.out.println("Atencion !! No se admite conductor menor de edad, el auto no va a arrancar ");
			return false;
		}


		
		
		
		
}
