package colegio.personas;

public class PreceptorPersonas implements Personas{
	
	private CreacionInformes informeNuevo;
	
	public PreceptorPersonas(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	
	public String getTareas() {
		return "Gestionar datos de los alumnos";
	}

	
	public String getInforme() {
		
		return "Este es el informe del Preceptor: " + informeNuevo.getInforme();
	}

}
