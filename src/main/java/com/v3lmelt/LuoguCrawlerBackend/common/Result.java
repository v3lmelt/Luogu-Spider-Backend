package com.v3lmelt.LuoguCrawlerBackend.common;
// 封装统一的返回数据结构
public class Result {
    private static final String SUCCESS = "0";
    private static final String ERROR = "-1";
    private String code;
    private String message;
    private Object data;

    public static Result success(){
        Result result = new Result();
        result.setCode(SUCCESS);

        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.data = data;
        result.setCode(SUCCESS);

        return result;
    }

    public static Result error(String message){
        Result result = new Result();
        result.setCode(ERROR);

        result.message = message;
        return result;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
