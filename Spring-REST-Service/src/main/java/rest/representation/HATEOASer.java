package rest.representation;

import java.lang.reflect.Method;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

public class HATEOASer {
	public static Link createGetLink(String hyperlink) {
		Link link = new Link(hyperlink, RelationTypes.GET);
		return link;
	}
	
	
	
	public static Link createLink(String hyperlink, String relation_type) {
		Link link = new Link(hyperlink, relation_type);
		return link;
	}
	
	public static Link createControllerLink(Class<?> controller_class, String relation_type) {
		Link link = ControllerLinkBuilder.linkTo(controller_class).withRel(relation_type);
		return link;
	}
	
	public static Link createMethodLink(Method method, String identifier, String relation_type) {
		Link link = ControllerLinkBuilder.linkTo(method, identifier).withRel(relation_type);
		return link;
	}
}
