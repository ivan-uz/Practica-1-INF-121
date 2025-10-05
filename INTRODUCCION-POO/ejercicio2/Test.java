package ejercicio2;

public class Test {
	public static void main(String[] args) {
		Bus bus1=new Bus(14,0);
		System.out.println("metodo1");
		bus1.nuevosPasajeros(13);
		bus1.cobrarPasaje(1.50);
		bus1.asientosLibres();
	}

}
