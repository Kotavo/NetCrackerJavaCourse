package com.notnetcracker.repository;

import com.notnetcracker.entity.Buyer;
import com.notnetcracker.entity.Order;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QueryRepository extends JpaRepository<Order, Integer> {

    //2.a Все различные названия книг
    @Query(value = "select distinct book_name  from books", nativeQuery = true)
    List<String> getAllBookName();

    //2.a Все различные стоимости книг
    @Query(value = "select distinct book_cost from books", nativeQuery = true)
    List<BigDecimal> getAllBookCost();

    //2.a Все различные названия и стоимости книг
    @Query(value = "select distinct book_name , book_cost   from books", nativeQuery = true)
    List<Object> getAllBookNameAndCost();

    //2.b Все районы, в которых проживают покупатели
    @Query(value = "select distinct buyer_district from buyers", nativeQuery = true)
    List<String> getAllBuyersDistrict();

    //2.c Месецы, в которых производились покупки
    @Query(value = "select distinct(extract(month from order_date))  from orders ", nativeQuery = true)
    List<Date> getAllMonth();

    //3.a Фамилии и размер скидки всех покупателей, проживающих в Нижегородском районе;
    @Query( value = "select buyer_name, buyer_discount from buyers where buyer_district ='Nizhegorodsky' ", nativeQuery = true)
    List<Object> getBuyerFromNizh();

    //3.b Названиях магазинов Сормовского или Советского районов
    @Query(value = "select store_name from store where store_district = 'Sormovsky' or store_district = 'Sovetsky'", nativeQuery = true)
    List<String> getStoreName();

    //3.с Названия  и стоимость книг, в которых встречается слово Windows,
    // или стоящих более 20000 руб. Вывод результатов организовать по названию и убыванию цены книг.
    @Query( value = "select book_name, book_cost from books where book_name like '%Windows%' or book_cost > 20000 " +
                    "order by book_name, book_cost ", nativeQuery = true)
    List<Object> getWindowsBook();

    //4.a Фамилия покупателя и название магазина, где производилась покупка;
    @Query(value = "select b.buyer_name, s.store_name\n" +
        "from buyers b, store s, orders o\n" +
        "where o.order_buyer = b.buyer_id\n" +
        "and o.order_seller = s.store_id\n" +
        "order by b.buyer_name", nativeQuery = true)
    List<Object> getBuyerAndStoreName();

    //4.b Дата, фамилия покупателя, скидка, название и количество купленных книг.
    @Query(value = "select o.order_date, b.buyer_name , b.buyer_discount , bk.book_name , o.order_amount " +
        "from orders o, buyers b, books bk " +
        "where o.order_buyer = b.buyer_id and o.order_book = bk.book_id", nativeQuery = true)
    List<Object> getOrderDateAndBuyerName();

    //5.a Номер заказа, фамилия покупателя и даты, в которых было продано книг на сумму не меньшую чем 60000 руб.
    @Query(value = "select o.order_id, b.buyer_name , o.order_date , o.order_amount " +
        "from orders o, buyers b " +
        "where o.order_buyer = b.buyer_id and o.order_amount >=60000", nativeQuery = true)
    List<Object> getLargeOrder();


    //5.b Покупки, сделанные покупателем в своем районе не ранее марта месяца.
    // Вывести фамилию покупателя, район, дату. Произвести сортировку;
    @Query(value = "select b.buyer_name , b.buyer_district , o.order_date " +
        "from orders o, buyers b, store s " +
        "where o.order_buyer = b.buyer_id and o.order_seller = s.store_id and " +
        " s.store_district = b.buyer_district and o.order_date >= '2019.04.01' " +
        "order by o.order_date", nativeQuery = true)
    List<Object> getOrderAfterMarch();

    //5.c Магазины, расположенные в любом районе, кроме Автозаводского, где покупали книги те, у кого скидка от 10 до 15 %;
    @Query(value = "select s.store_name , s.store_district , b.buyer_name, b.buyer_discount " +
        "from orders o, store s, buyers b  " +
        "where s.store_district !='Avtozavodsky' and b.buyer_discount >=10 and " +
        "b.buyer_discount <=15 and o.order_seller = s.store_id and o.order_buyer = buyer_id", nativeQuery = true)
    List<Object> getStoreExceptAvtoz();


    //5.d Данные по покупке книг (название, район складирования, количество),
    // приобретенных в районе складирования и содержащихся в запасе более 10 штук.
    // Включить данные о стоимости и отсортировать по возрастанию.
    @Query(value = "select b.buyer_name , bk.book_name , bk.book_deport, bk.book_quantity, o.order_amount " +
        "from orders o, books bk, buyers b, store s " +
        "where o.order_book = bk.book_id and o.order_buyer = b.buyer_id and o.order_seller = s.store_id " +
        "and s.store_district = bk.book_deport and bk.book_quantity > 10 " +
        "order by o.order_amount", nativeQuery = true)
    List<Object> getOrderAndDeportInfo();
}
