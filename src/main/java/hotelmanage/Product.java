package hotelmanage;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Qualifier("product")
@Table(name="ProductInfo_table")
public class Product {

    @Id @GeneratedValue
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
