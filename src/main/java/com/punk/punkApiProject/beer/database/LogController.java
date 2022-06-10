package com.punk.punkApiProject.beer.database;

import com.punk.punkApiProject.beer.BeerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/log")
public class LogController {

    private final LogService logService;

    public LogController(LogService logService){
        this.logService = logService;
    }

    /** End point to list the database logs **/
    @GetMapping
    public ResponseEntity<ArrayList<LogModel>> getLogs(){
        return ResponseEntity.ok(logService.getLogs());
    }

}
