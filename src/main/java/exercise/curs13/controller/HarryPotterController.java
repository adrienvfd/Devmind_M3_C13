package exercise.curs13.controller;

import exercise.curs13.service.HarryPotterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HarryPotterController {

    private final HarryPotterService harryPotterService;
    @GetMapping("/harry-potter")
    public String getHarryPotter() {
        return harryPotterService.getRandomHarryPotterCharacter();
    }
}
