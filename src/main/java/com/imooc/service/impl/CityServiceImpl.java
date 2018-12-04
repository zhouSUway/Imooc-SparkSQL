package com.imooc.service.impl;

import com.imooc.model.domain.City;
import com.imooc.service.CityService;
import org.springframework.stereotype.Service;

@Service("cityService")
public class CityServiceImpl extends BaseServiceImpl<City, Integer> implements CityService {
}