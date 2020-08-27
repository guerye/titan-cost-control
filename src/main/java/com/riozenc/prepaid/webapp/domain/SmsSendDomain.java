package com.riozenc.prepaid.webapp.domain;

import java.util.Date;
import java.util.List;

public class SmsSendDomain {

	private String smsUser;
	private String smsPassword;
	private String interfaceId;
	private String smsId;
	private Date beginDateTime;
	private Date endDateTime;
	private List<String> phoneList;
	private List<SmsMessageDomain> data;
	
	public String getSmsUser() {
		return smsUser;
	}
	public void setSmsUser(String smsUser) {
		this.smsUser = smsUser;
	}
	public String getSmsPassword() {
		return smsPassword;
	}
	public void setSmsPassword(String smsPassword) {
		this.smsPassword = smsPassword;
	}
	public String getInterfaceId() {
		return interfaceId;
	}
	public void setInterfaceId(String interfaceId) {
		this.interfaceId = interfaceId;
	}
	public String getSmsId() {
		return smsId;
	}
	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}
	public Date getBeginDateTime() {
		return beginDateTime;
	}
	public void setBeginDateTime(Date beginDateTime) {
		this.beginDateTime = beginDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public List<String> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}
	public List<SmsMessageDomain> getData() {
		return data;
	}
	public void setData(List<SmsMessageDomain> data) {
		this.data = data;
	}
	

	
	
	
}
