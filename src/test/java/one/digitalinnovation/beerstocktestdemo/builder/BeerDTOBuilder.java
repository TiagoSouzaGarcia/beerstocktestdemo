package one.digitalinnovation.beerstocktestdemo.builder;

import lombok.Builder;
import one.digitalinnovation.beerstocktestdemo.dto.BeerDTO;
import one.digitalinnovation.beerstocktestdemo.enums.BeerType;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Eisenbahn Weiss";

    @Builder.Default
    private String brand = "Eisenbahn";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.WEISS;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
