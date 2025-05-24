@Entity
public class Warehouse {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "warehouses")
    private List<Shop> shops = new ArrayList<>();

}
