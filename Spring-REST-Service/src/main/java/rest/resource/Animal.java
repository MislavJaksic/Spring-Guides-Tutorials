package rest.resource;

public class Animal {
	public String species;
	public String sex;
	
	
	
	public Animal(String species, String sex) {
		this.species = species;
		this.sex = sex;
	}
	
	
	
	@Override
	public String toString() {
		return "Animal [species=" + species + ", sex=" + sex + "]";
	}
}
