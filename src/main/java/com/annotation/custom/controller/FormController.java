package com.annotation.custom.controller;

import com.annotation.custom.validators.ValidationError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.Duration;
import java.time.ZonedDateTime;

import static java.time.ZonedDateTime.now;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@Slf4j
public class FormController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public UserDetails loadFormPage() {
        return new UserDetails();
    }

    @RequestMapping(value = "/user",
            method = RequestMethod.POST,
            produces = APPLICATION_JSON_VALUE,
            consumes = APPLICATION_JSON_VALUE
    )
    public UserDetails submitForm(@Valid final UserDetails userDetails, final BindingResult result) {
        final ZonedDateTime start = now();

        if (result.hasErrors()) {
            //  return "formPage";
        }

        try {

        } finally {
            final long duration = Duration.between(start, now()).toMillis();
            log.info("duration: ", duration);
        }

        return userDetails;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationError> handleValidationErrors(final MethodArgumentNotValidException e) {


        return null;
    }
}
