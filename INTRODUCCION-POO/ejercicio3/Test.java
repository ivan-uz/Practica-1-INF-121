package ejercicio3;

public class Test {

	public static void main(String[] args) {
		Producto p1=new Producto("Jarra",2.0,3);
		
		p1.vender(2);
		p1.reabastecer(1);
		
		System.out.println(p1);

	}

}
