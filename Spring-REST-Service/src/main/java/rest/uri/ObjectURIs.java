package rest.uri;

public class ObjectURIs {
	public static final String GET_ZOO = BaseURIs.ROOT + "/{zoo_name}";
	public static final String GET_ENCLOSURE = BaseURIs.ROOT + "/{zoo_name}/{enclosure_id}";
	public static final String GET_ANIMAL = BaseURIs.ROOT + "/{zoo_name}/{enclosure_id}/{animal_tag}";
}
