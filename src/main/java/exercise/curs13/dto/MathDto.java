package exercise.curs13.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MathDto {
    private Double firstNumber;
    private Double secondNumber;
    private String operation;
}
