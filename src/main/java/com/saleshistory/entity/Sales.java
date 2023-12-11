package com.saleshistory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sales {
	@Column(name="amount_sold")
	private double amountSold;
	@ManyToOne
	@JoinColumn(name = "channel_id")
	private Channels channelId;
	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customers custId;
	@ManyToOne
	@JoinColumn(name = "promo_id")
	private Promotions promoId;
	@ManyToOne
	@JoinColumn(name = "prod_id")
	private Products prodId;
	@Column(name="quantity_sold")
	private int quantitySold;
	@Id
	@GeneratedValue
	@Column(name="s_id")
	private int sId;
	@ManyToOne
	@JoinColumn(name = "time_id")
	private Times timeID;
	
	
	public Sales() {
		super();
	}
	public Sales(double amountSold, Channels channelId, Customers custId, Promotions promoId, Products prodId,
			int quantitySold, int sId, Times timeID) {
		super();
		this.amountSold = amountSold;
		this.channelId = channelId;
		this.custId = custId;
		this.promoId = promoId;
		this.prodId = prodId;
		this.quantitySold = quantitySold;
		this.sId = sId;
		this.timeID = timeID;
	}
	public double getAmountSold() {
		return amountSold;
	}
	public void setAmountSold(double amountSold) {
		this.amountSold = amountSold;
	}
	public Channels getChannelId() {
		return channelId;
	}
	public void setChannelId(Channels channelId) {
		this.channelId = channelId;
	}
	public Customers getCustId() {
		return custId;
	}
	public void setCustId(Customers custId) {
		this.custId = custId;
	}
	public Promotions getPromoId() {
		return promoId;
	}
	public void setPromoId(Promotions promoId) {
		this.promoId = promoId;
	}
	public Products getProdId() {
		return prodId;
	}
	public void setProdId(Products prodId) {
		this.prodId = prodId;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public Times getTimeID() {
		return timeID;
	}
	public void setTimeID(Times timeID) {
		this.timeID = timeID;
	}



}
