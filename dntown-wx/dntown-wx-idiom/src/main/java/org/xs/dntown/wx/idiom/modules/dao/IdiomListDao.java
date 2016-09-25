package org.xs.dntown.wx.idiom.modules.dao;

import org.springframework.stereotype.Repository;
import org.xs.dntown.wx.common.persistence.QueryDao;
import org.xs.dntown.wx.idiom.modules.entity.IdiomListInfo;

/**
 * 接龙成语数据层
 */
@Repository("IdiomListDao")
public class IdiomListDao extends QueryDao<IdiomListInfo> {

}
