package com.baizhi.dao;

import com.baizhi.entity.Menu;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MenuDao extends Mapper<Menu> {

    // 查菜单
    List<Menu> selectMenu();

}
