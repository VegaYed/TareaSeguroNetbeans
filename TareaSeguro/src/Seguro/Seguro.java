package seguro;

import java.util.Scanner;

public class Seguro {

	private int valorUf;
	private double montoUfMinimoPorAnio;
	private double montoAPagarUf;
	private boolean asegurable;
	private int anioActual=2019;
	private Scanner scanner = new Scanner(System.in);
	
	public Seguro(Vehiculo vehiculo){
		setValorUf();
		setAsegurable(vehiculo.getAntiguedad());
		setMontoAPagar(vehiculo.getAntiguedad());
		System.out.println(outPut());
	}
	
	
	//private porque no interesa que sea llamado en otra parte, si es llamado en otra parte puede generar un
	//comportamiento no previsto
	private void setAsegurable(int Antiguedad) {
		if(Antiguedad>=10) {
			asegurable=false;
		}else {
			asegurable=true;
		}
	}
	
	//Retorn boolean porque mas adelante sera llamado y necesito saber si o si que devolvera podria ser
	//un String pero el codigo se alargaria un poco mas
	public boolean getAsegurable() {
		return this.asegurable;
	}
	//private porque el orden de la llamada del metodo es importante y no es relevante que sea publico ya que el usuario que use 
	//el metodo no necesita saber cuando llamar a este metodo
	private void setValorUf() {
		System.out.print("Ingrese valor UF: ");
		valorUf = scanner.nextInt();
		scanner.nextLine();
		montoUfMinimoPorAnio = valorUf*0.1; 
	}
	
	//private porque no es necesario que el usuario llame al metodo para que funcione teniendo ya objetos con los valores que necesito
	private void setMontoAPagar(int AnioAntiguedad) {
			montoAPagarUf = montoUfMinimoPorAnio * AnioAntiguedad; 
	}
	
	//esto lo dejo publico ya que no es fundamental para el funcionamiento del programa y retorna info util
	public double getMontoApagar() {
		return this.montoAPagarUf;
	}
	
	//private porque si no es llamado en un orden especifico no funciona como debe 
	private String outPut() {
		if(getAsegurable()) {
			return "Total seguro a pagar: " + getMontoApagar();
		}else {
			return "su auto no es asegurable";
		}
	}
	
}
