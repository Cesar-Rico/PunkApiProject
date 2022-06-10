package com.punk.punkApiProject.beer.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Log")
@Getter
@Setter
public class LogModel {

    /** Log model to be able to save them **/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLog;

    private String consumedService;
    private Date executionDate;
    private Long executionTimeNanoSeconds;

    public LogModel(){
    }
    public LogModel(String consumedService, Date executionDate, Long executionTime){
        this.consumedService = consumedService;
        this.executionDate = executionDate;
        this.executionTimeNanoSeconds = executionTime;
    }
}
