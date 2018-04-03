package edu.wctc.dj.week9.beans;

import edu.wctc.dj.week9.model.Cart;
import edu.wctc.dj.week9.model.CartService;
import edu.wctc.dj.week9.model.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jenna
 */
@Named(value = "yarncartBean")
@SessionScoped
public class yarncartBean implements Serializable {

   private final String sessionId;
   private final Cart cart;
   private final CartService cartService = new CartService();
   
    public yarncartBean() {
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
