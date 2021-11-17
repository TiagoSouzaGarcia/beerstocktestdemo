package one.digitalinnovation.beerstocktestdemo.mapper;

import one.digitalinnovation.beerstocktestdemo.dto.BeerDTO;
import one.digitalinnovation.beerstocktestdemo.entity.Beer;
import org.mapstruct.factory.Mappers;

public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
