package org.xs.dntown.wx.core.modules.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.xs.dntown.wx.common.service.BaseService;
import org.xs.dntown.wx.core.modules.entity.UserInfo;

/**
 * 用户服务层
 */
@Service
public class UserService extends BaseService<UserInfo> {
	
	/**
	 * 获取用户
	 * @param openId
	 * @return
	 */
	public UserInfo getByOpenId(String openId) {
		String hql = "from UserInfo where openId=?";
		return queryDao.getByHql(hql, new Object[]{openId});
	}
	
	/**
	 * 删除用户
	 * @param openId
	 */
	public void deleteByOpenId(String openId) {
		String hql = "delete from UserInfo where openId=?";
		queryDao.update(hql, new Object[]{openId});
	}
	
	/**
	 * 判断用户是否存在
	 * @param openId
	 * @return
	 */
	public boolean existOpenId(String openId) {
		String hql = "select count(*) from UserInfo where openId=?";
		return queryDao.exist(hql, new Object[]{openId});
	}
	
	/**
	 * 设置步骤
	 * @param openId
	 * @param coreStep
	 */
	public void setCoreStep(String openId, String coreStep) {
		String hql = "update UserInfo set step=? where openId=?";
		queryDao.update(hql, new Object[]{coreStep, openId});
	}
	
	/**
	 * 获取步骤
	 * @param openId
	 * @return
	 */
	public String getStep(String openId) {
		String hql = "select step from UserInfo where openId=?";
		return queryDao.getString(hql, new Object[]{openId});
	}
	
	/**
	 * 设置步骤
	 * @param openId
	 * @param coreStep
	 */
	public void setModule(String openId, String module) {
		String hql = "update UserInfo set module=?, module_time=? where openId=?";
		queryDao.update(hql, new Object[]{module, new Date(), openId});
	}
	
	/**
	 * 设置用户名
	 * @param openId
	 * @param userName
	 */
	public void setUserName(String openId, String userName) {
		String hql = "update UserInfo set userName=? where openId=?";
		queryDao.update(hql, new Object[]{userName, openId});
	}
}
