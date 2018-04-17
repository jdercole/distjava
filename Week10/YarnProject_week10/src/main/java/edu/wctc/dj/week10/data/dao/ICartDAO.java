
package edu.wctc.dj.week10.data.dao;

import edu.wctc.dj.week10.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICartDAO extends JpaRepository<Cart,String>{
    
}
