package com.zzjee.wzyw.service;
import com.zzjee.wzyw.entity.TWzCkHeadEntity;
import com.zzjee.wzyw.entity.TWzCkItemEntity;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TWzCkHeadServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TWzCkHeadEntity tWzCkHead,
                        List<TWzCkItemEntity> tWzCkItemList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TWzCkHeadEntity tWzCkHead,
                           List<TWzCkItemEntity> tWzCkItemList);
	public void delMain(TWzCkHeadEntity tWzCkHead);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TWzCkHeadEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TWzCkHeadEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TWzCkHeadEntity t);
}
