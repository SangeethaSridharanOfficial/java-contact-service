package com.contactsApp.contacts_app.exceptions;
import com.contactsApp.contacts_app.models.APIErrorModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<APIErrorModel> handleValidationExceptions(MethodArgumentNotValidException ex) {
        log.info("coming here");
        APIErrorModel apiErrorModel = new APIErrorModel("Validation Error!");
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            apiErrorModel.addDetail(fieldName, errorMessage);
        });
        return new ResponseEntity<>(apiErrorModel, HttpStatus.BAD_REQUEST);
    }

}
