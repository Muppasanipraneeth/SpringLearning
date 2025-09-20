package com.praneeth.demoApplication;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "production")
public class Prodb implements DB {

    @Override
    public String getData() {
        return "productiondb";
    }
}
