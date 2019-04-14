package rest.representation;

import org.springframework.hateoas.Link;

public class RelationTypes {
	public static final String ATOM_NAMESPACE = Link.ATOM_NAMESPACE;
	
	public static final String FIRST = Link.REL_FIRST;
	public static final String LAST = Link.REL_LAST;
	public static final String NEXT = Link.REL_NEXT;
	public static final String PREVIOUS = Link.REL_PREVIOUS;
	public static final String SELF =Link. REL_SELF;
	
	public static final String HEAD = "HEAD";
	public static final String GET = "GET";
	public static final String PUT = "PUT";
	public static final String POST = "POST";
	public static final String DELETE = "DELETE";
	
	public static final String ZOO = "ZOO";
	public static final String CONTRACT = "CONTRACT";
	public static final String ANIMAL = "ANIMAL";
}
