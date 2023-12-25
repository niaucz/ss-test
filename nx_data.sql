/*

 Target Server Type    : MySQL
 Target Server Version : 80035 (8.0.35)
 File Encoding         : 65001

 Date: 25/12/2023 10:54:20
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for nx_data
-- ----------------------------
DROP TABLE IF EXISTS `nx_data`;
CREATE TABLE `nx_data`
(
    `id`         bigint(20) NOT NULL COMMENT 'ID',
    `point_guid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '测点对象 guid。见测点对象定义。',
    `tag`        varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '点位对象 tag。见点位对象定义。',
    `value`      varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '测点的实时值。',
    `timestamp`  timestamp NULL DEFAULT NULL COMMENT '测点的采集时间。UNIX 时间戳。',
    PRIMARY KEY (`id`) USING BTREE,
    KEY          `point_guid` (`point_guid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='数据对象';

SET
FOREIGN_KEY_CHECKS = 1;
