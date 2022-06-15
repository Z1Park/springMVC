package hello.itemservice.domain.item;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    private Boolean open; // 판매 여부
    private List<String> regions; //등록 지역
    private ItemType itemType; // 아이템 타입
    private String deliveryCode; // 배송 방식

    public Item() {
    }

    public Item(String itemName, int price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
