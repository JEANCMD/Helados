package Equipo6.Programacion.Helados.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Equipo6.Programacion.Helados.model.Vacante;
import Equipo6.Programacion.Helados.service.IVacantesService;

@Controller
public class HomeController {
	
		@Autowired
		private IVacantesService serviceVacantes;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Vacante> lista= serviceVacantes.buscarTodas();
		model.addAttribute("vacantes", lista);
		
		return "tabla";
		
	}

	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante =new Vacante();
		vacante.setNombre("Helado1");
		vacante.setDescripcion("....");
		vacante.setFecha(new Date());
		vacante.setCosto(0.0);
		model.addAttribute("vacante", vacante);
		return "detalle";
		
	}
	
	
	
	

	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Helado 1");
		lista.add("Helado 2");
		lista.add("Helado 3");
		lista.add("Helado 4");
		
		model.addAttribute("helados", lista);
		
		return "listado";
	}
		
	
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		List<Vacante> lista= serviceVacantes.buscarTodas();
		model.addAttribute("vacantes", lista);
		return "home";
	    }	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


