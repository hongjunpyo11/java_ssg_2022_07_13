package com.ll.exam;

public class WiseSayingTable {
    private String baseDir;

    public WiseSayingTable(String baseDir) {
        this.baseDir = baseDir;
    }

    public void save(WiseSaying wiseSaying) {
        Util.file.mkdir("%s/wise_saying".formatted(baseDir));
        String body = "내용";
        Util.file.saveToFile("%s/wise_saying/%d.json".formatted(baseDir, wiseSaying.id), body);
    }
}