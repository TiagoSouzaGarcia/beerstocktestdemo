package one.digitalinnovation.beerstocktestdemo.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.beerstocktestdemo.dto.BeerDTO;
import one.digitalinnovation.beerstocktestdemo.mapper.BeerMapper;
import one.digitalinnovation.beerstocktestdemo.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper = BeerMapper.INSTANCE;

    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException {

    }
}
