package rest.uri;

public class AlgorithmicURIs {
	public static final String FIND_ZOOS = BaseURIs.ROOT + "/zoos";
	public static final String FIND_ENCLOSURES = BaseURIs.ROOT + "/{zoo_name}/enclosures";
	public static final String FIND_ANIMALS = BaseURIs.ROOT + "/{zoo_name}/{enclosure_id}/animals";
}
