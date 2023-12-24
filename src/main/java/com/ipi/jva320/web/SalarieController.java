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
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class SalarieController {

    @Autowired
    SalarieAideADomicileService salarieAideADomicileService;
    @Autowired
    private MessageSource messageSource;

    /**
     * Liste des Salariés
     * ------------------
     * @param page int
     * @param size int
     * @param sortProperty string
     * @param sortDirection string
     * @param matricule string
     * @param model ModelMap
     * @return HTML
     */
    @GetMapping("/salaries")
    public String getSalariesList(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size,
        @RequestParam(defaultValue = "id") String sortProperty,
        @RequestParam(defaultValue = "ASC") String sortDirection,
        @RequestParam(defaultValue = "") String matricule,
        @RequestParam(defaultValue = "false") String saved,
        @RequestParam(defaultValue = "false") String deleted,
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
        model.put("saved", saved);
        model.put("deleted", deleted);

        return "list";
    }

    /**
     * Détail d'un Salarié
     * -------------------
     * @param model ModelMap
     * @param id long
     * @return HTML
     */
    @GetMapping("/salaries/{id}")
    public String getSalaries(final ModelMap model, @PathVariable long id) {

        SalarieAideADomicile salarie = salarieAideADomicileService.getSalarie(id);
        model.put("salarie", salarie);

        Object[] params = {salarie.getId()};
        String msgSalarie = messageSource.getMessage("msg.salarie", params, LocaleContextHolder.getLocale());
        model.put("msgSalarie", msgSalarie);

        return "detail_Salarie";
    }

    /**
     * Suppression d'un salarié
     * @param model ModelMap
     * @param id Long
     * @return HTML
     * @throws SalarieException error
     */
    @PostMapping("/salaries/{id}/delete")
    public String deleteSalarie(final ModelMap model, @PathVariable long id) throws SalarieException {
        SalarieAideADomicile salarie = salarieAideADomicileService.getSalarie(id);
        Object[] params = {salarie.getId()};
        String msgSalarie = messageSource.getMessage("msg.salarie", params, LocaleContextHolder.getLocale());
        try {
            salarieAideADomicileService.deleteSalarieAideADomicile(id);
            return "redirect:/salaries?deleted=true";
        } catch (SalarieException e){
            model.put("isError", e.getMessage());
            model.put("needConfirm", true);
            model.put("salarie", salarie);
            model.put("msgSalarie", msgSalarie);
            return "detail_Salarie";
        }
    }

    /**
     * Modifie ou Créé un Salarié
     * @param salarie SalarieAideDomicile
     * @param model ModelMap
     * @return HTML
     */
    @PostMapping("/salaries/save")
    public String saveSalarie(@ModelAttribute SalarieAideADomicile salarie, final ModelMap model) throws SalarieException {
        String isError = "";
        if (salarie.getId() != null){ // Si ID existante, alors UPDATE
            try {
                salarieAideADomicileService.updateSalarieAideADomicile(salarie);
            } catch (SalarieException e){
                isError = e.getMessage();
            }
        } else { // Si ID non-existante, alors CREATE
            try {
                salarieAideADomicileService.creerSalarieAideADomicile(salarie);
            } catch (SalarieException e){
                isError = e.getMessage();
            }
        }
        if (!Objects.equals(isError, "")){
            model.put("isError", isError);
            model.put("salarie", salarie);
            Object[] params = {salarie.getId()};
            String msgSalarie = messageSource.getMessage("msg.salarie", params, LocaleContextHolder.getLocale());
            model.put("msgSalarie", msgSalarie);
            return "detail_Salarie";
        } else {
            return "redirect:/salaries?saved=true";
        }
    }

    /**
     * Route pour le formulaire de création d'un Salarié
     * @param model MpoelMap
     * @return HTML
     */
    @GetMapping("salaries/new")
    public String createSalarie(final ModelMap model){
        model.put("msgSalarie", messageSource.getMessage("msg.salarie_new", null, LocaleContextHolder.getLocale()));

        SalarieAideADomicile salarie = new SalarieAideADomicile();
        salarie.setMoisEnCours(LocalDate.now());
        salarie.setMoisDebutContrat(LocalDate.now());
        model.put("salarie", salarie);

        return "detail_Salarie";
    }

}



/*
@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class SalarieInvalideException() extends Exception{

}
*/
