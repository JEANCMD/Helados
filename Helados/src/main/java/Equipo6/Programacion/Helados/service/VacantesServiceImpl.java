package Equipo6.Programacion.Helados.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import Equipo6.Programacion.Helados.model.Vacante;


@Service
public class VacantesServiceImpl implements IVacantesService {

	
	private List<Vacante> lista = null;
	
	
	
	public VacantesServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Vacante>();
		try {
			
			Vacante vacante1 = new Vacante();
				vacante1.setId(1);
				vacante1.setNombre("Helado Fruit cocktail");
				vacante1.setDescripcion("Helado con frutas tropicales.");
				vacante1.setFecha(sdf.parse("08-05-2022"));
				vacante1.setCosto(50.00);
				vacante1.setDestacado(1);
				vacante1.setImagen("Helado1.jpg");
				
			Vacante vacante2 = new Vacante();
				vacante2.setId(2);
				vacante2.setNombre("Helado Strawberry and cocoa star");
				vacante2.setDescripcion("Helado de cocoa y chocolate.");
				vacante2.setFecha(sdf.parse("09-06-2022"));
				vacante2.setCosto(60.00);
				vacante2.setDestacado(0);
				vacante2.setImagen("Helado2.jpg");
				
				

			Vacante vacante3 = new Vacante();
				vacante3.setId(3);
				vacante3.setNombre("Helado Super spark bomb");
				vacante3.setDescripcion("Helado con chispas de colores.");
				vacante3.setFecha(sdf.parse("10-07-2022"));
				vacante3.setCosto(40.00);
				vacante3.setDestacado(0);
				vacante3.setImagen("Helado3.jpg");
				
			Vacante vacante4 = new Vacante();
				vacante4.setId(4);
				vacante4.setNombre("Helado Coral ratf ");
				vacante4.setDescripcion("Helado de chocolate y nueces con galleta.");
				vacante4.setFecha(sdf.parse("11-08-2022"));
				vacante4.setCosto(70.00);
				vacante4.setDestacado(1);
				vacante4.setImagen("Helado4.jpg");
				
				
				
				
				
				lista.add(vacante1);
				lista.add(vacante2);
				lista.add(vacante3);
				lista.add(vacante4);
				
		} catch (ParseException e) {
			
				System.out.println("Error: "+ e.getMessage());
		}
		
	}
	
	
	
	
	@Override
	public List<Vacante> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}




	@Override
	public Vacante buscarPorId(Integer idVacante) {
		
		for (Vacante v : lista ) {
			if(v.getId()==idVacante) {
				return v;
			}
		}
		
		
		return null;
	}




	@Override
	public void guardar(Vacante vacante) {
		lista.add(vacante);
		
	}

}
