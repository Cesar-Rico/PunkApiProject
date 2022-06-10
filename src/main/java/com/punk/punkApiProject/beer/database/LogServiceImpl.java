package com.punk.punkApiProject.beer.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LogServiceImpl implements LogService{
    /** Implemented services for logs**/
    @Autowired
    private LogRepository logRepository;

    @Override
    public int registerLog(LogModel log) {
        LogModel registeredLog = logRepository.save(log);
        return registeredLog.getIdLog();
    }

    @Override
    public ArrayList<LogModel> getLogs() {
        return (ArrayList)logRepository.findAll();
    }
}
