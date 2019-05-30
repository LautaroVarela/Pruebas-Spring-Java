package colegio.personas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {

	public static void main(String[] args) {
		///////////////////////////////////////SIN SPRING
		//creaci�n objetos tipo Personas
		//Personas Jorge=new DirectorPersonas();
		
		//uso de los objetos creados
		//System.out.println(Jorge.getTareas());
		
		///////////////////////////////////////S  P  R  I  N  G
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		/*Personas Jose = contexto.getBean("MiPersona", Personas.class);
		
		System.out.println(Jose.getTareas());
		
		System.out.println(Jose.getInforme());*/
		
		AlumnoPersonas Mar�a = contexto.getBean("MisAlumnos", AlumnoPersonas.class);

		System.out.println("Las tareas del alumno ser�an: " + Mar�a.getTareas());
		System.out.println(Mar�a.getInforme());
		System.out.println("Edad: " + Mar�a.getEdad());
		contexto.close();

	}
}
