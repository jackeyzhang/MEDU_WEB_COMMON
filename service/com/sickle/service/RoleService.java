/**
 * 
 */
package com.sickle.service;

import java.util.ArrayList;
import java.util.List;

import com.sickle.pojo.role.OpAndValue;
import com.sickle.pojo.role.Role;
import com.sickle.service.itf.IRoleService;


/**
 * 角色权限服务
 * 
 * @author chenhao
 *
 */
public class RoleService implements IRoleService
{

	@Override
	public boolean validateOp( Role role, OpAndValue op )
	{
		if(getOp(role).contains( op ))
		{
			return true;
		}
		return false;
	}


	@Override
	public List<OpAndValue> getOp( Role role)
	{
		List<OpAndValue> values = new ArrayList<OpAndValue>();
		Integer opvalue = role.getOpvalue( );
		String opvaluestr = Integer.toBinaryString( opvalue );
		for(OpAndValue op : OpAndValue.values( ))
		{
			int index = op.getIndex( );
			if("1".equals( opvaluestr.indexOf( index ) ))
			{
				values.add( op );
			}
		}
		return values;
	}

}
