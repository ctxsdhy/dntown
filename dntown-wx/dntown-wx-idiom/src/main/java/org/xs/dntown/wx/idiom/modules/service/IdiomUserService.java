package org.xs.dntown.wx.idiom.modules.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.xs.dntown.wx.common.service.BaseService;
import org.xs.dntown.wx.idiom.modules.entity.IdiomUserInfo;

/**
 * 接龙用户服务层
 */
@Service
@Lazy(true)
public class IdiomUserService extends BaseService<IdiomUserInfo> {
	
	/**
	 * 获取接龙用户
	 * @param openId
	 * @return
	 */
	public IdiomUserInfo getByOpenId(String openId) {
		String hql = "from IdiomUserInfo where openId=?";
		return queryDao.getByHql(hql, new Object[]{openId});
	}
	
	/**
	 * 设置步骤
	 * @param openId
	 * @param step
	 */
	public void setStep(String openId, String step) {
		String hql = "update IdiomUserInfo set moduleStep=?, stepTime=?, idiomId='', isAnswered=false where openId=?";
		queryDao.update(hql, new Object[]{step, new Date(), openId});
	}
	
	/**
	 * 获得积分前几名
	 * @param top
	 */
	public List<IdiomUserInfo> getTopScope(int top) {
		List<Criterion> criterionList = new ArrayList<Criterion>();
		criterionList.add(Restrictions.ne("score", 0));
		return queryDao.findTop(criterionList, top, Order.desc("score"));
	}
	
	/**
	 * 获得积分排名
	 * @param top
	 */
	public String getRankScope(int score) {
		String hql = "select count(*) from IdiomUserInfo where score >=?";
		return queryDao.getString(hql, new Object[]{score});
	}
}