package colegio.personas;

public class DirectorPersonas implements Personas {
	
	//creacion de campo tipo creacionInforme(interfaz)

	private CreacionInformes informeNuevo;
	
	//creacion de constructor que inyecta la DEPENDENCIA
	public DirectorPersonas(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	
	
	public String getTareas() {
		return "Gestionar la plantilla general del colegio";
	}

	@Override
	public String getInforme() {
		
		return "Este es el informe creado por el director: " + informeNuevo.getInforme();
	}

}
