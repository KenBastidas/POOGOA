package constructor;

public class Persona {
 String apellidos;
 String nombres;
 String numero_cedula;
 int edad;
 // cosntrucot method
 /*public Persona(String apellidos, String nombres, String numero_cedula, int edad) {
	 this.apellidos=apellidos;
	 this.nombres=nombres;
	 this.numero_cedula=numero_cedula;
	 this.edad=edad;
  }*/
 
 public void mostrarDatos() {
		System.out.println("El apellido es "+ apellidos);
		System.out.println("El nombre es "+ nombres);
		System.out.println("El numero de cedula es "+ numero_cedula);
		System.out.println("La edad es "+ edad);
	}
 public Persona(String apellidos, String nombres, String numero_cedula, int edad) {
	super();
	this.apellidos = apellidos;
	this.nombres = nombres;
	this.numero_cedula = numero_cedula;
	this.edad = edad;
 }
}
