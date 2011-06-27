package demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.MappedSuperclass;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="animalType",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue("animal")
public class Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column 
	private String name;
	
	/* package */ Animal() {
		/* empty */
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	long getId() {
		return id;
	}
	
	
}
