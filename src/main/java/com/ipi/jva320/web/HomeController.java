package com.ipi.jva320.web;
import com.ipi.jva320.service.SalarieAideADomicileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    SalarieAideADomicileService salarieAideADomicileService;
    @Autowired
    private MessageSource messageSource;
    @GetMapping(value = "/")
    public String home(final ModelMap model){
        Long nombreSalaries = salarieAideADomicileService.countSalaries();
        Object[] params = { nombreSalaries, (nombreSalaries > 1) ? "s" : "" };
        String msgHome = messageSource.getMessage("msg.home", params, LocaleContextHolder.getLocale());
        model.put("msgHome", msgHome);
        return "home";
    }
}
