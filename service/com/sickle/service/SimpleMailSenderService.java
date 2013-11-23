/**
 * 
 */
package com.sickle.service;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sickle.pojo.mail.MailSenderInfo;
import com.sickle.pojo.mail.MyAuthenticator;
import com.sickle.service.itf.IMailSenderService;

/**
 * 简单邮件发送服务
 * @author wangzhenhua
 *
 */
public class SimpleMailSenderService implements IMailSenderService {

	@Override
	public boolean sendTextMail(MailSenderInfo mailInfo) {
		// 判断是否需要身份认证
		MyAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		if (mailInfo.isValidate()) {
			// 如果需要身份认证，则创建一个密码验证器
			authenticator = new MyAuthenticator(mailInfo.getUserName(),
					mailInfo.getPassword());
		}
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session.getDefaultInstance(pro, authenticator);
		try {
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			// 创建邮件发送者地址
			Address from = new InternetAddress(mailInfo.getFromAddress());
			// 设置邮件消息的发送者
			mailMessage.setFrom(from);
			// 创建邮件的接收者地址，并设置到邮件消息中
			Address to = new InternetAddress(mailInfo.getToAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			// 设置邮件消息的主题
			mailMessage.setSubject(mailInfo.getSubject());
			// 设置邮件消息发送的时间
			mailMessage.setSentDate(new Date());
			// 设置邮件消息的主要内容
			String mailContent = mailInfo.getContent();
			mailMessage.setText(mailContent);
			//添加附件
			if(mailInfo.getAttachFileNames() != null){//有附件  
				String[] attachFileNames = mailInfo.getAttachFileNames();
				for(int i=0;i<attachFileNames.length;i++){
					String fileName =attachFileNames[i];
					FileDataSource fds=new FileDataSource(fileName); //得到数据源
					mailMessage.setDataHandler(new DataHandler(fds)); //得到附件本身并至入BodyPart  
					mailMessage.setFileName(fds.getName());  //得到文件名同样至入BodyPart  
				}
            }   
			// 发送邮件
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean sendHtmlMail(MailSenderInfo mailInfo) {
		// 判断是否需要身份认证
				MyAuthenticator authenticator = null;
				Properties pro = mailInfo.getProperties();
				// 如果需要身份认证，则创建一个密码验证器
				if (mailInfo.isValidate()) {
					authenticator = new MyAuthenticator(mailInfo.getUserName(),
							mailInfo.getPassword());
				}
				// 根据邮件会话属性和密码验证器构造一个发送邮件的session
				Session sendMailSession = Session
						.getDefaultInstance(pro, authenticator);
				try {
					// 根据session创建一个邮件消息
					Message mailMessage = new MimeMessage(sendMailSession);
					// 创建邮件发送者地址
					Address from = new InternetAddress(mailInfo.getFromAddress());
					// 设置邮件消息的发送者
					mailMessage.setFrom(from);
					// 创建邮件的接收者地址，并设置到邮件消息中
					Address to = new InternetAddress(mailInfo.getToAddress());
					// Message.RecipientType.TO属性表示接收者的类型为TO
					mailMessage.setRecipient(Message.RecipientType.TO, to);
					// 设置邮件消息的主题
					mailMessage.setSubject(mailInfo.getSubject());
					// 设置邮件消息发送的时间
					mailMessage.setSentDate(new Date());
					// MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
					Multipart mainPart = new MimeMultipart();
					// 创建一个包含HTML内容的MimeBodyPart
					BodyPart html = new MimeBodyPart();
					// 设置HTML内容
					html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");
					mainPart.addBodyPart(html);

					// 添加附件
					if (mailInfo.getAttachFileNames() != null) {// 有附件
						String[] attachFileNames = mailInfo.getAttachFileNames();
						for (int i = 0; i < attachFileNames.length; i++) {
							String fileName = attachFileNames[i];
							FileDataSource fds = new FileDataSource(fileName); // 得到数据源
							html.setDataHandler(new DataHandler(fds)); // 得到附件本身并至入BodyPart
							html.setFileName(fds.getName()); // 得到文件名同样至入BodyPart
						}
					}

					// 将MiniMultipart对象设置为邮件内容
					mailMessage.setContent(mainPart);
					// 发送邮件
					Transport.send(mailMessage);
					return true;
				} catch (MessagingException ex) {
					ex.printStackTrace();
				}
				return false;
	}

}
