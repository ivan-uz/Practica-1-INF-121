package ejercicio2;

public class Bus {
	
	int nroAsientos;
	int nroPasajeros;

	public Bus(int nroAsientos, int nroPasajeros) {
		super();
		this.nroAsientos = nroAsientos;
		this.nroPasajeros = nroPasajeros;
	}
	public void nuevosPasajeros(int pasajerosX) {
		if(nroAsientos>=pasajerosX) {
			nroPasajeros=nroPasajeros+pasajerosX;
			System.out.println("Total de PASAJEROS "+nroPasajeros);
		}else {
			System.out.println("Capacidad excedida");
		}
	}
	public void cobrarPasaje(double costo) {
		double tp=nroPasajeros*costo;
		System.out.println("Total de PASAJES cobrados de PASAJEROS "+nroPasajeros+" es: "+tp+" bs");
	}
	
	public void asientosLibres() {
		int al=nroAsientos-nroPasajeros;
		System.out.println("Asientos Libres de "+nroAsientos+" es: "+al);
	}

}
