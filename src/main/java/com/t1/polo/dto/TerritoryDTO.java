package com.t1.polo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TerritoryDTO {

	private Integer territoryID;
	
	private String territoryName;
	
	private String countryRegionCode;
	
	private String territoryGroup;
	
	private float salesYTD;
	
	private LocalDate modifiedDate;
	
}
