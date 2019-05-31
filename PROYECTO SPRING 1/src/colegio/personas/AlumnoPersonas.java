package colegio.personas;

public class AlumnoPersonas implements Personas {

	private CreacionInformes informeNuevo;
	private String nombre;
	private String email;
	private int edad;
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}





	public String getTareas() {
		return "Asistencia, notas, buen comportamiento.";
	}
	public String getInforme() {
		
		return "Este es el informe del Alumno: " + informeNuevo.getInforme();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public String getEmail() {
		return email;
	}
	
    public void setEmail(String email) {
		this.email = email;
	}
    
    
    

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


}


