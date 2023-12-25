package com.example.sstest;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface TestMapper {

    @Insert("INSERT INTO nx_data ( id, point_guid, tag, `value`, `timestamp` ) VALUES ( ?, ?, ?, ?, ? )")
    void insert(Long id, String pointGuid, String tag, String value, Date timestamp);
}
