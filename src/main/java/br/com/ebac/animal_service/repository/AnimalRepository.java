package br.com.ebac.animal_service.repository;

import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.enums.Especie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal>findAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL AND a.raca.especie = :especie")
    List<Animal> findAdoptedByEspecie(@Param("especie") Especie especie);
}