package Hotel;

import java.util.ArrayList;

public class Habitacion {
	
	private int numero;
	private double precioPorDia;
	private boolean estaOcupada;
	private String nombreCliente;
	private int diasDeEstadia;
	private ArrayList<Adicional> adicionales;
	
	
	public Habitacion(int numero, double precioPorDia) {
		super();
		this.numero = numero;
		this.precioPorDia = precioPorDia;
		this.estaOcupada = false;
		this.nombreCliente = null;
		this.diasDeEstadia = 0;
		this.adicionales = new ArrayList<Adicional>();
	}


	public boolean estaOcupada() {
		return estaOcupada;
	}


	public void setEstaOcupada(boolean estaOcupada) {
		this.estaOcupada = estaOcupada;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public int getDiasDeEstadia() {
		return diasDeEstadia;
	}


	public void setDiasDeEstadia(int diasDeEstadia) {
		this.diasDeEstadia = diasDeEstadia;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	
	public double calcularTotal() {
		
		double total = precioPorDia * diasDeEstadia;
		
		if(estaOcupada == false) {
			System.out.println("La habitación esta desocupada.");
		}else {
			total += totalAdicionales();
		}
		
		return total;
		
	}
	
	private double totalAdicionales() {
		
		double total = 0;
		int i = 0;
		
		while(i < adicionales.size()) {
			total += adicionales.get(i).getPrecio();
			i++;
		}
		
		return total;
	}
	

}
