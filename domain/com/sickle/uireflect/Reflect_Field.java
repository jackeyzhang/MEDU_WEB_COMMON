/**
 * 
 */
package com.sickle.uireflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * ui表单的字段反射器
 * 
 * @author chenhao
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Reflect_Field
{

	/**
	 * 是不是id呢
	 * 
	 * @return
	 */
	boolean isId() default false;
	
	/**
	 * 字段类型
	 * 
	 * String int float password check list date
	 * @return
	 */
	FieldType type() default FieldType.String;
	
	/**
	 * 是否展示在界面上
	 * 
	 * @return
	 */
	boolean isshow() default true;
	
	/**
	 * 界面上的title
	 * 
	 * @return
	 */
	String title() default "";
	
	/**
	 * 校验字符串
	 * 
	 * 类型+限制
	 * 
	 * 类型：S--String E--Email I--Int
	 * 
	 * 限制0-15大于0 小于15或者长度在0到15之间
	 * @return
	 */
	String validateStr() default "S0-15";
	
}
