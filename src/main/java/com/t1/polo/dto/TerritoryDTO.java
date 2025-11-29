package com.t1.polo.dto;

import java.sql.Date;

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
	
	private String name;
	
	private String countryRegionCode;
	
	private String group;
	
	private float salesYTD;
	
	private Date modifiedDate;
	
}
