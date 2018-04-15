package edu.wctc.dj.week10.beans;

import edu.wctc.dj.week10.model.Cart;
import edu.wctc.dj.week10.services.CartService;
import edu.wctc.dj.week10.model.Product;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jenna
 */
@Component(value = "cartBean")
@Scope("session")
public class CartBean implements Serializable {

   private final String sessionId;
   private final Cart cart;
   private final CartService cartService = new CartService();
   
    public CartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);
        
        cart = cartService.getContents(sessionId);
    }
    
    public int getItemsInCart(){
        return cart.getItemsInCart();
    }
    
    public void addToCart(Product product){
        cart.add(product);
        cartService.update(sessionId, cart);
    }
    
    public void removeFromCart(Product product) {
        cart.remove(product);
        cartService.update(sessionId, cart);
    }
    
}
