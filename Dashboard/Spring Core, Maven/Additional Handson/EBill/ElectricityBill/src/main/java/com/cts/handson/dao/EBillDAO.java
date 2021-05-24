package com.cts.handson.dao;

import com.cts.handson.model.EBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.sql.Savepoint;
import java.util.List;

@Service
@ComponentScan("com.cts.handson")
public class EBillDAO {
    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager txManager;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public PlatformTransactionManager getTxManager() {
        return txManager;
    }

    @Autowired
    public void setTxManager(PlatformTransactionManager txManager) {
        this.txManager = txManager;
    }

    public void deleteBill(long... billNumbers) {
        DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = txManager.getTransaction(defaultTransactionDefinition);
        Savepoint savepoint = (Savepoint) transactionStatus.createSavepoint();

        try {
            for (long billNumber : billNumbers) {
                if (billNumber >= 100) {
                    jdbcTemplate.update("delete from ebill where bill_number = " + billNumber + ";");
                } else {

                    throw new Exception();
                }
            }
        } catch (Exception e) {
            transactionStatus.rollbackToSavepoint(savepoint);
            txManager.rollback(transactionStatus);
        }

        txManager.commit(transactionStatus);
        transactionStatus.flush();
    }

    public List<EBill> getAllBill() {
        BeanPropertyRowMapper<EBill> beanPropertyRowMapper = BeanPropertyRowMapper.newInstance(EBill.class);
        final String query = "select * from ebill;";

        return jdbcTemplate.query(query, beanPropertyRowMapper);
    }
}
