package com.rest.RestService.service;

import com.rest.RestService.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallingService {

    @Autowired
    RestTemplate restTemplate;

    public Employee callHelloWorld(int empId) {
        String url = "http://localhost:9090/hello/" + empId;
        return restTemplate.getForObject(
                url, Employee.class);
    }
}
