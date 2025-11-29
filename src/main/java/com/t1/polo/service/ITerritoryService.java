package com.t1.polo.service;

import java.util.List;

import com.t1.polo.dto.TerritoryDTO;

public interface ITerritoryService {
	
	List<TerritoryDTO> listado();
	
	TerritoryDTO obtenerxCodigo(Integer codigo);
	
	TerritoryDTO registrar(TerritoryDTO dto);
	
	TerritoryDTO actualizar(Integer codigo, TerritoryDTO dto);
	
	void eliminar(Integer codigo);
}
