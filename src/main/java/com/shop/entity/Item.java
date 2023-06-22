package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item {
    @Id  // 기본키 지정
    @Column(name="item_id")  // 필드와 컬럼 매핑
    @GeneratedValue(strategy = GenerationType.AUTO)  // JPA 구현체가 자동으로 생성 전략 결정
    private Long id;  // 상품 코드

    @Column(nullable = false, length = 50)
    private String itemNm;  // 상품명

    @Column(name = "price", nullable = false)
    private int price;  // 가격

    @Column(nullable = false)
    private int stockNumber;  // 재고수량

    @Lob  // BLOB, CLOB 타입 매핑
    @Column(nullable = false)
    private String itemDetail;  // 상품 상세 설명

    @Enumerated(EnumType.STRING)  // enum 타입 매핑
    private ItemSellStatus itemSellStatus;  // 상품 판매 상태

    private LocalDateTime regTime;  // 등록 시간

    private LocalDateTime updateTime;  // 수정 시간
}
