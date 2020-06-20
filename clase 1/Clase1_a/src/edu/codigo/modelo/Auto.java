package edu.codigo.modelo;
// SOLID --> caracteristicas de la clase/estructura
/*
 * Responsabilidad simple ---> diagnostico --> que atributos necesito para el diagnostico? contexto en el que se usa la clase
 * Open / Close --->
 */
public class Auto {
	/*creamos variables / atributos
	 * Cosas a considerar --> visibilidad / tipo de objeto / nombre del atributo
	 * Visibilidad --> privada (solo desde clase auto) / protegida (solo clase auto y sus clases extendidas)  / publica (cualquier clase accede)
	 * 
	 * 
	 * 
	 * Preguntar: clase publica/privada/protegida, eso cuenta para accesos desde el package?
 	 */
	
	//Atributos: 
	public String marca;
	public String modelo;
	public String defecto;
	public int	patente;
	
}
