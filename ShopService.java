@Service
public class ShopService {
    private final ShopRepository shopRepo;
    private final WarehouseRepository warehouseRepo;

    public ShopService(ShopRepository shopRepo, WarehouseRepository warehouseRepo) {
        this.shopRepo = shopRepo;
        this.warehouseRepo = warehouseRepo;
    }

    public Shop createShop(ShopDto dto) {
        Shop shop = new Shop();
        shop.setName(dto.name);
        List<Warehouse> warehouses = warehouseRepo.findAllById(dto.warehouseIds);
        shop.setWarehouses(warehouses);
        return shopRepo.save(shop);
    }
}
