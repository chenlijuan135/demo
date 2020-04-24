package com.vanke.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.vanke.demo.entity.Role;
import org.springframework.stereotype.Component;


@Component
public interface PersonService extends IService<Role> {

    Role ofCode(String roleCode);

}
