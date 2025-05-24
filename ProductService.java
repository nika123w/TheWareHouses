@Service
public class ProductService {
    private final ProductRepository repo;
    private final WarehouseRepository warehouseRepo;
    private final ShopRepository shopRepo;

    public ProductService(ProductRepository repo, WarehouseRepository warehouseRepo, ShopRepository shopRepo) {
        this.repo = repo;
        this.warehouseRepo = warehouseRepo;
        this.shopRepo = shopRepo;
    }

    public Product createProduct(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.name);
        product.setPrice(dto.price);
        product.setQuantity(dto.quantity);
        product.setWarehouse(warehouseRepo.findById(dto.warehouseId).orElseThrow());
        product.setShop(shopRepo.findById(dto.shopId).orElseThrow());
        return repo.save(product);
    }
}
