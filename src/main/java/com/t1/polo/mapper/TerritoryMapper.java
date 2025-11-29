package com.t1.polo.mapper;

import com.t1.polo.dto.TerritoryDTO;
import com.t1.polo.models.TerritoryEntity;

public class TerritoryMapper {

    public static TerritoryEntity toEntity(TerritoryDTO dto) {

        TerritoryEntity entity = new TerritoryEntity();
        entity.setTerritoryID(dto.getTerritoryID());
        entity.setTerritoryName(dto.getTerritoryName());
        entity.setCountryRegionCode(dto.getCountryRegionCode());
        entity.setTerritoryGroup(dto.getTerritoryGroup());
        entity.setSalesYTD(dto.getSalesYTD());
        entity.setModifiedDate(dto.getModifiedDate());

        return entity;
    }

    public static TerritoryDTO toDTO(TerritoryEntity entity) {

        TerritoryDTO dto = new TerritoryDTO();

        dto.setTerritoryID(entity.getTerritoryID());
        dto.setTerritoryName(entity.getTerritoryName());
        dto.setTerritoryGroup(entity.getTerritoryGroup());
        dto.setSalesYTD(entity.getSalesYTD());
        dto.setCountryRegionCode(entity.getCountryRegionCode());
        dto.setModifiedDate(entity.getModifiedDate());

        return dto;
    }

}
