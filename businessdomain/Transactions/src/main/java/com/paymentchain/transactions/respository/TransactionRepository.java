package com.paymentchain.transactions.respository;


import com.paymentchain.transactions.entities.Transactions;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author luis
 */
public interface TransactionRepository extends JpaRepository<Transactions, Long> {
    
      @Query("SELECT t FROM Transactions t WHERE t.ibanAccount = ?1")
      public List<Transactions> findByIbanAccount(String ibanAccount);
      
}
