## [Spring Boot](https://spring.io/projects/spring-boot)

* [Javadoc](https://docs.spring.io/spring-boot/docs/current/api/)  
* [Reference manual](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  

### Annotations

```
@SpringBootApplication -> @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentScan

@SpringBootConfiguration -> unique; provides Spring Boot config
@EnableAutoConfiguration -> guesses scanned class @Configuration value
@ComponentScan -> scans packages beneath the class for @Component

@Component -> autodetected class
@Configuration -> class declares at least one @Bean method
```