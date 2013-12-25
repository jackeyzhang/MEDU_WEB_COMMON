/**
 * 
 */
package com.sickle.pojo.website;

import java.util.Date;

import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;

/**
 * 对学校评价
 * 
 * @author wangzhenhua
 *
 */
public class Evaluate {
	@Reflect_Field(type = FieldType.Long,isId = true)
	private Long id;
	
	@Reflect_Field(title="用户",type=FieldType.Integer,mask= 1)
	private int send;
	
	@Reflect_Field(title="学校",type=FieldType.Integer,mask= 0 )
	private int org;
	
	@Reflect_Field(title="接收时间",type=FieldType.DateTime,mask= 0)
	private Date receivetime;
	
	@Reflect_Field(index=1,title="内容",type=FieldType.TextArea,mask= 0)
	private String content;
	
	@Reflect_Field(index=0,title="标题",mask= 0)
	private String title;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSend() {
		return send;
	}

	public void setSend(int send) {
		this.send = send;
	}

	public int getOrg() {
		return org;
	}

	public void setOrg(int org) {
		this.org = org;
	}

	public Date getReceivetime() {
		return receivetime;
	}

	public void setReceivetime(Date receivetime) {
		this.receivetime = receivetime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
