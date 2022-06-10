package com.punk.punkApiProject.beer.database;

import java.util.ArrayList;

public interface LogService {
    /** Services for logs**/
    public int registerLog(LogModel log);

    public ArrayList<LogModel> getLogs();
}
