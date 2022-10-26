package Equipo6.Programacion.Helados.service;

import java.util.List;

import Equipo6.Programacion.Helados.model.Vacante;

public interface IVacantesService {

	
	
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer IdVacante); 
	void guardar(Vacante vacante);
	
}
