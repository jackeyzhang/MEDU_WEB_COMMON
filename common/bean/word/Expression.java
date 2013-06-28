/**
 * 
 */
package bean.word;

import java.io.Serializable;

/**
 * 表达式
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-26
 * 8:48:54
 *
 * TODO:
 */
public class Expression implements Serializable {

	private static final long serialVersionUID = -5774075866117048054L;
	
	private String type;
	
	private String express;

	public Expression() {
	}

	
	/**
	 * @return the type
	 */
	public String getType( )
	{
		return type;
	}

	
	/**
	 * @param type the type to set
	 */
	public void setType( String type )
	{
		this.type = type;
	}

	
	/**
	 * @return the express
	 */
	public String getExpress( )
	{
		return express;
	}

	
	/**
	 * @param express the express to set
	 */
	public void setExpress( String express )
	{
		this.express = express;
	}
	
	

}
