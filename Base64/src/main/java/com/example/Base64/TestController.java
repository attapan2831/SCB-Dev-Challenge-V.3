package com.example.Base64;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping
public class TestController {

    @Autowired
    private FilebaseService filebaseService;

    @Autowired
    private TestWorkflow testWorkflow;

    @RequestMapping(value = { "/testbase64" }, method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<String> home(@RequestBody String funnyStr ) {

        String funnyStr2 =  testWorkflow.getDecodeBase64(funnyStr);

        return new ResponseEntity<String>(funnyStr2, HttpStatus.OK);
    }

}