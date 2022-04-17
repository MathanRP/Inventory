package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicinelists")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productid;
    private String medicinename;
    private String stock;
    private String mrp;
    public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getMedicinename() {
		return medicinename;
	}
	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	private String offer;
     

}
