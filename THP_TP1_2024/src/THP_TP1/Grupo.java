package THP_TP1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre){
		this.nombre = nombre;
		this.integrantes = new ArrayList<String>();
	}
	public String getNombre() {
		return this.nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	public void mostrarIntegrantes() {
		System.out.println(this.getCantidadIntegrantes());
		int contador = 0;
		for (String integrante : integrantes) {
			System.out.println(integrante+" "+(contador+1));
			contador++;
		}
	}
	public void agregarIntegrante(String nombreIntegrante) {
		if(buscarIntegrante(nombreIntegrante) == null){
			integrantes.add(nombreIntegrante);
		}
		else {
			System.out.println("Ya se encuentra integrante.");
		}
	}
	public String buscarIntegrante(String nombre) {
		String buscado = null;
		int i = 0;
		while(this.integrantes.size() > i && buscado == null ) {
			if(integrantes.get(i).equals(nombre)) {
				buscado = integrantes.get(i);
			}else {
				i++;
			}
		}
		return buscado;
	}
}
