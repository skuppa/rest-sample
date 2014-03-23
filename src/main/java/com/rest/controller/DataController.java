package com.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Sridharan Kuppa
 */
@RestController
@RequestMapping("/data")
public class DataController {
    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Map<String, String>> getAll() {
        return data;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Map<String, String> data) {
        String id = UUID.randomUUID().toString();
        this.data.put(id, data);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.POST)
    public void get(String id) {
        this.data.get(id);
    }
}
