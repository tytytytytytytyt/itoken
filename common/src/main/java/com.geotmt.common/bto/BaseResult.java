package com.geotmt.common.bto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class BaseResult implements Serializable {

    private static final String RESULT_OK = "ok";
    private static final String RESULT_NOT_OK = "notOk";
    private static final String SUCCESS = "成功操作";

    private String result;
    private Object data;
    private String success;
    private Cursor cursor;
    private List<Error> errors;

    private static BaseResult createResult(String result,Object data,String success,Cursor cursor,List<Error> errors){
        BaseResult baseResult = new BaseResult();
        baseResult.setResult(result);
        baseResult.setData(data);
        baseResult.setSuccess(success);
        baseResult.setCursor(cursor);
        baseResult.setErrors(errors);

        return baseResult;
    }

    private static BaseResult ok(){
       return createResult(RESULT_OK,null,SUCCESS,null,null);
    }


    private static BaseResult ok(Object data){
        return createResult(RESULT_OK,data,SUCCESS,null,null);
    }

    private static BaseResult error(List<Error> errors){
        return createResult(RESULT_NOT_OK,null,null,null,errors);
    }





    @Data
    public static  class Cursor{
        private int total;
        private int offset;
        private int limit;

    }


    @Data
    public static  class Error{
        private String filed;
        private String message;

    }
































}
