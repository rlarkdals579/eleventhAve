package eleventhAvenue.assignment.domain;

import eleventhAvenue.assignment.exception.NotEnoughStockException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
    private ItemStatus itemStatus;
    private int sellerId;
    private String sellerName;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();


    public void addStock(int quantity) {
        this.stockQuantity += quantity;
    }

    public void removeStock(int quantity) {
        int restStock = this.stockQuantity - quantity;
        if (restStock < 0) {
            throw new NotEnoughStockException("재고가 부족합니다.");
        }
        if (restStock == 0){
            itemStatus = ItemStatus.SOLD;
        }
        this.stockQuantity = restStock;
    }
}
