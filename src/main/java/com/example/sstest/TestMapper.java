package com.example.sstest;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface TestMapper {

    @Insert("INSERT INTO nx_data ( id, point_guid, tag, `value`, `timestamp` ) VALUES ( #{id}, #{pointGuid} , #{tag} , #{value} , #{timestamp}  )")
    void insert(@Param("id") Long id, @Param("pointGuid") String pointGuid, @Param("tag") String tag, @Param("value") String value, @Param("timestamp") Date timestamp);
}
