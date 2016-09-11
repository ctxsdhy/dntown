package org.xs.dntown.wx.game24.modules.dao;

import org.springframework.stereotype.Repository;
import org.xs.dntown.wx.common.persistence.QueryDao;
import org.xs.dntown.wx.game24.modules.entity.Game24UserInfo;

/**
 * game24用户数据层
 */
@Repository("Game24UserDao")
public class Game24UserDao extends QueryDao<Game24UserInfo> {

}
