package rest.representation;

import org.springframework.hateoas.Link;

public class RelationTypes {
	public static final String ATOM_NAMESPACE = Link.ATOM_NAMESPACE;
	
	public static final String FIRST = Link.REL_FIRST;
	public static final String LAST = Link.REL_LAST;
	public static final String NEXT = Link.REL_NEXT;
	public static final String PREVIOUS = Link.REL_PREVIOUS;
	public static final String SELF =Link. REL_SELF;
	
	public static final String HEAD = "head";
	public static final String GET = "get";
	public static final String PUT = "put";
	public static final String POST = "post";
	public static final String DELETE = "delete";
}
