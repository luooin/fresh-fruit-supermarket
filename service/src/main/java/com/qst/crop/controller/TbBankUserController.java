package com.qst.crop.controller;

import com.qst.crop.service.ITbBankUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 银行用户表 前端控制器
 * </p>
 * @author guotao
 * @since 2024-01-28
 */
@RestController
@RequestMapping("/tbBankUser")
public class TbBankUserController  {
    @Autowired
    private ITbBankUserService tbBankUserService;
    private String prefix = "system/pages/";
    /**
     * @描述 列表页面
     */
}