package com.cts.service;


import com.cts.bean.Product;
import com.cts.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private JdbcTemplate jdbcTemplate;
    private ProductDao productDao;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Product getProductDetails(int product_code) {
        return productDao.getProductDetails(product_code);
    }

    public double calculatePrice(int quantity, double product_price) {
        return (double) quantity * product_price;
    }

    public boolean validateProductCode(int product_code) {
        return String.valueOf(product_code).length() == 4;
    }

    public boolean validateQuantity(int quantity) {
        return quantity > 0;
    }
}
