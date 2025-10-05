package ejercicio5;

public class Persona {
	private String nombre,paterno,materno;
	private int edad,ci;
	public Persona(String nombre, String paterno, String materno, int edad, int ci) {

		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.edad = edad;
		this.ci = ci;
	}
	public void mostrarDatos() {
		System.out.println("NOMBRE "+nombre);
		System.out.println("PATERNO "+paterno);
		System.out.println("MATERNO "+materno);
		System.out.println("EDAD "+edad);
		System.out.println("CI "+ci);
	}
	
	public void mayorDeEdad() {
		if(edad>=18) {
			System.out.println("MAYOR DE EDAD");
		}else {
			System.out.println("NO ES MAYOR DE EDAD");
		}
	}
	
	public void modificarEdad(int nuevo) {
		
		edad=nuevo;
		System.out.println(edad);
	}
	
	public void verificarApellido(Persona x) {
		if(this.paterno==x.paterno) {
			System.out.println("tienen el mismo apellido");
		}else {
			System.out.println("no tienen el mismo apellido");
		}
	}

}
