package kg.megalab.springdemo.service.impl;

import kg.megalab.springdemo.exception.EmptyListException;
import kg.megalab.springdemo.service.StorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service("storageService")
@RequiredArgsConstructor
public class StorageServiceImpl implements StorageService {

    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        if (list.isEmpty()) {
            throw new EmptyListException("empty.list");
        }
        return list;
    }

    public void addToList(String str) {
        if (isExist(str)) {
            log.error("String {} is already exist", str);
            return;
        }
        list.add(str);
        log.info("String {} added to list", str);
    }

    public boolean deleteStringFromList(String str) {
        if (!isExist(str)) {
            log.error("String {} not exist in list", str);
            return false;
        }
        boolean isDeleted = list.remove(str);
        log.info("String {} deleted from list", str);
        return isDeleted;
    }

    public boolean isExistInList(String str) {
        return isExist(str);
    }

    private boolean isExist(String str) {
        return list.contains(str);
    }
}
