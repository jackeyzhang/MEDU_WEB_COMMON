/**
 * 
 */
package bean.word;

import java.io.Serializable;

/**
 * 声音文件
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-26
 * 8:40:03
 *
 * TODO:
 */
public class Sound implements Serializable {

	private static final long serialVersionUID = 2176160534769359629L;

	private int id;
	
	private Resource resource;

	public Sound() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
