@RestController
@RequestMapping("/shops")
public class ShopController {
    private final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }

    @PostMapping
    public Shop create(@RequestBody ShopDto dto) {
        return service.createShop(dto);
    }
}
