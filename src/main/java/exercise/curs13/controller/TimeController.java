package exercise.curs13.controller;

import exercise.curs13.enums.TimeZoneEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
public class TimeController {

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public String getTime(TimeZoneEnum timeZone) {
        return LocalDateTime.now(ZoneId.of(timeZone.getTimeZone())).toString();
    }
}
