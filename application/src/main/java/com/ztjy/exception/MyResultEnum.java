package com.ztjy.exception;

import com.ztjy.common.response.IResult;

/**
 * description: 业务相关结果类型枚举
 * Copyright: 厦门神州鹰软件科技有限公司
 * @author wangtonggui
 * @date 2018/3/9
 **/
public enum MyResultEnum implements IResult {
	/**
	 * 成功
	 */
    SUCCESS(10000, "成功"),
    /**
     * 测试用，id错误
     */
    BOY_ID_ERROR(1380001, "测试用，id错误"),
    /**
     * 测试用，年龄错误
     */
    BOY_AGE_ERROR(1380002, "测试用，年龄错误");

    private int code;
    private String message;

    MyResultEnum(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "MyResultEnum{" +
                "code=" + code +
                ", msg='" + message + '\'' +
                '}';
    }
}
