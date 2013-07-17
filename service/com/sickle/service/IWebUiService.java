/**
 * 
 */
package com.sickle.service;

import com.sickle.pojo.website.WebUi;



/**
 * webUi service
 * 
 * @author chenhao
 *
 */
public interface IWebUiService
{
	
	/**
	 * 添加一个webUi
	 * 
	 * @param webui
	 * @return
	 */
	WebUi addWebUi(WebUi webui)throws Exception;
	
	/**
	 * 删除一个webui
	 * 
	 * @param webui
	 * @return
	 * @throws Exception
	 */
	boolean removeWebUiById(Integer id)throws Exception;
	
	/**
	 * 根据id获取到一个webui
	 * 
	 * @param id
	 * @return
	 */
	WebUi getWebUiById(Integer id);
	
	/**
	 * 修改webui对象
	 * 
	 * @param webui
	 * @return
	 * @throws Exception
	 */
	WebUi modifyWebUi(WebUi webui)throws Exception;
}
