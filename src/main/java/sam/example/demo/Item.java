package sam.example.demo;


public class Item {
    private Integer id;
    private String code;
    private String name;
    private String category;
    private String quantity;

    public Item(Integer id, String code, String name, String category, String quantity) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }


    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getQuantity() {
        return quantity;
    }
}