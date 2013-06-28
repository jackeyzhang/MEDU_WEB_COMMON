/**
 * 
 */
package bean.word;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangchenhao
 *
 *
 * 2013-5-26
 * 8:37:28
 *
 * TODO:
 */
public class Word implements Serializable {

	private static final long serialVersionUID = -2591485546266989995L;

	private int id;
	
	//д�� ������ͨ���ֵ�д�� ������Щ�ָ���Ҫͼ�α�ʾ ����չ
	private String spell;
	
	//���� ���ǵ�������
	private List<Sound> sounds;
	
	public Word() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the spell
	 */
	public String getSpell() {
		return spell;
	}

	/**
	 * @param spell the spell to set
	 */
	public void setSpell(String spell) {
		this.spell = spell;
	}

	/**
	 * @return the sounds
	 */
	public List<Sound> getSounds() {
		return sounds;
	}

	/**
	 * @param sounds the sounds to set
	 */
	public void setSounds(List<Sound> sounds) {
		this.sounds = sounds;
	}

}
