package com.Fundnesia.controller;

import com.Fundnesia.model.Loan;
import com.Fundnesia.service.LoanService;
import com.Fundnesia.service.LoanServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.ObjectWriter;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("TestSoal")
public class LoanResource {

    @Autowired
    KafkaTemplate<String, Loan> KafkaJsontemplate;
    String TOPIC_NAME = "TestTopic";
    
    @Autowired
    LoanService loanService;
   
    static Logger log = LoggerFactory.getLogger(LoanResource.class);
     
    
    @PostMapping(value = "/Insert",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> postJsonMessage(@RequestBody Loan att){	
    	Loan loanResult = loanService.calculate(att.getTenure(), att.getTicketSize());
    	KafkaJsontemplate.send(TOPIC_NAME, loanResult);
       return ResponseEntity.ok(loanResult);
    }
}






