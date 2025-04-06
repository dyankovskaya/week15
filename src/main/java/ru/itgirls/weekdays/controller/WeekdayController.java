package ru.itgirls.weekdays.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirls.weekdays.weekdayService.WeekdayService;


@RestController
public class WeekdayController {

    @GetMapping("/day")
    public String getRussianDay(@RequestParam String day) {
        return WeekdayService.getRussianWeekday(day);
    }
}

