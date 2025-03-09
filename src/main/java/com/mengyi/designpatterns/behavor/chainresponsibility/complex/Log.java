package com.mengyi.designpatterns.behavor.chainresponsibility.complex;

public abstract class Log {
    protected Log nextLog;
    protected int level;
    public Log(Log log, int level){
        this.nextLog = log;
        this.level = level;
    }
    public void log(int level, String msg){
        if(this.level <= level){
            write(msg);
        }else if(nextLog != null){
            nextLog.log(level, msg);
        }
    }
    public abstract void write(String msg);
}
