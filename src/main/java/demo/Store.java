package demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Store {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany
	private List<Animal> animals;

	/* package */ Store() {
		/* empty */
	}
	
	List<Animal> getAnimals() {
		return animals;
	}

	public void addAnimal(final Animal animal) {
		this.animals.add(animal);
	}
	
	void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	long getId() {
		return id;
	}
}
