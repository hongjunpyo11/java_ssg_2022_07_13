package com.ll.exam;

import java.util.List;
import java.util.stream.Collectors;

public class WiseSayingService {

    private WiseSayingRepository wiseSayingRepository;

    public WiseSayingService() {
        wiseSayingRepository = new WiseSayingRepository();
    }

    public WiseSaying write(String content, String author) {
        return wiseSayingRepository.add(content, author);
    }

    public boolean modify(int id, String content, String author) {
        return wiseSayingRepository.modify(id, content, author);
    }

    public boolean remove(int id) {
        return wiseSayingRepository.remove(id);
        }

    public WiseSaying findById(int id) {
        return wiseSayingRepository.findById(id);
    }

    public List<WiseSaying> findAll() {
        return wiseSayingRepository.findAll();
    }

    public void dumpToJson() {
        List<WiseSaying> wiseSayings = wiseSayingRepository.findAll();

        String json = "[" + wiseSayings
                .stream()
                .map(wiseSaying -> wiseSaying.toJson())
                .collect(Collectors.joining(",")) + "]";

        Util.file.saveToFile("%s/data.json".formatted(App.getBaseDir()), json);
    }
}
