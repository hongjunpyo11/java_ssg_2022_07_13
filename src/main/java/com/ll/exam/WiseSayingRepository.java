package com.ll.exam;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {
    private int wiseSayingsLastId;
    private List<WiseSaying> wiseSayings;

    public WiseSayingRepository() {
        wiseSayingsLastId = 0;
        wiseSayings = new ArrayList<>();
    }

    public WiseSaying add(String content, String author) {
        int id = ++wiseSayingsLastId;

        WiseSaying wiseSaying = new WiseSaying(id, content, author);

        wiseSayings.add(wiseSaying);

        return wiseSaying;
    }

    public List<WiseSaying> findAll() {
        return wiseSayings;
    }

    public WiseSaying findById(int id) {
        for (WiseSaying wiseSaying : wiseSayings) {
            if (wiseSaying.id == id) {
                return wiseSaying;
            }
        }

        return null;
    }

    public boolean modify(int id, String content, String author) {
        WiseSaying wiseSaying = findById(id);

        if (wiseSaying == null) {
            return false;
        }

        wiseSaying.content = content;
        wiseSaying.author = author;

        return true;
    }

    public boolean remove(int id) {
        WiseSaying wiseSaying = findById(id);

        if (wiseSaying == null) {
            return false;
        }

        wiseSayings.remove(wiseSaying);

        return true;
    }
}