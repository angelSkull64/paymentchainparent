package com.paymentchain.product.respository;

import com.paymentchain.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author luis
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
