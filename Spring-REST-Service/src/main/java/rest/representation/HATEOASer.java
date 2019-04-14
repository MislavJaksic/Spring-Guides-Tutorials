package rest.representation;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

public class HATEOASer {
	public static Link createLink(String hyperlink, String relation_type) {
		Link link = new Link(hyperlink, relation_type);
		return link;
	}
	
	public static Link createControllerLink(Class<?> controller_class, String relation_type) {
		Link link = ControllerLinkBuilder.linkTo(controller_class).withRel(relation_type);
		return link;
	}
}
