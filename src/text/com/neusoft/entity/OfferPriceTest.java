package text.com.neusoft.entity;

import com.neusoft.entity.OfferPrice;
import org.junit.Test;

public class OfferPriceTest {
    @Test
    void test(){
        OfferPrice offerPrice1 = new OfferPrice(001,001,"2020-1-1","2020-7-15",2.5,"null");
        System.out.println(offerPrice1);
        OfferPrice offerPrice2 = new OfferPrice(002,002,"1999-11-1","2020-9-11",5.0,"特价");
        System.out.println(offerPrice2);
        OfferPrice offerPrice3 = new OfferPrice(003,003,"1998-12-1","2020-8-1",10.0,"原价");
        System.out.println(offerPrice3);
    }
}
