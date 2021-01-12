package org.app.dbapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.app.dbapp.entity.UserInfo;

@Mapper
public interface UserInfoMapper {
    List<UserInfo> selectAll();
}