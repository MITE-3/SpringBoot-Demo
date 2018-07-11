/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GirlListController
 * Author:   MITE
 * Date:     2018/7/6 14:20
 * Description: 女孩信息拆线呢
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.controller;

/**
 * 〈一句话功能简述〉<br> 
 * 〈女孩信息查询〉
 *
 * @author MITE
 * @create 2018/7/6
 * @since 1.0.0
 */

import com.imooc.domain.Girl;
import com.imooc.domain.Result;
import com.imooc.repository.GirlRepository;
import com.imooc.service.GirlService;
import com.imooc.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlListController {
    @Autowired
    private GirlRepository girlR;

    @Autowired
    private GirlService gs;
    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value="/girls")
    public List<Girl> girlList() {
        return girlR.findAll();
    }
    /**
     * 新增一条数据
     */
    @PostMapping(value="/addGirl")
    public Result<Girl> add(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
        return ResultUtil.success(girlR.save(girl));//返回插入的对象
    }
    /**
     * 查询一个女生
     */
    @GetMapping(value="/girl/{id}")
    public Integer  find(@PathVariable("id") Integer Id ){
        girlR.findById(Id);
        return 1;
    }

    /**
     * 删除
     */
    @DeleteMapping
    public void delete() {
        Girl g=new Girl();
        girlR.delete(g);
    }
    /**
     * 更新
     */
    @PutMapping(value = "/girls/{id}")
    public void girlUpdate(@PathVariable("id") Integer id) {
        Girl g=new Girl();
        girlR.save(g);
    }
    @GetMapping(value = "/girl/getAge/{id}")
    public void getAge(@PathVariable("id") Integer Id) throws Exception {
        gs.getAge(Id);
    }
}