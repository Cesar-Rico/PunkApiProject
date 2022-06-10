package com.punk.punkApiProject.beer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beers")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService){
        this.beerService = beerService;
    }

    /** List all beers from punkapi **/
    @GetMapping
    public ResponseEntity<String> getBeers(){
        return ResponseEntity.ok(beerService.getAllBeersAPI());
    }

    /** Search a beer from punkapi **/
    @GetMapping("/search")
    public ResponseEntity<String> searchBeers(@RequestParam String beerName){
        return ResponseEntity.ok(beerService.searchBeersByNameAPI(beerName));
    }

    /** Get a random beer from punkapi **/
    @GetMapping("/random")
    public ResponseEntity<String> randomBeer(){
        return ResponseEntity.ok(beerService.randomBeerAPI());
    }
}
