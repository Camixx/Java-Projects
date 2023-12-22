package Hotel;

import java.util.ArrayList;

public class Hotel {

	private String nombre;
	private String direccion;
	private ArrayList<Habitacion> habitaciones;

	public ArrayList<Habitacion> obtenerHabitacionesDisponibles() {

		ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
		int i = 0;

		while (i < habitaciones.size()) {

			if (habitaciones.get(i).estaOcupada() == false) {
				habitacionesDisponibles.add(habitaciones.get(i));
			}

			i++;
		}

		return habitacionesDisponibles;
	}

	
	public double realizarCheckout(int numeroHabitacion) {
		
		Habitacion habitacion = buscarHabitacion(numeroHabitacion);
		double monto = -1;
		
		if(habitacion != null) {
			if(habitacion.estaOcupada()==true) {
				monto = habitacion.calcularTotal();
			}
		}
		
		return monto;
		
	}

	private Habitacion buscarHabitacion(int numeroHabitacion) {
		Habitacion habitacionBuscada = null;
		int i = 0;

		while (i < habitaciones.size() && habitacionBuscada == null) {
			if (numeroHabitacion == habitaciones.get(i).getNumero()) {
				habitacionBuscada = habitaciones.get(i);
			}
			i++;
		}

		return habitacionBuscada;
	}

}

