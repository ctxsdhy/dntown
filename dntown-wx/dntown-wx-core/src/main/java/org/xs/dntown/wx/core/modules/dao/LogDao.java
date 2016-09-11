package org.xs.dntown.wx.core.modules.dao;

import org.springframework.stereotype.Repository;
import org.xs.dntown.wx.common.persistence.QueryDao;
import org.xs.dntown.wx.core.modules.entity.LogInfo;

/**
 * 日志数据层
 */
@Repository("LogDao")
public class LogDao extends QueryDao<LogInfo> {

}
