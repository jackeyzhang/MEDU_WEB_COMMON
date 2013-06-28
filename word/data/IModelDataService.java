/**
 * 
 */
package data;

import java.util.List;


/**
 * @author zhangchenhao
 *
 *
 * 2013-5-27
 * 4:48:26
 *
 * TODO:
 */
public interface IModelDataService<T>{
	
	/**
	 * 根据名字获取model
	 * 
	 * @param modelName
	 * @return
	 */
	IModel getModelByName(String modelName);
	
	/**
	 * 根据类型获取到model
	 * @param modelType
	 * @return
	 */
	List<IModel> listModelByType(String modelType);
	
	/**
	 * 列出所有model
	 * @return
	 */
	List<IModel> listAllModel();

}
