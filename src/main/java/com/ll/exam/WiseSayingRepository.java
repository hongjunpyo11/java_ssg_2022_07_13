package com.ll.exam;

import java.util.List;

public class WiseSayingRepository {
    private WiseSayingTable wiseSayingTable;

    public WiseSayingRepository() {
        wiseSayingTable = new WiseSayingTable(App.getBaseDir());
    }

    public WiseSaying add(String content, String author) {
        return wiseSayingTable.save(content, author);
    }

    public List<WiseSaying> findAll() {
        return wiseSayingTable.findAll();
    }

    public WiseSaying findById(int id) {
        return wiseSayingTable.findById(id);
    }

    public boolean modify(int id, String content, String author) {
        return wiseSayingTable.save(id, content, author);
    }

    public boolean remove(int id) {
        return wiseSayingTable.removeById(id);
    }
}