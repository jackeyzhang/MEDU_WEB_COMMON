/**
 * 
 */
package bean.word;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/**
 * 关系
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-26
 * 8:47:19
 *
 * TODO:
 */
public class Relation implements Serializable {

	private static final long serialVersionUID = -8011983967185166178L;

	private int id;
	
	private Expression expresssion;
	
	private List<Relation> relations = new ArrayList<Relation>();
	
	public Relation() {
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
	 * @return the expresssion
	 */
	public Expression getExpresssion() {
		return expresssion;
	}

	/**
	 * @param expresssion the expresssion to set
	 */
	public void setExpresssion(Expression expresssion) {
		this.expresssion = expresssion;
	}

	/**
	 * @return the relations
	 */
	public List<Relation> getRelations() {
		return relations;
	}

	/**
	 * @param relations the relations to set
	 */
	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}

}
