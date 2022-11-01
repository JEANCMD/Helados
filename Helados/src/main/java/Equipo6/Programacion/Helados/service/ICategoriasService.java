package Equipo6.Programacion.Helados.service;

import java.util.List;

import Equipo6.Programacion.Helados.model.Categoria;

public interface ICategoriasService {
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);	
}