package seguro;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo auto = new Vehiculo();
		auto.setMarca();
		auto.setModelo();
		auto.setAnioVehiculo();
		Seguro seguro = new Seguro(auto);
		
	}
}
