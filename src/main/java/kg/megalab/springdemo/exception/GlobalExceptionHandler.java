package kg.megalab.springdemo.exception;

import kg.megalab.springdemo.service.MessageByLocaleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    private final MessageByLocaleService messageSource;

    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(EmptyListException exception) {
        log.error(messageSource.getMessage(exception.getMessage(), 1));
        return new ResponseEntity<>(messageSource.getMessage(exception.getMessage(), 1), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(RuntimeException e) {
        log.error(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
