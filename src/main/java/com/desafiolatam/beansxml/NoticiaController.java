package com.desafiolatam.beansxml;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticiaController {
	
		private final static Logger logger = LoggerFactory.getLogger(NoticiaController.class);	
		
		private static ApplicationContext appContext = new ClassPathXmlApplicationContext("com/desafiolatam/beansxml/beansnoticia.xml");
		
		@RequestMapping("/")
		public String Main(Model modelo) {
			
			
			logger.info("Las noticias están listas para ser desplegadas");
			
			
			Noticia n1 = appContext.getBean("Noticia1",Noticia.class);
			Noticia n2 = appContext.getBean("Noticia2",Noticia.class);
			Noticia n3 = appContext.getBean("Noticia3",Noticia.class);
			Noticia n4 = appContext.getBean("Noticia4",Noticia.class);
			Noticia n5 = appContext.getBean("Noticia5",Noticia.class);
			System.out.println(n1.toString());
			System.out.println(n2.toString());
			System.out.println(n3.toString());
			System.out.println(n4.toString());
			System.out.println(n5.toString());
			
			
			modelo.addAttribute("titulo1",n1.getTitulo());
			modelo.addAttribute("bajada1",n1.getBajada());
			modelo.addAttribute("imagen1",n1.getImagen());
			modelo.addAttribute("titulo2",n2.getTitulo());
			modelo.addAttribute("bajada2",n2.getBajada());
			modelo.addAttribute("imagen2",n2.getImagen());
			modelo.addAttribute("titulo3",n3.getTitulo());
			modelo.addAttribute("bajada3",n3.getBajada());
			modelo.addAttribute("imagen3",n3.getImagen());
			modelo.addAttribute("titulo4",n4.getTitulo());
			modelo.addAttribute("bajada4",n4.getBajada());
			modelo.addAttribute("imagen4",n4.getImagen());
			modelo.addAttribute("titulo5",n5.getTitulo());
			modelo.addAttribute("bajada5",n5.getBajada());
			modelo.addAttribute("imagen5",n5.getImagen());
			
			
			
	
			return "main";
		}
	

}
