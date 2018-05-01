package edu.wctc.dj.week12.services;

import edu.wctc.dj.week12.model.Cart;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartService {
     private static final Map<String, Cart> CONTENTS = new HashMap<String, Cart>();
    
    public Cart getContents(String sessionId) {
        Cart cart = CONTENTS.computeIfAbsent(sessionId, 
                new Function<String, Cart>() {
                @Override
                public Cart apply(String t) {
                    return new Cart();
                }
            });
        return cart;
    }
    
    public void update(String sessionId, Cart cart) {
        CONTENTS.put(sessionId, cart);
    }
    
    public void delete(String sessionId) {
        CONTENTS.remove(sessionId);
    }
}
