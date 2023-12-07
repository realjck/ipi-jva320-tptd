package com.ipi.jva320.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/secu")
public class PatientController {
    @GetMapping(
            consumes = "application/json", // type MIME
            produces = "application/json", // type MIME
            value = "/patients"
    )
    public String getPatients(){
        return "";
    }
}
