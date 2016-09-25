package org.xs.dntown.wx.idiom.modules.dao;

import org.springframework.stereotype.Repository;
import org.xs.dntown.wx.common.persistence.QueryDao;
import org.xs.dntown.wx.idiom.modules.entity.IdiomUserInfo;

/**
 * 接龙用户信息数据层
 */
@Repository("IdiomUserDao")
public class IdiomUserDao extends QueryDao<IdiomUserInfo> {

}
