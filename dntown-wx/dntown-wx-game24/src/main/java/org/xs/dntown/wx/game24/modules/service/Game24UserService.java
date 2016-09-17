package org.xs.dntown.wx.game24.modules.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.xs.dntown.wx.common.service.BaseService;
import org.xs.dntown.wx.game24.modules.entity.Game24UserInfo;

/**
 * game24用户服务层
 */
@Service
@Lazy(true)
public class Game24UserService extends BaseService<Game24UserInfo> {
	
	/**
	 * 获取game24用户
	 * @param openId
	 * @return
	 */
	public Game24UserInfo getByOpenId(String openId) {
		String hql = "from Game24UserInfo where openId=?";
		return queryDao.getByHql(hql, new Object[]{openId});
	}
	
	/**
	 * 设置步骤
	 * @param openId
	 * @param step
	 */
	public void setStep(String openId, String step) {
		String hql = "update Game24UserInfo set moduleStep=?, stepTime=?, questionId='', isAnswered=false where openId=?";
		queryDao.update(hql, new Object[]{step, new Date(), openId});
	}
	
	/**
	 * 获得积分前几名
	 * @param top
	 */
	public List<Game24UserInfo> getTopScope(int top) {
		List<Criterion> criterionList = new ArrayList<Criterion>();
		criterionList.add(Restrictions.ne("score", 0));
		return queryDao.findTop(criterionList, top, Order.desc("score"));
	}
	
	/**
	 * 获得积分排名
	 * @param top
	 */
	public String getRankScope(int score) {
		String hql = "select count(*) from Game24UserInfo where score >=?";
		return queryDao.getString(hql, new Object[]{score});
	}
}
