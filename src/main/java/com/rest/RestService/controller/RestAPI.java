package com.rest.RestService.controller;

import com.rest.RestService.model.Employee;
import com.rest.RestService.service.CallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restapi/{empId}")
public class RestAPI {

    @Autowired
    CallingService callingService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Employee getEmployee(@PathVariable int empId) {
        return callingService.callHelloWorld(empId);
    }


}
