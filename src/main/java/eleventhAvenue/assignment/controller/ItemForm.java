package eleventhAvenue.assignment.controller;

import eleventhAvenue.assignment.domain.ItemStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemForm {

    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    private ItemStatus itemStatus;
    private int sellerId;
    private String sellerName;
}
