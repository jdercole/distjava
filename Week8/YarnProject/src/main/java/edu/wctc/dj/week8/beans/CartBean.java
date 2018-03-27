package edu.wctc.dj.week8.beans;

import edu.wctc.dj.week8.model.Cart;
import edu.wctc.dj.week8.model.CartService;
import edu.wctc.dj.week8.model.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jenna
 */
@Named(value = "cartBean")
@SessionScoped
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
