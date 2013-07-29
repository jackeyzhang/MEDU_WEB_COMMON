/**
 * 
 */
package com.sickle.dao;

import com.sickle.exception.CodeException;


/**
 * 
 * @author chenhao
 *
 */
public class DaoServiceFactory
{
	
	@SuppressWarnings("unchecked")
	public final static <T> T getService(Class<T> t) throws CodeException
	{
		String itfname = t.getName( );
		String[] itfnames = itfname.split( "Service" );
		if( itfnames.length < 1)
		{
			throw new CodeException("不合理的代码调用 ： " + itfname);
		}
		int index = itfnames[0].indexOf( "itf." );
		String classname = "com.sickle.dao." + itfnames[0].substring( index + 5) + "DaoService";
		
		T obj = null;
		try
		{
			obj = (T)Class.forName( classname ).newInstance( );
		}
		catch ( Exception e )
		{
			throw new CodeException("不合理的代码调用 ： " + itfname,e.getCause( ));
		}
		
		return obj;
	}

}
