package com.mengyi.designpatterns.behavor.visitor.complex;

import java.util.ArrayList;
import java.util.List;

public class DirectoryLevel implements Store{
    private List<FileLevel> fileLevelList = new ArrayList<>();
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (FileLevel fileLevel : fileLevelList) {
            visitor.visit(fileLevel);
        }
    }

    public void addFile(FileLevel fileLevel) {
        fileLevelList.add(fileLevel);
    }
}
