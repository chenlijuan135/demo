package com.vanke.demo.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vanke.demo.dao.RoleDao;
import com.vanke.demo.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
public class PersonServiceImpl extends ServiceImpl<RoleDao, Role> implements PersonService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Role ofCode(String roleCode) {
        Role personByCode = baseMapper.findPersonByCode(roleCode);
        return personByCode;
    }

    public String redis() {
        redisTemplate.opsForValue().set(10,12,13, TimeUnit.HOURS);
        Object o = redisTemplate.opsForValue().get(10);
        System.out.println(o.toString());
        return o.toString();
    }



}