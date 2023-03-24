package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationController {

    /**
     * days - число отработанных дней, paycheck - з/п в месяц
     */
    @GetMapping("/vacation/{days}/{paycheck}")
    public Integer calcVacation(@PathVariable Integer days, @PathVariable Integer paycheck) {

        /**
         * з.п. умножается на 12 месяцев и делится на кол-во отработанных дней, таким образом получая
         * средний заработок в день, который после умножается на 28 дней отпуска, положенных по закону
         */
        Integer result = paycheck * 12 / days * 28;

        return result;
    }
}