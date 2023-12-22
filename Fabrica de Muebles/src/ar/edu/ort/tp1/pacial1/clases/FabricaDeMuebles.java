package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable{
	
	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;

	public FabricaDeMuebles(String nombre) {
		setNombre(nombre);
		mueblesFabricados = new ArrayList<>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;		
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		
		if(m != null) {
			mueblesFabricados.add(m);
			retorno = true;
			System.out.println("Fabricando el mueble:");
			m.mostrar();
			}
		
		return retorno;
	}

	public boolean seHaFabricado(String modelo) {
		boolean seHaFabricado = false;
		int i = 0;
		
		while(i < mueblesFabricados.size() && seHaFabricado == false) {
			if(mueblesFabricados.get(i).getModelo().equals(modelo)) {
				seHaFabricado = true;
			}
			i++;
			
		}

		return seHaFabricado;
	}

	@Override
	public void mostrar() {
		
		System.out.println("Fabrica de muebles: " + this.nombre);
		System.out.println("Se han fabricado: " + cantMueblesPorTipo());
		System.out.println("La venta total fue: $" + getVentaTotal());
	}
	
	private String cantMueblesPorTipo() {
		
		int cantMesas = 0;
		int cantSillas = 0;
		int cantSillones = 0;
		
		for(Mueble m: mueblesFabricados) {
			if(m instanceof Mesa) {
				cantMesas++;
			}else {
				if(m instanceof Silla) {
					cantSillas++;
				}else {
					cantSillones++;
				}
			}
		}
		
		String cantidad = cantMesas + " Mesas, " + cantSillas + " Sillas, " + cantSillones + " Sillones";
		
		return cantidad;
		
	}
	
	public float getVentaTotal() {
		
		float cant = 0;
		
		for(Mueble m : mueblesFabricados) {
			cant += m.calcularPrecioVenta();
		}
		
		return cant;
		
	}
	
	
}
