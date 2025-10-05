package ejercico7;

public class Test {

	public static void main(String[] args) {
		Mascota m1=new Mascota("Dog","Perro",20);
		Mascota m2=new Mascota("Cat","Gato",30);
		
		m1.alimentar();
		m2.alimentar();
		
		m1.jugar();
		m2.jugar();
		
	}

}
