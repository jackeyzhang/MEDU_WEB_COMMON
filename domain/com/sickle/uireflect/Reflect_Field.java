/**
 * 
 */
package com.sickle.uireflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author chenhao
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Reflect_Field
{

	boolean isId() default false;
	
	String type() default "String";
	
	boolean isshow() default true;
	
	String title() default "";
	
}
