package exercise.curs13.controller;

import exercise.curs13.convertor.MathConvertor;
import exercise.curs13.dto.MathDto;
import exercise.curs13.dto.ResultDto;
import exercise.curs13.exception.MathCustomException;
import exercise.curs13.service.MathService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MathController {

    private final MathService mathService;

    @RequestMapping(value = "math-service", method = RequestMethod.POST)
    public ResultDto doMath(@RequestBody MathDto mathDto) throws MathCustomException {
        return ResultDto.builder()
                .result(mathService.doMath(MathConvertor.toEntity(mathDto)))
                .build();
    }
}
