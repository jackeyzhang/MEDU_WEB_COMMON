package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.website.Message;

/**
 * 消息server服务
 * 
 * @author chenhao
 *
 */
public interface IMessageService
{

	/**
	 * 根据id号获取消息对象
	 * @param id
	 * @return
	 */
	Message getMessageById(Long id);
	
	/**
	 * 根据用户ID获取消息对象
	 * 
	 * @param name
	 * @return
	 */
	List<Message> getMessageByUserId(Integer userid);
	
	/**
	 * 增加消息信息
	 * 
	 * @param Message
	 * @return
	 */
	Message addMessage(Message Message);
	
	/**
	 * 修改消息信息
	 * 
	 * @param Message
	 * @return
	 */
	Message modifyMessage(Message Message);
	
	/**
	 * 根据id删除消息
	 * 
	 * @param Messageid
	 * @return
	 */
	boolean removeMessageById(Long Messageid)throws Exception;
	
}
