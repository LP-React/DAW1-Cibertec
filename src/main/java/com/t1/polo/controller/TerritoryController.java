package com.t1.polo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t1.polo.dto.TerritoryDTO;
import com.t1.polo.repository.ITerritoryRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/territory")
@Slf4j
@AllArgsConstructor
public class TerritoryController {
	private final ITerritoryRepository repository;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> buscarXId(@PathVariable Integer codigo){
		return ResponseEntity.ok(repository.findById(codigo));
	}
	
	
	@GetMapping("/ayuda")
	public String inicio() {
		log.info("Estas accediendo al endpoint ayuda");
		return "Erick Pariona";
	}
	
	// http://localhost:9090/api/alumno
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody TerritoryDTO terri){
		log.info("Solicitud de Territorio : {}" , terri.toString());
		log.info("Se esta accediendo al endpoint guardar");
		return ResponseEntity.ok(null);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<?> actualizar(
					@PathVariable Integer codigo,
					@RequestBody TerritoryDTO terri
			){
		log.info("Codigo recibido : {} - Datos : {}", codigo, 
								terri.toString());
		return ResponseEntity.ok(null);
	}
	
	@DeleteMapping("/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer codigo){
		
		if (codigo==100) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
	

}
