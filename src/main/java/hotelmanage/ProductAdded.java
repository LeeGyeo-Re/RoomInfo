package hotelmanage;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class ProductAdded extends AbstractEvent  {



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer productId;
    private String productName;
    private Integer productCnt;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCnt() {
        return productCnt;
    }

    public void setProductCnt(Integer productCnt) {
        this.productCnt = productCnt;
    }



    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }




}
