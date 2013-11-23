/**
 * 
 */
package com.sickle.service.itf;

import com.sickle.pojo.mail.MailSenderInfo;

/**
 * 
 * @author wangzhenhua
 *
 */
public interface IMailSenderService {

	/**
	 * 发送文本形式的邮件
	 * @param mailInfo
	 * @return
	 */
	public boolean sendTextMail(MailSenderInfo mailInfo);
	
	/**
	 * 发送Html形式的邮件
	 * @param mailInfo
	 * @return
	 */
	public boolean sendHtmlMail(MailSenderInfo mailInfo);

}
