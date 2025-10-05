package ejercicio5;

public class Test {

	public static void main(String[] args) {
		Persona p1=new Persona("juan","lopez","mamani",20,12345);
		Persona p2=new Persona("dilan","mamani","lopez",21,12345);
		
		p1.mostrarDatos();
		p2.mostrarDatos();
		
		p1.mayorDeEdad();
		p2.mayorDeEdad();
		
		p1.modificarEdad(19);
		p2.modificarEdad(20);
		
		p1.verificarApellido(p2);
		
		

	}

}
