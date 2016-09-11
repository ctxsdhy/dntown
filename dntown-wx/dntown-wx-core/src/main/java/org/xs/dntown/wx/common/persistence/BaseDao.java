package org.xs.dntown.wx.common.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.xs.dntown.wx.common.utils.Reflections;

/**
 * 底层数据支持类
 */
public class BaseDao <T>{
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	/**
	 * 获取 Session
	 */
	public Session getSession(){  
	  return sessionFactory.getCurrentSession();
	}

	/**
	 * 强制与数据库同步
	 */
	public void flush(){
		getSession().flush();
	}

	/**
	 * 清除缓存数据
	 */
	public void clear(){ 
		getSession().clear();
	}
	
	/**
	 * 实体类类型(由构造方法自动赋值)
	 */
	protected Class<?> entityClass;
	
	/**
	 * 构造函数
	 */
	public BaseDao() {
		entityClass = Reflections.getClassGenricType(getClass());
	}
}
