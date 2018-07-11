/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Result
 * Author:   MITE
 * Date:     2018/7/9 14:51
 * Description: 结果描述
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.domain;

/**
 * 〈一句话功能简述〉<br> 
 * 〈结果描述〉
 *
 * @author MITE
 * @create 2018/7/9
 * @since 1.0.0
 */
public class Result<T> {
    //错误码
    private Integer code;
    //错误描述
    private String msg;
    //返回内容
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}