/**
 * 
 */
package com.sickle.pojo.mail;

import com.sickle.service.SimpleMailSenderService;

/**
 * @author wangzhenhua
 * 
 */
public class MailTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("xxcna@163.com");
		mailInfo.setPassword("******");// 您的邮箱密码
		mailInfo.setFromAddress("xxcna@163.com");
		mailInfo.setToAddress("ousinka@foxmail.com");
		mailInfo.setSubject("java mail sand test");
		mailInfo.setContent("设置邮箱内容 java mail sand test!");
		mailInfo.setAttachFileNames(new String[]{"E:/GitHub/javaMail.txt"});
		// 这个类主要来发送邮件
		SimpleMailSenderService sms = new SimpleMailSenderService();
		sms.sendTextMail(mailInfo); // 发送文体格式
		//sms.sendHtmlMail(mailInfo); // 发送html格式
	}

}
