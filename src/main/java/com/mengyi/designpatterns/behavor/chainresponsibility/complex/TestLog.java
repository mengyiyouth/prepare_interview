package com.mengyi.designpatterns.behavor.chainresponsibility.complex;

public class TestLog {
    private static final int LEVEL_DEBUG = 1;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_ERROR = 3;
    public static void main(String[] args) {
        DebugLevel debugLevel = new DebugLevel(null, LEVEL_DEBUG);
        InfoLevel infoLevel = new InfoLevel(debugLevel, LEVEL_INFO);
        ErrorLevel logger = new ErrorLevel(infoLevel, LEVEL_ERROR);

        logger.log(LEVEL_DEBUG, "debug");
        logger.log(LEVEL_INFO, "info");
        logger.log(LEVEL_ERROR, "error");
    }
}
