package org.fly.springboot.demo.domain;

/**
 * Created by overfly on 2017/11/1.
 */
public class ErrorInfo<T> {
    public static final Integer OK = 200;
    public static final Integer ERROR = 500;
    private Integer code;
    private String message;
    private String url;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ErrorInfo{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", data=" + data +
                '}';
    }
}
