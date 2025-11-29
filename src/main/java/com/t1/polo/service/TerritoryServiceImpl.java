package com.t1.polo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.t1.polo.dto.TerritoryDTO;
import com.t1.polo.mapper.TerritoryMapper;
import com.t1.polo.repository.ITerritoryRepository;

import lombok.Data;

@Service
@Data
public class TerritoryServiceImpl implements ITerritoryService{
	
	private final ITerritoryRepository repositorioTerritory;

	@Override
	public List<TerritoryDTO> listado() {
		// TODO Auto-generated method stub
		
		var listado = repositorioTerritory.findAll().stream().map(TerritoryMapper::toDTO).toList();
		
		return null;
	}

	@Override
	public TerritoryDTO obtenerxCodigo(Integer codigo) {
		
		var entity = repositorioTerritory.findById(codigo).orElse(null);
		
		return TerritoryMapper.toDTO(entity);
	}

	@Override
	public TerritoryDTO registrar(TerritoryDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TerritoryDTO actualizar(Integer codigo, TerritoryDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer codigo) {
		repositorioTerritory.deleteById(codigo);
	}


	
}
