## Spring Boot

### [Annotations](https://docs.spring.io/spring-boot/docs/current/api/)

```
@Componenet -> autodetected classes
@Configuration -> class declares at least one @Bean method
@SpringBootConfiguration -> unique; provides Spring Boot config
@EnableAutoConfiguration -> guess @Configuration values
@ComponentScan -> scans the whole package for @Component
@SpringBootApplication -> @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentScan
```