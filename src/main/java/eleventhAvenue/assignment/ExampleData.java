package eleventhAvenue.assignment;

import eleventhAvenue.assignment.domain.*;
import eleventhAvenue.assignment.domain.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class ExampleData {

    private final InitService initService;

    @PostConstruct
    public void example() {
        initService.exData1();
        initService.exData2();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void exData1() {
            Member member = createMember("회원1", "1111");
            em.persist(member);

            Item item1 = createItem("맥북 프로", 34000000, 100, ItemStatus.SALE, 1001, "애플");
            em.persist(item1);

            Item item2 = createItem("문화상품권", 10000, 10, ItemStatus.SALE, 1002, "기프티콘");
            em.persist(item2);

            Item item3 = createItem("메모리", 143880, 50000, ItemStatus.SALE, 1003, "하이닉스");
            em.persist(item3);


            OrderItem orderItem1 = OrderItem.createOrderItem(item1, item1.getPrice(), 1);

            Delivery delivery = createDelivery(member);
            Order order = Order.createOrder(member, delivery, orderItem1);
            em.persist(order);
        }

        public void exData2() {
            Member member = createMember("회원2", "2222");
            em.persist(member);

            Item item1 = createItem("SK노트북", 50000000, 40, ItemStatus.SALE, 1004, "11번가");
            em.persist(item1);

            Item item2 = createItem("도서상품권", 5000, 10, ItemStatus.SALE, 1005, "컬쳐랜드");
            em.persist(item2);

            Item item3 = createItem("최고의 반도체", 90000, 550, ItemStatus.SALE, 1006, "SK 하이닉스");
            em.persist(item3);

            OrderItem orderItem1 = OrderItem.createOrderItem(item1, item1.getPrice(), 7);


            Delivery delivery = createDelivery(member);
            Order order = Order.createOrder(member, delivery, orderItem1);
            em.persist(order);
        }

        private Member createMember(String name, String zipcode) {
            Member member = new Member();
            member.setName(name);
            member.setAddress(new Address(zipcode));
            return member;
        }

        private Item createItem(String name, int price, int stockQuantity, ItemStatus itemStatus, int sellerId, String sellerName) {
            Item item1 = new Item();
            item1.setName(name);
            item1.setPrice(price);
            item1.setStockQuantity(stockQuantity);
            item1.setItemStatus(itemStatus);
            item1.setSellerId(sellerId);
            item1.setSellerName(sellerName);
            return item1;
        }

        private Delivery createDelivery(Member member) {
            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            return delivery;
        }
    }
}

