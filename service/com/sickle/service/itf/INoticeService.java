/**
 * 
 */
package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.edu.Notice;


/**
 * notice service
 * 
 * @author chenhao
 *
 */
public interface INoticeService
{

	/**
	 * 列出所有notice
	 * 
	 * @return
	 */
	List<Notice> listAllNotice();
	
	/**
	 * 根据id获取notice对象
	 * 
	 * @param id
	 * @return
	 */
	Notice getNoticeById(Integer id);
	
	/**
	 * 根据登录名/昵称获取到notice对象
	 * 
	 * @param loginName
	 * @return
	 */
	Notice getNoticeByLoginName(String loginName);
	
	
	/**
	 * 增加notice对象
	 * 
	 * @param notice
	 * @return
	 * @throws Exception
	 */
	Notice addNotice(Notice notice)throws Exception;
	
	/**
	 * 根据id删除notice对象
	 * 
	 * @param notice
	 * @return
	 * @throws Exception
	 */
	boolean removeNoticeById(Integer noticeId)throws Exception;
	
	/**
	 * 根据登陆名/昵称删除notice对象
	 * 
	 * @param notice
	 * @return
	 * @throws Exception
	 */
	boolean removeNoticeByLoginName(String loginName)throws Exception;
	
	/**
	 * 修改notice对象
	 * 
	 * @param notice
	 * @return
	 * @throws Exception
	 */
	Notice modifyNotice(Notice notice)throws Exception;
	
	/**
	 * 列出所有notice
	 * 
	 * @return
	 */
	List<Notice> listNotice(int startIndex, int length);
	
}
