package inhatc.spring.shop.repository;

import inhatc.spring.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {

    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThanOrderByPriceDesc(int price);

    List<Item> findByStockNumberGreaterThanEqualAndItemNmLikeOrderByPriceAsc(int stockNumber, String itemNm);       //쿼리 메소드 과제

    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")      //default가 value
    List<Item> findByDetail(@Param("itemDetail") String itemDetail);            //JPQL 테스트

    @Query("select i from Item i where i.stockNumber>=150 and i.itemNm like %:itemNm% order by i.price desc")
    List<Item> findByStockNumberAndItemNm(@Param("itemNm")  String itemNm);      //JPQL 메소드 과제

    @Query(value = "select * from Item i where i.item_Detail like %:itemDetail% order by i.price desc", nativeQuery = true)      
    List<Item> findByDetailNative(@Param("itemDetail") String itemDetail);      //Native 테스트

    @Query(value = "select * from Item i where i.stock_Number>=150 and i.item_Nm like %:itemNm% order by i.price desc", nativeQuery = true)
    List<Item> findByStockNumberAndItemNmNative(@Param("itemNm")  String itemNm);      //Native 메소드 과제
}
