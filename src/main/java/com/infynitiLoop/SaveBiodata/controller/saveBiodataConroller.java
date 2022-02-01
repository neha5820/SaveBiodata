package com.infynitiLoop.SaveBiodata.controller;


import com.infynitiLoop.SaveBiodata.service.saveBiodataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/savingData")
public class saveBiodataConroller {

    @Autowired
    saveBiodataService service;

  //  @RequestMapping(value = "/getAll", method = RequestMethod.GET)
//    public ResponseEntity<RegistrationResponse> getList(HttpServletRequest request)
//    {
//
//        //Optional<VehicleRegistrationService> records = service.getRegistrations();
//        List<Registrations> records = service.getRegistrations();
//        //List<Insurer> recordsInsurer = service.getRegistrations();
//        RegistrationResponse registrationResponse = new RegistrationResponse();
//        registrationResponse.setRegistrationsList(records);
//
//        return new ResponseEntity(registrationResponse, HttpStatus.OK);
//
//    }
}
