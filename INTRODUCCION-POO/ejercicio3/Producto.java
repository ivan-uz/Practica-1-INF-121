package ejercicio3;

public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	
	
	
	public Producto(String nombre, double precio, int stock) {

		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public void vender(int cantidad) {
		if(cantidad>stock) {
			System.out.println("Sobre pasas la capacidad del Stock");
		}else {
			System.out.println("vendiste "+cantidad+" de "+nombre);
			stock = stock - cantidad;
		}
	}
	
	public void reabastecer(int cantidad) {
		if(cantidad>0) {
			System.out.println("reabasteciste "+cantidad+" de "+nombre);
			stock = stock + cantidad;
		}else {
			System.out.println("La cantidad no es positiva, vuelva a intentarlo");
		}
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	

}
