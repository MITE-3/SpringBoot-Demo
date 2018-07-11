/**
 * FileName: GirlException
 * Author:   MITE
 * Date:     2018/7/9 16:01
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author MITE
 * @create 2018/7/9
 * @since 1.0.0
 */
public class GirlException extends RuntimeException{
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}