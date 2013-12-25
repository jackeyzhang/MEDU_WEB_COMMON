package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.website.Evaluate;

/**
 * 评价
 * 
 * @author wangzhenhua
 *
 */
public interface IEvaluateService
{

	/**
	 * 根据id号获取评价
	 * @param id
	 * @return
	 */
	Evaluate getEvaluateById(Long id);
	
	/**
	 * 根据学校ID获取评价
	 * 
	 * @param userid
	 * @return
	 */
	List<Evaluate> getEvaluateByOrgId(Integer userid);
	
	
	
	/**
	 * 增加
	 * 
	 * @param Evaluate
	 * @return
	 */
	Evaluate addEvaluate(Evaluate evaluate);
	
	/**
	 * 修改
	 * 
	 * @param Evaluate
	 * @return
	 */
	Evaluate modifyEvaluate(Evaluate evaluate);
	
	/**
	 * 根据id删除
	 * 
	 * @param evaluateid
	 * @return
	 */
	boolean removeEvaluateById(Long evaluateid)throws Exception;
	
}
