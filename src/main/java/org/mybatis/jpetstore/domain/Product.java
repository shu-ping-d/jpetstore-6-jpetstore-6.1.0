package org.mybatis.jpetstore.domain;

import com.sun.istack.NotNull;

import java.io.Serializable;

/**
 * The Class Product.
 *
 * @author Eduardo Macarron
 */
import javax.persistence.*;
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = -7492639752670189553L;
    @Id @NotNull
    @Column(name = "productid")
    private String productId;
    @Column(name = "categoryid")
    private String categoryId;
    private String name;
    private String description;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getName();
    }

}
