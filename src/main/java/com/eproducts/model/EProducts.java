package com.eproducts.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "e_products")
public class EProducts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private int productId;

	private String productBrand;

	@Column(name = "productName")
	private String productName;

	private BigDecimal productPrice;

	// @CreatedDate
	private LocalDateTime createdDate;

	public EProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EProducts(int productId, String productBrand, String productName, BigDecimal productPrice,
			LocalDateTime createdDate) {
		super();
		this.productId = productId;
		this.productBrand = productBrand;
		this.productName = productName;
		this.productPrice = productPrice;
		this.createdDate = createdDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice.setScale(6, BigDecimal.ROUND_HALF_UP);
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "EProducts [productId=" + productId + ", productBrand=" + productBrand + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", createdDate=" + createdDate + "]";
	}

}
