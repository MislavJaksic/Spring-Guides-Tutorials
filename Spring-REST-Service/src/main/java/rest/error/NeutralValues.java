package rest.error;

import rest.resource.Animal;
import rest.resource.Enclosure;
import rest.resource.Zoo;

public class NeutralValues {
	public static final Integer MIN_INTEGER = 0;
	public static final Integer MAX_INTEGER = Integer.MAX_VALUE;
	
	public static final String STRING = "";
	public static final String MIN_INTEGER_STRING = "0";
	public static final String MAX_INTEGER_STRING = "2147483647";
	
	public static final Animal ANIMAL = new Animal(NeutralValues.STRING, NeutralValues.STRING, NeutralValues.STRING);
	public static final Enclosure ENCLOSURE = new Enclosure(NeutralValues.STRING, NeutralValues.STRING);
	public static final Zoo ZOO = new Zoo(NeutralValues.STRING, NeutralValues.MIN_INTEGER);
}
