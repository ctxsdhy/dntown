package org.xs.dntown.wx.game24.modules.dao;

import org.springframework.stereotype.Repository;
import org.xs.dntown.wx.common.persistence.QueryDao;
import org.xs.dntown.wx.game24.modules.entity.QuestionInfo;

/**
 * 题目数据层
 */
@Repository("QuestionDao")
public class QuestionDao extends QueryDao<QuestionInfo> {

}
