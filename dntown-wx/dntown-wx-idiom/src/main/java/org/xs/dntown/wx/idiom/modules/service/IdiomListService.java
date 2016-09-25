package org.xs.dntown.wx.idiom.modules.service;

import java.util.List;
import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.xs.dntown.wx.common.service.BaseService;
import org.xs.dntown.wx.idiom.modules.entity.IdiomListInfo;

/**
 * 接龙成语服务层
 */
@Service
@Lazy(true)
public class IdiomListService extends BaseService<IdiomListInfo> {
	
	/**
	 * 获取成语
	 * @param openId
	 * @return
	 */
	public IdiomListInfo getByWord(String word) {
		String hql = "from IdiomListInfo where word=?";
		return queryDao.getByHql(hql, new Object[]{word});
	}
	
	/**
	 * 获得下一题成语
	 * @param top
	 */
	public IdiomListInfo getNextIdiom(String wordBegin) {
		String hql = "from IdiomListInfo where wordBegin=?";
		List<IdiomListInfo> list = queryDao.find(hql, new Object[]{wordBegin});
		if(list != null && list.size() > 0) {
			if(list.size() == 1) {
				return list.get(0);
			} else {
				Random r = new Random();
				int index = r.nextInt(list.size() - 1);
				return list.get(index);
			}
		}
		return null;
	}
}
