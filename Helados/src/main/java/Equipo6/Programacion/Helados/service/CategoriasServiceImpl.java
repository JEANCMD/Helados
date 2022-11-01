package Equipo6.Programacion.Helados.service;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import Equipo6.Programacion.Helados.model.Categoria;

@Service
public class CategoriasServiceImpl implements ICategoriasService{

	private List<Categoria> lista = null;
	
	public CategoriasServiceImpl() {
		lista = new LinkedList<Categoria>();
		
		// Creamos algunas Categorias para poblar la lista ...
		
		// Categoria 1
		Categoria cat1 = new Categoria();
		cat1.setId(1);
		cat1.setNombre("Helado crema");
		cat1.setDescripcion("Crema de coco del sabor a tu gusto");
		
		// Categoria 2
		Categoria cat2 = new Categoria();
		cat2.setId(2);
		cat2.setNombre("Helado de leche");
		cat2.setDescripcion("Leche con lactosa y sin lactosa a tu gusto");
		
					
		// Categoria 3
		Categoria cat3 = new Categoria();
		cat3.setId(3);
		cat3.setNombre("Helado de Fruta");
		cat3.setDescripcion("Helado con trozos de fruta alrededor y adentro");
		
		// Categoria 4
		Categoria cat4 = new Categoria();
		cat4.setId(4);
		cat4.setNombre("Bebida");
		cat4.setDescripcion("Licuados de frutas tropicales");
		
		// Categoria 5
		Categoria cat5 = new Categoria();
		cat5.setId(5);
		cat5.setNombre("Sorbete");
		cat5.setDescripcion("Helado con cono dulce de distintos tamaños ");
		
		// Categoria 6
		Categoria cat6 = new Categoria();
		cat6.setId(6);
		cat6.setNombre("Granizado");
		cat6.setDescripcion("Raspado del nectar del sabor que solicites");
		
		/**
		 * Agregamos los 5 objetos de tipo Categoria a la lista ...
		 */
		lista.add(cat1);			
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		lista.add(cat5);
		lista.add(cat6);

	}
	
	public void guardar(Categoria categoria) {		
		lista.add(categoria);
	}

	public List<Categoria> buscarTodas() {
		return lista;
	}

	public Categoria buscarPorId(Integer idCategoria) {			
		for (Categoria cat : lista) {
			if (cat.getId()==idCategoria) {
				return cat;
			}
		}		
		return null;	
	}

}
