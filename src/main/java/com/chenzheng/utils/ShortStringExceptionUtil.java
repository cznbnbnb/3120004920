package com.chenzheng.utils;

public class ShortStringExceptionUtil extends Exception {

    public ShortStringExceptionUtil() {
        super();
    }

    /**
     *
     * @param message 自定义异常文案
     */
    public ShortStringExceptionUtil(String message) {
        super(message);
    }

    public ShortStringExceptionUtil(String message, Throwable cause) {
        super(message, cause);
    }

    public ShortStringExceptionUtil(Throwable cause) {
        super(cause);
    }

}
