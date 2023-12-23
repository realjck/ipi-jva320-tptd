package com.ipi.jva320.service;

import com.ipi.jva320.model.SalarieAideADomicile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Ajoute des données de test si vide au démarrage
 */
@Component
public class DataInitService implements CommandLineRunner {

    @Autowired
    private SalarieAideADomicileService salarieAideADomicileService;

    @Override
    public void run(String... argv) throws Exception {

        if (this.salarieAideADomicileService.countSalaries() != 0) {
            return;
        }

        SalarieAideADomicile s1 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Johnny Doe", LocalDate.parse("2010-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s2 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Alessio Rossi", LocalDate.parse("2015-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s3 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Basma Hassan", LocalDate.parse("2018-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s4 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Chen Wei", LocalDate.parse("2012-06-15"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s5 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Dalia Abadi", LocalDate.parse("2007-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s6 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Elodie Lefèvre", LocalDate.parse("2008-09-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s7 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Farida Khalil", LocalDate.parse("2016-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s8 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Gabriela Santos", LocalDate.parse("2012-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s9 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Hiroshi Tanaka", LocalDate.parse("2010-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s10 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ingrid Larsson", LocalDate.parse("2014-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s11 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Jamal Aziz", LocalDate.parse("2006-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s12 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Kang Min", LocalDate.parse("2011-08-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s13 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Megan Thomas", LocalDate.parse("2009-10-03"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s14 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Natasha Popova", LocalDate.parse("2016-12-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s15 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Omar Sharif", LocalDate.parse("2014-08-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s16 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Priya Patel", LocalDate.parse("2009-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s17 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Qi Wang", LocalDate.parse("2011-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s18 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Rafael Oliveira", LocalDate.parse("2017-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s19 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Sakura Yamamoto", LocalDate.parse("2019-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s20 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Thiago Costa", LocalDate.parse("2020-07-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s21 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ulyana Petrova", LocalDate.parse("2022-09-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s22 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Viktor Kuznetsov", LocalDate.parse("2016-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s23 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Wen Liu", LocalDate.parse("2017-08-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s24 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Xia Zhang", LocalDate.parse("2007-12-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s25 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Yasmin Ali", LocalDate.parse("2009-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s26 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Zara Khan", LocalDate.parse("2012-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s27 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ahmed Al-Mansoori", LocalDate.parse("2014-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s28 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Chahinis Monroe", LocalDate.parse("2022-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));

    }
}
