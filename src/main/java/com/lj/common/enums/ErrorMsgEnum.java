package com.lj.common.enums;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/***
 * @ClassName : ErrorMsgEnum
 * @Description : 
 * @Auther : liangjun
 * @Date : 2019/8/21 14:07
 * @version : V1.0
 */
public enum ErrorMsgEnum {
    /**
     * 接口异常导致服务不可用
     */
    SERVICE_UNAVAILABILITY("000000", "服务不可用"),
    /**
     * 参数异常
     */
    PARAMETER_EXCEPTION("000001", "参数异常"),

    NOT_USER_ERROR("000002","暂无用户")



    ;
    /**
     * 错误编码为key的所有错误枚举对象的map集合
     */
    private static Map<String, String> enums = new HashMap<>(ErrorMsgEnum.values().length);

    static {
        for (ErrorMsgEnum e : ErrorMsgEnum.values()) {
            enums.put(e.getCode(), e.getMsg());
        }
    }

    /**
     * 通过错误编码获取错误消息内容
     *
     * @param code 错误编码
     * @return 错误消息内容
     */
    public static String getMsgByCode(String code) {
        return enums.get(code);
    }

    /**
     * 通过错误码枚举，返回一个格式化后的错误信息
     *
     * @param constants 错误码枚举
     * @param args      错误信息格式中需要的参数
     * @return 格式化后的错误信息
     */
    public static String getMsg(ErrorMsgEnum constants, Object... args) {
        return MessageFormat.format(constants.getMsg(), args);
    }

    /**
     * 错误编码
     */
    private String code;
    /**
     * 错误消息提示
     */
    private String msg;

    ErrorMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
