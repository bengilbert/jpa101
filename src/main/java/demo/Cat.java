package demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Animal implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private String favoriteFood;
	
	/* package */ Cat() {
		super();
	}

	String getFavoriteFood() {
		return favoriteFood;
	}

	void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

}
