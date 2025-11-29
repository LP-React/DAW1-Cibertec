package com.t1.polo.controller;

import java.time.LocalDate;
import java.util.List;

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
import com.t1.polo.models.TerritoryEntity;
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
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<?> buscarXId(@PathVariable Integer codigo) {
        return ResponseEntity.ok(repository.findById(codigo));
    }

    @GetMapping("/ayuda")
    public String inicio() {
        log.info("Estas accediendo al endpoint ayuda");
        return "Erick Pariona";
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody TerritoryDTO terri) {
        log.info("Solicitud de Territorio : {}", terri.toString());
        log.info("Se esta accediendo al endpoint guardar");
        return ResponseEntity.ok(null);
    }

@PostMapping("/seed")
public ResponseEntity<?> seed() {

    if (repository.count() > 0) {
        return ResponseEntity.badRequest().body("La tabla ya tiene datos. No se puede ejecutar seed.");
    }

    List<TerritoryEntity> lista = List.of(
            new TerritoryEntity(1, "North Zone", "USA", "Group A", 100000.50f, LocalDate.parse("2023-01-01")),
            new TerritoryEntity(2, "South Zone", "USA", "Group A", 150200.75f, LocalDate.parse("2023-01-02")),
            new TerritoryEntity(3, "East Zone", "USA", "Group B", 90000.00f, LocalDate.parse("2023-01-03")),
            new TerritoryEntity(4, "West Zone", "USA", "Group B", 120500.30f, LocalDate.parse("2023-01-04")),
            new TerritoryEntity(5, "Central Zone", "USA", "Group C", 50000.00f, LocalDate.parse("2023-01-05")),
            new TerritoryEntity(6, "Andes Region", "PER", "Group C", 45000.90f, LocalDate.parse("2023-01-06")),
            new TerritoryEntity(7, "Amazonas Region", "PER", "Group C", 30000.10f, LocalDate.parse("2023-01-07")),
            new TerritoryEntity(8, "Nordic Sector", "SWE", "Group D", 78000.00f, LocalDate.parse("2023-01-08")),
            new TerritoryEntity(9, "Iberic Sector", "ESP", "Group D", 88000.30f, LocalDate.parse("2023-01-09")),
            new TerritoryEntity(10, "Latin Sector", "MEX", "Group E", 99000.99f, LocalDate.parse("2023-01-10"))
    );

    repository.saveAll(lista);

    return ResponseEntity.ok("Seed ejecutado correctamente, 10 registros insertados.");
}


    @PutMapping("/{codigo}")
    public ResponseEntity<?> actualizar(
            @PathVariable Integer codigo,
            @RequestBody TerritoryDTO terri
    ) {
        log.info("Codigo recibido : {} - Datos : {}", codigo,
                terri.toString());
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer codigo) {

        if (codigo == 100) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
