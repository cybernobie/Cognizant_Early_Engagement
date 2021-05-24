package com.cts.dao;

import com.cts.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ProductDaoImpl implements ProductDao {
    private JdbcTemplate template;

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public Product getProductDetails(final int product_code) {
        String sql = "select * from product where product_code = ?";
        BeanPropertyRowMapper<Product> productBeanPropertyRowMapper = BeanPropertyRowMapper.newInstance(Product.class);

        return template.queryForObject(sql, new Object[]{product_code}, productBeanPropertyRowMapper);
    }
}