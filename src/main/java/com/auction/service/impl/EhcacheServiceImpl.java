package com.auction.service.impl;

import com.auction.service.EhcacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EhcacheServiceImpl implements EhcacheService {

    @Cacheable(value = "cacheTest", key="#param")
    public String getTime(String param) {
        return String.valueOf(System.currentTimeMillis());
    }


}