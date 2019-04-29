## [Spring HATEOAS](https://spring.io/projects/spring-hateoas)

* [Javadoc](https://docs.spring.io/spring-hateoas/docs/current/apidocs/)  
* [Reference manual](https://docs.spring.io/spring-hateoas/docs/current/reference/html/)  

### Usage

Extend a resource with "ResourceSupport".  

Add links with:  
```
this.add(linkTo(methodOn(ExampleController.class).getExample(value_one, value_two)).withRel(Link.REL_SELF));
```
