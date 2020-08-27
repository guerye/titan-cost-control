package com.riozenc.prepaid.webapp.domain;

public class SmsSendLogDomain {

	private String settlementNo;// 结算户编号 SETTLEMENT_NO varchar(16) 16 FALSE FALSE FALSE
	private String settlementName;// 结算人 SETTLEMENT_NAME varchar(64) 64 FALSE FALSE FALSE
	private String settlementPhone;// 结算人电话 SETTLEMENT_PHONE varchar(11) 11 FALSE FALSE FALSE
	private Byte warnTimes;
	private Byte cutTimes;
	
	public String getSettlementNo() {
		return settlementNo;
	}
	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}
	public String getSettlementName() {
		return settlementName;
	}
	public void setSettlementName(String settlementName) {
		this.settlementName = settlementName;
	}
	public String getSettlementPhone() {
		return settlementPhone;
	}
	public void setSettlementPhone(String settlementPhone) {
		this.settlementPhone = settlementPhone;
	}
	public Byte getWarnTimes() {
		return warnTimes;
	}
	public void setWarnTimes(Byte warnTimes) {
		this.warnTimes = warnTimes;
	}
	public Byte getCutTimes() {
		return cutTimes;
	}
	public void setCutTimes(Byte cutTimes) {
		this.cutTimes = cutTimes;
	}
	
	
	
	
}
