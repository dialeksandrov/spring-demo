package kg.megalab.springdemo.service;

import kg.megalab.springdemo.model.cats.CatResponse;

import java.util.List;

public interface CatService {

    List<CatResponse> getCats();
}
