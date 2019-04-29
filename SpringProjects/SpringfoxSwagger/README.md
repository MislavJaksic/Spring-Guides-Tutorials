## [Springfox Swagger](http://springfox.github.io/springfox/)

* [Javadoc](http://springfox.github.io/springfox/javadoc/current/)  
* [Reference manual](http://springfox.github.io/springfox/docs/current/)  

### Usage

Documents REST APIs, creates a UI and exposes it using a web page.  

Create a Swagger class then visit "localhost:8080/swagger-ui.html" to see the UI.  

### Swagger class

```
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
}
```