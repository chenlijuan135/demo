package com.vanke.demo.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vanke.demo.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleDao extends BaseMapper<Role> {
    Role findPersonByCode(@Param("roleCode") String roleCode);
}
