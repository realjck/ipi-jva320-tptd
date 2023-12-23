package com.ipi.jva320.web;

import com.ipi.jva320.exception.SalarieException;
import com.ipi.jva320.model.SalarieAideADomicile;
import com.ipi.jva320.service.SalarieAideADomicileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.stream.Collectors;

@Controller
public class SalarieController {

    @Autowired
    SalarieAideADomicileService salarieAideADomicileService;
    @Autowired
    private MessageSource messageSource;
    @GetMapping("/salaries")
    public String getSalariesList(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size,
        @RequestParam(defaultValue = "id") String sortProperty,
        @RequestParam(defaultValue = "ASC") String sortDirection,
        @RequestParam(defaultValue = "") String matricule,
        final ModelMap model
    ){
        Sort.Direction direction = Sort.Direction.fromString(sortDirection);
        PageRequest pageRequest = PageRequest.of(page, size, direction, sortProperty);
        Page<SalarieAideADomicile> pageSalaries;
        // LA RECHERCHE A LIEU ICI :
        if (!matricule.isEmpty()) {
            pageSalaries = salarieAideADomicileService.getSalaries()
                .stream()
                .filter(salarie -> salarie.getNom().toLowerCase().contains(matricule.toLowerCase()))
                .collect(Collectors.collectingAndThen(Collectors.toList(), PageImpl::new));
        } else {
            pageSalaries = salarieAideADomicileService.getSalaries(pageRequest);
        }
        model.put("pageSalaries", pageSalaries);
        model.put("sortProperty", sortProperty);
        model.put("sortDirection", sortDirection);
        model.put("matricule", matricule);

        return "list";
    }
    @GetMapping("/salaries/{id}")
    public String getSalaries(final ModelMap model, @PathVariable long id) {

        SalarieAideADomicile salarie = salarieAideADomicileService.getSalarie(id);
        model.put("salarie", salarie);

        Object[] params = {salarie.getId(), salarie.getNom()};
        String msgSalarie = messageSource.getMessage("msg.salarie", params, LocaleContextHolder.getLocale());
        model.put("msgSalarie", msgSalarie);

        return "detail_Salarie";
    }
    @PostMapping("/salaries/save")
    public String modifySalarie(@ModelAttribute SalarieAideADomicile salarieAideADomicile, final ModelMap model) throws SalarieException {
        try {
            salarieAideADomicileService.updateSalarieAideADomicile(salarieAideADomicile);
        } catch (SalarieException e){
            salarieAideADomicileService.creerSalarieAideADomicile(salarieAideADomicile);
        }
        model.put("salarie", salarieAideADomicile);
        return "detail_Salarie";
    }
    @PostMapping("salaries/new")
    public void createSalarie(final ModelMap model){
        System.out.println(">>>>>>>>>>>>>> création");
    }

}



/*
@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class SalarieInvalideException() extends Exception{

}
*/
