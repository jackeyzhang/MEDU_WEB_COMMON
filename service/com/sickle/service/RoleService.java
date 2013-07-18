/**
 * 
 */
package com.sickle.service;

import java.util.ArrayList;
import java.util.List;

import com.sickle.pojo.role.Module;
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
	public boolean validateOp( Role role, Module module, OpAndValue op )
	{
		if(getOp(role,module).contains( op ))
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Module> getModule( Role role )
	{
		Integer modulevalue = role.getModulevalue( );
		String modulevaluestr = Integer.toBinaryString( modulevalue );
		List<Module> modules = new ArrayList<Module>();
		for(Module m : Module.values( ))
		{
			int index = m.getIndex( );
			if("1".equals(modulevaluestr.indexOf( index )))
			{
				modules.add( m );
			}
		}
		
		return modules;
	}

	@Override
	public List<OpAndValue> getOp( Role role, Module module )
	{
		List<OpAndValue> values = new ArrayList<OpAndValue>();
		if(!getModule(role).contains( module ))
		{
			return values;
		}
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
