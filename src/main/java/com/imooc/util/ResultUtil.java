/**
 * FileName: ResultUtil
 * Author:   MITE
 * Date:     2018/7/9 15:35
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.util;

import com.imooc.domain.Result;

/**
 * @author MITE
 * @create 2018/7/9
 * @since 1.0.0
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}