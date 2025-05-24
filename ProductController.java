@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product create(@RequestBody ProductDto dto) {
        return service.createProduct(dto);
    }
}
