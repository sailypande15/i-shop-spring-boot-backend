package com.saily.springpractice.ishop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ratings")
public class Ratings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ratingId;	
	private Double rate;
	private int count;
	
	
	
	public Ratings() {
		super();
		
	}
	public Ratings(Double rate, int count) {
		super();
		this.rate = rate;
		this.count = count;
	}

	@OneToOne(mappedBy = "rating")	
	private Product product;
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Long getRatingId() {
		return ratingId;
	}
	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ratingId = "+ratingId+"  rate = "+rate+"  count = "+count+"]";
	}
	
}
