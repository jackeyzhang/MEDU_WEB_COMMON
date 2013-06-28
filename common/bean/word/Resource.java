/**
 * 
 */
package bean.word;

import java.io.Serializable;

/**
 * 资源
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-26
 * 8:41:36
 *
 * TODO:
 */
public class Resource implements Serializable {
	
	private static final long serialVersionUID = 7144153147163077573L;

	private String path;
	
	private String type;
	
	public Resource() {
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	

}
