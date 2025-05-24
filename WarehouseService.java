@Service
public class WarehouseService {
    private final WarehouseRepository repo;

    public WarehouseService(WarehouseRepository repo) {
        this.repo = repo;
    }

    public Warehouse createWarehouse(WarehouseDto dto) {
        Warehouse warehouse = new Warehouse();
        warehouse.setName(dto.name);
        return repo.save(warehouse);
    }
}
