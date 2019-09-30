package seguro;

import java.util.Scanner;

public class Vehiculo {

	private String marca, modelo;
	private int anioVehiculo, antiguedad;
	private int anioActual=2019;
	Scanner scanner = new Scanner(System.in);
	
	public Vehiculo() {
		
	}
	//Ocupo sobrecarga de constructores para llamar a los metodos desde el constructor
	public Vehiculo(String formaRapida) {
		setMarca();
		setModelo();
		setAnioVehiculo();
		System.out.println("Constructor dos forma rapida");
	}
	
	public void setAnioVehiculo() {
		System.out.print("Ingrese año del vehiculo");
		anioVehiculo = scanner.nextInt();
		scanner.nextLine();
		setAntiguedad();
	}
	
	private void setAntiguedad() {
		if(anioActual==anioVehiculo) {
			antiguedad=1;
		}else {
			antiguedad=anioActual-anioVehiculo;
		}
	}
	
	public void setMarca() {
		System.out.print("Ingre marca del vehiculo");
		marca = scanner.nextLine();
	}
	
	public void setModelo(){
		System.out.print("Ingrese modelo del vehiculo");
		modelo = scanner.nextLine();
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
//Como en este problema no necesitamos mostrar los datos del vehiculo a asegurar no implemento los getters de modelo ni marca
	
	
	
}
