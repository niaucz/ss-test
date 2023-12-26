package com.example.sstest;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface TestMapper {
    
    @Insert("DROP TABLE IF EXISTS nx_data")
    void dropTable();
    
    @Insert("CREATE TABLE `nx_data`\n" +
            "(\n" +
            "    `id`         bigint(20) NOT NULL COMMENT 'ID',\n" +
            "    `point_guid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '测点对象 guid。见测点对象定义。',\n" +
            "    `tag`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '点位对象 tag。见点位对象定义。',\n" +
            "    `value`      varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '测点的实时值。',\n" +
            "    `timestamp`  timestamp NULL DEFAULT NULL COMMENT '测点的采集时间。UNIX 时间戳。',\n" +
            "    PRIMARY KEY (`id`) USING BTREE,\n" +
            "    KEY          `point_guid` (`point_guid`) USING BTREE\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='数据对象'")
    void createTable();
    
    @Insert("INSERT INTO nx_data ( id, point_guid, tag, `value`, `timestamp` ) VALUES ( #{id}, #{pointGuid} , #{tag} , #{value} , #{timestamp}  )")
    void insert(@Param("id") Long id, @Param("pointGuid") String pointGuid, @Param("tag") String tag, @Param("value") String value, @Param("timestamp") Date timestamp);
}
