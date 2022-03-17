package com.desafiolatam.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticiaController {
	
		private final static Logger logger = LoggerFactory.getLogger(NoticiaController.class);	
		
		@RequestMapping("/")
		public String Main(Model modelo) {
			String nombre = "src/main/resources/static/noticias.txt";
			List<String> noticias = new ArrayList<String>();
			String [] n1 = new String[2];
			String [] n2 = new String[2];
			String [] n3 = new String[2];
			String [] n4 = new String[2];
			String [] n5 = new String[2];
			
			
			try {
				FileReader fr = new FileReader(nombre);
				BufferedReader br = new BufferedReader(fr);
				String data = br.readLine();
				while (data != null) {
					
					noticias.add(data);
				
					data = br.readLine();
				}
				
				
				br.close();
				fr.close();
			}catch(Exception e) {
				logger.error("No se pudo leer el archivo "+ nombre + ": " + e);
			}
			
			n1 = noticias.get(0).split("@@");
			n2 = noticias.get(2).split("@@");
			n3 = noticias.get(4).split("@@");
			n4 = noticias.get(6).split("@@");
			n5 = noticias.get(8).split("@@");
			
			logger.info("Las noticias están listas para ser desplegadas");
			
			
			modelo.addAttribute("titulo1",n1[0]);
			modelo.addAttribute("bajada1",n1[1]);
			modelo.addAttribute("imagen1",n1[2]);
			modelo.addAttribute("titulo2",n2[0]);
			modelo.addAttribute("bajada2",n2[1]);
			modelo.addAttribute("imagen2",n2[2]);
			modelo.addAttribute("titulo3",n3[0]);
			modelo.addAttribute("bajada3",n3[1]);
			modelo.addAttribute("imagen3",n3[2]);
			modelo.addAttribute("titulo4",n4[0]);
			modelo.addAttribute("bajada4",n4[1]);
			modelo.addAttribute("imagen4",n4[2]);
			modelo.addAttribute("titulo5",n5[0]);
			modelo.addAttribute("bajada5",n5[1]);
			modelo.addAttribute("imagen5",n5[2]);
			
	
			return "main";
		}
	

}
