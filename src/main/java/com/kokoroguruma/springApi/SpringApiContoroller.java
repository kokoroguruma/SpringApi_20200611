package com.kokoroguruma.springApi;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringApiContoroller {

    @RequestMapping(value = "/api/testApi01")
    public Object testApi01() {

        HashMap<String, String> mapData = new HashMap<String, String>();
        mapData.put("key01", "data01");


        return mapData;
    }

}
