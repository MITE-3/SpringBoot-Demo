/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GirlService
 * Author:   MITE
 * Date:     2018/7/6 15:22
 * Description: 服务层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 〈一句话功能简述〉<br> 
 * 〈服务层〉
 *
 * @author MITE
 * @create 2018/7/6
 * @since 1.0.0
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void  getAge(Integer Id) throws Exception {
        Girl girl = new Girl();
        Integer age=girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.SUCCESS);
        } else if (age > 10 && age < 16) {
            throw new GirlException(ResultEnum.UNKNOW_ERROR);
        }
    }

}