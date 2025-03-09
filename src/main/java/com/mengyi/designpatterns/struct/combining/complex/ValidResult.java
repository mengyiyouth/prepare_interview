package com.mengyi.designpatterns.struct.combining.complex;

public class ValidResult {
    private String result;
    private String msg;

    @Override
    public String toString() {
        return "ValidResult{" +
                "result='" + result + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ValidResult(String result, String msg){
        this.result = result;
        this.msg = msg;
    }

    public boolean isValid(){
        return "SUCCESS".equals(this.result);
    }

    public static ValidResult success()
    {
        ValidResult validResult = new ValidResult("SUCCESS", "validate passed");
        return validResult;
    }

    public static ValidResult fail(String result, String msg)
    {
        ValidResult validResult = new ValidResult(result, msg);
        return validResult;
    }
}
