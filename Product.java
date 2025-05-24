@Entity
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int quantity;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Shop shop;

}
