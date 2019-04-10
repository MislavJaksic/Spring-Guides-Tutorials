## Spring Web

### [Annotations](https://docs.spring.io/spring-framework/docs/current/javadoc-api/)

```
@Componenet -> autodetected classes
@Controller -> specialization of @Component
@ResponseBody -> bind return values to web body
@RestController -> @Controller and @ResponseBody

@RequestMapping -> map HTTP method request to class method
@GetMapping -> like @RequestMapping("GET")
@PostMapping -> ...
@PutMapping -> ...
@DeleteMapping -> ...
@PatchMapping -> ...

@RequestBody -> bind method param to web request body
@RequestParam -> bind method param to web request param
```