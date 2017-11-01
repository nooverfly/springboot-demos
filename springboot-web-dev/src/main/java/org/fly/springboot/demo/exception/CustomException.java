package org.fly.springboot.demo.exception;

/**
 * Created by overfly on 2017/11/1.
 */
public class CustomException extends Exception {

    public CustomException(String message){
        super(message);
    }
}
