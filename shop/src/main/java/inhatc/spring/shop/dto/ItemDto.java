package inhatc.spring.shop.dto;

import inhatc.spring.shop.constant.ItemSellStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Lob;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {

    private Long id;    //기본키 설정 , 상품 id

    private String itemNm;          //상품명

    private int price;              //가격

    private int stockNumber;        //재고 수량

    private String itemDetail;      //상품 상세 설명

    private String itemSellStatus;      //상품 판매 상태

    private LocalDateTime regTime;      //상품 등록 시간

    private LocalDateTime updateTime;   //상품 수정 시간
}
