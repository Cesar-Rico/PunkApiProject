package com.punk.punkApiProject.beer;

public interface BeerService {
    /**Beer services**/
    String getAllBeersAPI();

    String searchBeersByNameAPI(String name);
    String randomBeerAPI();

}
