package exercise.curs13.service;

import com.github.javafaker.Faker;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class HarryPotterService {
    private final Faker faker = new Faker();

    public String getRandomHarryPotterCharacter() {
        return faker.harryPotter().character();
    }
}
