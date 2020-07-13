package text.com.neusoft.entity;

import com.neusoft.entity.Product;
import org.junit.Test;

public class ProductTest {
    @Test
    void  test(){
        Product product1= new Product(001,1,"可乐");
        System.out.println(product1);
        Product product2= new Product(002,2,"牛奶");
        System.out.println(product2);
        Product product3= new Product(001,1,"可乐");
        System.out.println(product3);


    }
}
