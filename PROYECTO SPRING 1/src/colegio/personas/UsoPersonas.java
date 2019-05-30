package colegio.personas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoPersonas {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		Personas Jorge = contexto.getBean("MiPersona", Personas.class);
		
		System.out.println(Jorge.getTareas());
		
		contexto.close();

	}
}
