package ejercico7;

public class Mascota {
	private String nombre;
	private String tipo;
	private int energia;
	public Mascota(String nombre, String tipo, int energia) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.energia = energia;
	}
	
	public void alimentar() {
		energia=energia+20;
		if(energia >100) {
			System.out.println(nombre+"alcanzo el limite de alimentos"+" Energia Actual "+energia);
		}else {
			System.out.println("aun puedes seguir alimentando a "+nombre+" Energia Actual "+energia);
		}
	}
	
	public void jugar() {
		energia=energia-15;
		if(energia <0) {
			System.out.println(nombre+"se canso"+" Energia Actual "+energia);
		}else {
			System.out.println("puedes seguir jugando con"+nombre+" Energia Actual "+energia);
		}
	}
	
	
	

}
