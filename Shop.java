@Entity
public class Shop {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "shop_warehouse",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name = "warehouse_id")
    )
    private List<Warehouse> warehouses = new ArrayList<>();

}
