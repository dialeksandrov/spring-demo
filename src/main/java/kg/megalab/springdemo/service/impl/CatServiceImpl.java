package kg.megalab.springdemo.service.impl;

import kg.megalab.springdemo.model.cats.CatResponse;
import kg.megalab.springdemo.model.cats.Cats;
import kg.megalab.springdemo.service.CatService;
import kg.megalab.springdemo.service.StorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService {

    private final RestTemplate restTemplate;

    @Value("${cats.url}")
    private String catsUrl;

    public List<CatResponse> getCats() {
        ResponseEntity<Cats[]> response = restTemplate.exchange(catsUrl, HttpMethod.GET, null, Cats[].class);
        if (response != null && response.hasBody()) {
            return Arrays.stream(response.getBody()).map(CatResponse::new).collect(Collectors.toList());
        }
        return Collections.EMPTY_LIST;
    }
}
