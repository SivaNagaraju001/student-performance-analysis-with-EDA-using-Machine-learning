package com.saleshistory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Channels {
	@Column(name="channel_class_id")
	private int channelClassId; 
	@Id
	@GeneratedValue
	@Column(name="channel_id")
	private int channelId;
	@Column(name="channel_total_id")
	private int channelTotalId; 
	@Column(name="channel_class")
	private String channelClass; 
	@Column(name="channel_desc")
	private String channelDesc; 
	@Column(name="channel_total")
	private String channelTotal;
	public Channels() {
		super();
	}

	public Channels(int channelClassId, int channelId, int channelTotalId, String channelClass, String channelDesc,
			String channelTotal) {
		super();
		this.channelClassId = channelClassId;
		this.channelId = channelId;
		this.channelTotalId = channelTotalId;
		this.channelClass = channelClass;
		this.channelDesc = channelDesc;
		this.channelTotal = channelTotal;
	}
	public int getChannelClassId() {
		return channelClassId;
	}
	public void setChannelClassId(int channelClassId) {
		this.channelClassId = channelClassId;
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public int getChannelTotalId() {
		return channelTotalId;
	}
	public void setChannelTotalId(int channelTotalId) {
		this.channelTotalId = channelTotalId;
	}
	public String getChannelClass() {
		return channelClass;
	}
	public void setChannelClass(String channelClass) {
		this.channelClass = channelClass;
	}
	public String getChannelDesc() {
		return channelDesc;
	}
	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}
	public String getChannelTotal() {
		return channelTotal;
	}
	public void setChannelTotal(String channelTotal) {
		this.channelTotal = channelTotal;
	}
	
	
}
