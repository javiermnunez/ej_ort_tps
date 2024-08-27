package THP_TP1;

public class Principal {

	public static void main(String[] args) {
		Grupo unGrupo = new Grupo("Los primeros");
		
		unGrupo.mostrarIntegrantes();
		
		unGrupo.agregarIntegrante("Javier");
		
		unGrupo.mostrarIntegrantes();
		
		unGrupo.agregarIntegrante("Pérez");
		
		unGrupo.agregarIntegrante("Lola");
		
		unGrupo.mostrarIntegrantes();
		
		unGrupo.agregarIntegrante("Javier");
		
		unGrupo.mostrarIntegrantes();
		
		System.out.println(unGrupo.obtenerIntegrante(1));

	}

}
