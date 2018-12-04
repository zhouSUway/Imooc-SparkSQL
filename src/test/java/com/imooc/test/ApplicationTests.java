package com.imooc.test;

import com.github.pagehelper.PageInfo;
import com.imooc.model.domain.City;
import com.imooc.service.CityService;
import com.imooc.util.JsonUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationTests extends SpringBaseTest {

    @Autowired
    private CityService cityService;

    @Test
    public void selectPage() {
        cityService.selectPageAndCount(null, 1, 3).getList().stream()
                .map(JsonUtils::toJson)
                .forEach(log::info);
    }

}