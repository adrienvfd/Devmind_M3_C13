package exercise.curs13.convertor;


import exercise.curs13.dto.MathDto;
import exercise.curs13.entity.MathEntity;
import exercise.curs13.enums.OperationEnum;
import exercise.curs13.exception.MathCustomException;

import java.util.Arrays;

public class MathConvertor {

    public static MathEntity toEntity(MathDto mathDto) throws IllegalArgumentException {
        if (mathDto == null) {
            return null;
        }
        if (Arrays.stream(OperationEnum.values()).anyMatch(operationEnum -> operationEnum.toString().equalsIgnoreCase(mathDto.getOperation()))) {
            return MathEntity.builder()
                    .firstNumber(mathDto.getFirstNumber())
                    .secondNumber(mathDto.getSecondNumber())
                    .operation(OperationEnum.valueOf(mathDto.getOperation()))
                    .build();
        } else {
            throw new MathCustomException("Invalid operation");
        }
    }
}
