package com.saleshistory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Costs {
	@ManyToOne
	@JoinColumn(name="channel_id")
	private Channels channelID;
	@Id
	@GeneratedValue
	@Column(name="cost_id")
	private int costId; 
	@ManyToOne
	@JoinColumn(name="prod_id")
	private Products prodID; 
	@ManyToOne
	@JoinColumn(name="promo_id")
	private Promotions promoID;  
	@ManyToOne
	@JoinColumn(name="time_id")
	private Times timeID;
	@Column(name="unit_cost")
	private double unitCost; 
	@Column(name="unit_price")
	private double unitPrice;
	
	
	public Costs() {
		super();
	}
	public Costs(Channels channelID, int costId, Products prodID, Promotions promoID, Times timeID, double unitCost,
			double unitPrice) {
		super();
		this.channelID = channelID;
		this.costId = costId;
		this.prodID = prodID;
		this.promoID = promoID;
		this.timeID = timeID;
		this.unitCost = unitCost;
		this.unitPrice = unitPrice;
	}
	public Channels getChannelID() {
		return channelID;
	}
	public void setChannelID(Channels channelID) {
		this.channelID = channelID;
	}
	
	public int getCostId() {
		return costId;
	}
	public void setCostId(int costId) {
		this.costId = costId;
	}
	public Products getProdID() {
		return prodID;
	}
	public void setProdID(Products prodID) {
		this.prodID = prodID;
	}
	public Promotions getPromoID() {
		return promoID;
	}
	public void setPromoID(Promotions promoID) {
		this.promoID = promoID;
	}
	public Times getTimeID() {
		return timeID;
	}
	public void setTimeID(Times timeID) {
		this.timeID = timeID;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
		
}
