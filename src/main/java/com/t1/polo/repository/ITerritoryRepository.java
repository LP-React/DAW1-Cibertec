package com.t1.polo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t1.polo.models.TerritoryEntity;

public interface ITerritoryRepository extends JpaRepository<TerritoryEntity, Integer> {

}
