package com.luoziyihao.demo.web.controller;

import com.luoziyihao.demo.web.vo.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author xiang.rao created on 3/4/18 11:12 PM
 * @version $Id$
 */
@RequestMapping("/api/data")
@RestController
public class DataController {

    private List<String> dataLists = new ArrayList<>();

    @RequestMapping("/add")
    public ApiResult add(String text) {

        return ApiResult.success();
    }


    @RequestMapping("/query")
    public ApiResult query() {

        return ApiResult.success();
    }

}
