package kg.megalab.springdemo.service.impl;

import kg.megalab.springdemo.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("testService")
public class StorageTestServiceImpl implements StorageService {

    @Override
    public String getCats() {
        return null;
    }

    @Override
    public List<String> getList() {
        return null;
    }

    @Override
    public void addToList(String str) {

    }

    @Override
    public boolean deleteStringFromList(String str) {
        return false;
    }

    @Override
    public boolean isExistInList(String str) {
        return false;
    }
}
