package org.xs.dntown.wx.game24.modules.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.xs.dntown.wx.common.service.BaseService;
import org.xs.dntown.wx.game24.modules.entity.QuestionInfo;

/**
 * 题目服务层
 */
@Service
@Lazy(true)
public class QuestionService extends BaseService<QuestionInfo> {
	
	public String getAnswer(String id) {
		String hql = "select answer from QuestionInfo where id=?";
		return queryDao.getString(hql, new Object[]{id});
	}
}
