package com.t1.polo.mapper;

import com.t1.polo.dto.TerritoryDTO;
import com.t1.polo.models.TerritoryEntity;

public class TerritoryMapper {

	public static TerritoryEntity toEntity(TerritoryDTO dto) {
		
		TerritoryEntity entity = new TerritoryEntity();
		entity.setTerritoryID(dto.getTerritoryID());
		entity.setName(dto.getName());
		entity.setCountryRegionCode(dto.getCountryRegionCode());
		entity.setGroup(dto.getGroup());
		entity.setSalesYTD(dto.getSalesYTD());
		entity.setModifiedDate(dto.getModifiedDate());
		
		return entity;
	}
	
	public static TerritoryDTO toDTO(TerritoryEntity entity) {
		
		TerritoryDTO dto = new TerritoryDTO();
		
		entity.setTerritoryID(dto.getTerritoryID());
		entity.setName(dto.getName());
		entity.setCountryRegionCode(dto.getCountryRegionCode());
		entity.setGroup(dto.getGroup());
		entity.setSalesYTD(dto.getSalesYTD());
		entity.setModifiedDate(dto.getModifiedDate());
		
		return dto;
	}
	
}
