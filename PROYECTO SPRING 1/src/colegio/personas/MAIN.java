package colegio.personas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {

	public static void main(String[] args) {
		///////////////////////////////////////SIN SPRING
		//creación objetos tipo Personas
		//Personas Jorge=new DirectorPersonas();
		
		//uso de los objetos creados
		//System.out.println(Jorge.getTareas());
		
		///////////////////////////////////////S  P  R  I  N  G
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		/*Personas Jose = contexto.getBean("MiPersona", Personas.class);
		
		System.out.println(Jose.getTareas());
		
		System.out.println(Jose.getInforme());*/
		
		AlumnoPersonas María = contexto.getBean("MisAlumnos", AlumnoPersonas.class);

		System.out.println("Las tareas del alumno serían: " + María.getTareas());
		System.out.println(María.getInforme());
		System.out.println("Edad: " + María.getEdad());
		contexto.close();

	}
}
