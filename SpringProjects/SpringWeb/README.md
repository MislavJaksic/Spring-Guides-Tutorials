## Spring Web

### [Annotations](https://docs.spring.io/spring-framework/docs/current/javadoc-api/)

```
@Component -> autodetected class
@Controller -> specialization of @Component
@ResponseBody -> bind return values to Entity-Body
@RestController -> @Controller and @ResponseBody

@RequestMapping -> map HTTP method request to class method
@GetMapping -> like @RequestMapping("GET")
@PostMapping -> ...
@PutMapping -> ...
@DeleteMapping -> ...
@PatchMapping -> ...

@PathVariable -> bind parameter to URI path variable
@RequestParam -> bind parameter to URI query variable
@RequestBody -> bind parameter to request Entity-Body
```