package demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dog")
public class Dog extends Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private String favoriteToy;
	
	String getFavoriteToy() {
		return favoriteToy;
	}

	void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}

	/* package */ Dog() {
		super();
	}
}
