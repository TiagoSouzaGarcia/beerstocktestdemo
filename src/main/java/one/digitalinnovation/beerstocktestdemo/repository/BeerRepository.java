package one.digitalinnovation.beerstocktestdemo.repository;

import one.digitalinnovation.beerstocktestdemo.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
