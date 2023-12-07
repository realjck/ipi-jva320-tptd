package com.ipi.jva320.web;

import com.ipi.jva320.model.SalarieAideADomicile;
import com.ipi.jva320.service.SalarieAideADomicileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.logging.Logger;

//@ResponseStatus

@Controller
public class SalarieController {

    @Autowired
    SalarieAideADomicileService salarieAideADomicileService;
    @GetMapping(value = "/salaries/{id}")
    public String getSalaries(final ModelMap model, @PathVariable long id) {
        SalarieAideADomicile salarie = salarieAideADomicileService.getSalarie(id);
        model.put("salarie", salarie);
        return "detail_Salarie";
    }

    //@PostMapping(value = "/salaries/")

    @PostMapping(value = "/salaries/new")
    public String createSalarie() {
        return "detail_Salarie";
    }
}
/*
@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class SalarieInvalideException() extends Exception{

}
*/
