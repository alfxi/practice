package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VacationController {
    @GetMapping("/vacation/{days}/{paycheck}")

    public int calcVacation(@PathVariable int days, @PathVariable int paycheck) {
        //a - число отработанных дней, b - з/п в месяц

        int result = paycheck * 12 / days * 28;
        // з/п умножается на 12 месяцев и делится на кол-во отработанных дней, таким образом получая
        // средний заработок в день, который после умножается на 28 дней отпуска, положенных по закону

        return result;
    }
}
