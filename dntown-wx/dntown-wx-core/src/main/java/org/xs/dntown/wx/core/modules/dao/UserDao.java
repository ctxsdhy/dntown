package org.xs.dntown.wx.core.modules.dao;

import org.springframework.stereotype.Repository;
import org.xs.dntown.wx.common.persistence.QueryDao;
import org.xs.dntown.wx.core.modules.entity.UserInfo;

/**
 * 用户数据层
 */
@Repository("UserDao")
public class UserDao extends QueryDao<UserInfo> {

}
