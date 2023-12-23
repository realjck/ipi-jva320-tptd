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
        SalarieAideADomicile s6 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Elodie Lefèvre", LocalDate.parse("2008-09-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s7 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Farida Khalil", LocalDate.parse("2016-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s14 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Natasha Popova", LocalDate.parse("2016-12-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s8 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Gabriela Santos", LocalDate.parse("2012-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s2 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Alessio Rossi", LocalDate.parse("2015-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s22 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Viktor Kuznetsov", LocalDate.parse("2016-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s10 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ingrid Larsson", LocalDate.parse("2014-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s9 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Hiroshi Tanaka", LocalDate.parse("2010-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s13 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Megan Thomas", LocalDate.parse("2009-10-03"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s4 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Chen Wei", LocalDate.parse("2012-06-15"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s11 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Jamal Aziz", LocalDate.parse("2006-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s26 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Zara Khan", LocalDate.parse("2012-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s5 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Dalia Abadi", LocalDate.parse("2007-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s19 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Sakura Yamamoto", LocalDate.parse("2019-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s23 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Wen Liu", LocalDate.parse("2017-08-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s12 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Kang Min", LocalDate.parse("2011-08-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s15 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Omar Sharif", LocalDate.parse("2014-08-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s16 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Priya Patel", LocalDate.parse("2009-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s17 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Qi Wang", LocalDate.parse("2011-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s21 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ulyana Petrova", LocalDate.parse("2022-09-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s24 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Xia Zhang", LocalDate.parse("2007-12-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s20 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Thiago Costa", LocalDate.parse("2020-07-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s3 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Basma Hassan", LocalDate.parse("2018-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s18 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Rafael Oliveira", LocalDate.parse("2017-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s25 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Yasmin Ali", LocalDate.parse("2009-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s27 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ahmed Al-Mansoori", LocalDate.parse("2014-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s28 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Chahinis Monroe", LocalDate.parse("2022-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s29 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Trevor Cooper", LocalDate.parse("2013-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s30 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Sophie Martin", LocalDate.parse("2015-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s31 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Nathan Cooper", LocalDate.parse("2018-06-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s32 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Isabella Thompson", LocalDate.parse("2019-07-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s33 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ethan Adams", LocalDate.parse("2016-11-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s34 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Zoe Turner", LocalDate.parse("2012-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s35 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Lucas Rodriguez", LocalDate.parse("2014-09-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s36 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ava Martinez", LocalDate.parse("2011-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s37 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Max Wilson", LocalDate.parse("2013-12-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s38 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Sophia Smith", LocalDate.parse("2017-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s39 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Liam Johnson", LocalDate.parse("2015-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s40 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Emma Davis", LocalDate.parse("2018-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s41 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Logan Miller", LocalDate.parse("2017-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s42 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Olivia Clark", LocalDate.parse("2019-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s43 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Mia Harris", LocalDate.parse("2012-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s44 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Noah Anderson", LocalDate.parse("2007-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s45 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Oliver Thomas", LocalDate.parse("2018-11-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s46 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Charlotte Turner", LocalDate.parse("2016-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s47 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Elijah Adams", LocalDate.parse("2013-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s48 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Amelia Turner", LocalDate.parse("2012-07-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s49 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Daniel Rodriguez", LocalDate.parse("2014-06-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s50 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Abigail Martin", LocalDate.parse("2015-09-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s51 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Christopher Cooper", LocalDate.parse("2016-12-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s52 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Victoria Turner", LocalDate.parse("2017-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s53 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("James Rodriguez", LocalDate.parse("2018-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s54 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Hannah Smith", LocalDate.parse("2019-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s55 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("William Adams", LocalDate.parse("2020-06-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s56 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Grace Turner", LocalDate.parse("2021-07-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s57 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Daniel Rodriguez", LocalDate.parse("2022-08-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s58 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Roberta Palmeraie", LocalDate.parse("2023-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s59 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Jackson Cooper", LocalDate.parse("2021-10-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s60 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Lily Turner", LocalDate.parse("2019-11-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s61 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Aiden Rodriguez", LocalDate.parse("2018-12-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s62 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ella Smith", LocalDate.parse("2017-01-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s63 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Mason Adams", LocalDate.parse("2016-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s64 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Aria Turner", LocalDate.parse("2015-03-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s65 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Ethan Rodriguez", LocalDate.parse("2014-04-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s66 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Isabella Smith", LocalDate.parse("2013-05-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s67 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Lucas Adams", LocalDate.parse("2012-06-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s68 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Robert Spongemann", LocalDate.parse("2002-06-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s69 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Maria Krasky", LocalDate.parse("2002-07-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s70 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Bob Lansky", LocalDate.parse("2012-06-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s71 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Samantha Leoni", LocalDate.parse("2012-06-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s72 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Samuel WurstBerg", LocalDate.parse("2023-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s73 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Clément Molo", LocalDate.parse("2023-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s74 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Léonie Piémonte", LocalDate.parse("2023-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s75 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Sandra Laquat", LocalDate.parse("2023-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
        SalarieAideADomicile s76 = this.salarieAideADomicileService.creerSalarieAideADomicile(new SalarieAideADomicile("Hypérion Bazerne", LocalDate.parse("2023-02-01"), LocalDate.now(), 200, 20, 180, 20, 18));
    }
}
