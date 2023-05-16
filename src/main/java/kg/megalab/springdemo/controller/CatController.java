package kg.megalab.springdemo.controller;

import kg.megalab.springdemo.model.RestResponse;
import kg.megalab.springdemo.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCats() {
        try {
            return new ResponseEntity<>(new RestResponse<>().success(catService.getCats()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new RestResponse<>().error("List is empty"), HttpStatus.NO_CONTENT);
        }
    }
}
