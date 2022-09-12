package com.chenzheng.exception;

public class ShortStringException extends Exception {


    /**
     *
     * @param message 自定义异常文案
     */
    public ShortStringException(String message) {
        super(message);
    }

    public ShortStringException() {
        super();
    }

    public ShortStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShortStringException(Throwable cause) {
        super(cause);
    }

}
