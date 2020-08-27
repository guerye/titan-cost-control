package com.riozenc.prepaid.webapp.domain;

import java.math.BigDecimal;
import java.util.Date;

public class DailyChargeDomain {

	//尊敬的{0}户号:{1}，截至{2}年{3}月{4}日，实时余额为｛5｝元，请及时充值

	private String settlementNo;// 结算户编号 SETTLEMENT_NO varchar(16) 16 FALSE FALSE FALSE
	private String settlementName;// 结算人 SETTLEMENT_NAME varchar(64) 64 FALSE FALSE FALSE
	private String settlementPhone;// 结算人电话 SETTLEMENT_PHONE varchar(11) 11 FALSE FALSE FALSE
	private BigDecimal balance; //余额 
	private Date chargeDate; //日测算日期
	
	private Byte smsFlag; //短信标识，1告警，2停电
	
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
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Date getChargeDate() {
		return chargeDate;
	}
	public void setChargeDate(Date chargeDate) {
		this.chargeDate = chargeDate;
	}
	public Byte getSmsFlag() {
		return smsFlag;
	}
	public void setSmsFlag(Byte smsFlag) {
		this.smsFlag = smsFlag;
	}

	
	
	
}
