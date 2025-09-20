package com.praneeth.demoApplication.DBService;

import com.praneeth.demoApplication.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class DbService {
    @Autowired
    private DB db;


   public String getData(){
       return db.getData();
    }
}
