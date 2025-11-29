package com.t1.polo.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Territory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TerritoryEntity {

	@Id
	private Integer territoryID;
	@Column(length = 50, nullable = false)
	private String TerritoryName;
	@Column(length = 3, nullable = false)
	private String countryRegionCode;
	@Column(length = 50, nullable = false)
	private String territoryGroup;
	@Column(nullable = false)
	private float salesYTD;
	@Column(unique = true, nullable = false)
	private Date modifiedDate;
	
}
