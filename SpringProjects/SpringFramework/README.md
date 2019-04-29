## [Spring Framework](https://spring.io/projects/spring-framework)

* [Javadoc](https://docs.spring.io/spring-framework/docs/current/javadoc-api/)  
* [Reference manual](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/)  

### Annotations

```
@RestController -> @Controller and @ResponseBody

@Controller -> specialization of @Component
@ResponseBody -> binds return values to Entity-Body

@Component -> autodetected class

@RequestMapping -> maps HTTP method request to class method
@GetMapping -> like @RequestMapping("GET")
@PostMapping -> ...
@PutMapping -> ...
@DeleteMapping -> ...
@PatchMapping -> ...

@PathVariable -> binds parameter to URI path variable
@RequestParam -> binds parameter to URI query variable
@RequestBody -> binds parameter to request Entity-Body
```