package com.mengyi.designpatterns.visitor.complex;

import java.io.File;
import java.util.List;

public class TestComplexVisitor {
    public static void main(String[] args) {
        List<FileLevel> fileLevels = List.of(new FileLevel("abc"), new FileLevel("def"), new FileLevel("ghi"));
        DirectoryLevel directoryLevel = new DirectoryLevel();
        fileLevels.stream().forEach(fileLevel -> directoryLevel.addFile(fileLevel));
        StoreIterator storeIterator = new StoreIterator();
        List<Store> stores = List.of(directoryLevel, new FileLevel("123"), new FileLevel("456"));
        for (Store store : stores) {
            store.accept(storeIterator);
        }


    }
}
