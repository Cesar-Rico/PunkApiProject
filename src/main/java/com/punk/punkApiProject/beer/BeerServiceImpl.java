package com.punk.punkApiProject.beer;

import com.punk.punkApiProject.beer.database.LogModel;
import com.punk.punkApiProject.beer.database.LogService;
import com.punk.punkApiProject.beer.exception.ApiUnexpectedBehaviorException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class BeerServiceImpl implements BeerService{
    @Value("${endpoint_punkapi}")
    private String baseUrl;
    private RestTemplate restTemplate;
    private LogService logService;
    private long startTime;
    private long stopTime;


    public BeerServiceImpl(LogService logService) throws ParseException {
        restTemplate = new RestTemplate();
        this.logService = logService;
    }

    /** Implementation of get all beers service **/
    @Override
    public String getAllBeersAPI() {
        try{
            startTime = System.nanoTime();
            String result = restTemplate.getForObject(baseUrl, String.class);
            stopTime = System.nanoTime();

            LogModel log = new LogModel("getAllBeersAPI", new Date(), stopTime-startTime);
            logService.registerLog(log);
            return result;
        } catch (Exception e) {
            throw new ApiUnexpectedBehaviorException(e.getMessage());
        }

    }

    /** Implementation of search beer by name **/
    @Override
    public String searchBeersByNameAPI(String name) {
        try {
            startTime = System.nanoTime();
            String url = baseUrl + "?beer_name=" + name;
            String result = restTemplate.getForObject(url, String.class);
            stopTime = System.nanoTime();
            LogModel log = new LogModel("searchBeersByNameAPI", new Date(), stopTime - startTime);
            logService.registerLog(log);
            return result;
        } catch (Exception e) {
            throw new ApiUnexpectedBehaviorException(e.getMessage());
        }
    }

    /** Implementation of get a random beer **/
    @Override
    public String randomBeerAPI() {
        try{
            startTime = System.nanoTime();
            String url = baseUrl + "/random";
            String result= restTemplate.getForObject(url, String.class);
            stopTime = System.nanoTime();
            LogModel log = new LogModel("randomBeerAPI", new Date(), stopTime-startTime);
            logService.registerLog(log);
            return result;
        } catch (Exception e) {
            throw new ApiUnexpectedBehaviorException(e.getMessage());
        }
    }
}
