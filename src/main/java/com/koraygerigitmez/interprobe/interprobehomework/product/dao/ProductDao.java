package com.koraygerigitmez.interprobe.interprobehomework.product.dao;

import com.koraygerigitmez.interprobe.interprobehomework.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {

    List<Product> findAllByExpireDateIsAfterAndExpireDateIsNotNull(Date expireDate);
    //Son kullanma tarihi geçmiş ürünleri listeleyen metot

    List<Product> findAllByExpireDateIsBeforeOrExpireDateNull(Date expireDate);
    //Son kullanma tarihi geçmemiş ürünleri listeleyen metot

}
