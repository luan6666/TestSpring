package com.ldx_first.demo_first.dao;

import java.awt.geom.Area;
import java.util.List;

public interface AreaDao {
    List<Area> queryArea();
    //查询
    Area queryAreaById(int areaID);
    //插入
    int inserArea(Area area);
    //更新
    int updateArea(Area area);
//删除
    int deleteArea(int areaId);
}
