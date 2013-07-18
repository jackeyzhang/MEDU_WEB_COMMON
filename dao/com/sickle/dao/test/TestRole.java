package com.sickle.dao.test;

import com.sickle.pojo.role.OpAndValue;


public class TestRole
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		System.out.println(OpAndValue.LOGIN.getValue( ));
		System.out.println(OpAndValue.REGISTER.getValue( ));
		System.out.println(OpAndValue.LOGOUT.getValue( ));
	}

}
