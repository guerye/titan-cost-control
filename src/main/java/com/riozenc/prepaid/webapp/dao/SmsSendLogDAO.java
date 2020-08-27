package com.riozenc.prepaid.webapp.dao;

import java.util.List;

import com.riozenc.prepaid.webapp.domain.SmsSendLogDomain;
import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;

@TransactionDAO()
public class SmsSendLogDAO extends AbstractTransactionDAOSupport implements BaseDAO<SmsSendLogDomain>{

	@Override
	public int insert(SmsSendLogDomain t) {
		return getPersistanceManager().insert(getNamespace() + ".insert", t);
	}

	@Override
	public int delete(SmsSendLogDomain t) {
		return getPersistanceManager().delete(getNamespace() + ".delete", t);
	}

	@Override
	public int update(SmsSendLogDomain t) {
		return getPersistanceManager().update(getNamespace() + ".update", t);
	}

	@Override
	public SmsSendLogDomain findByKey(SmsSendLogDomain t) {
		return getPersistanceManager().load(getNamespace() + ".findByKey", t);
	}

	@Override
	@PaginationSupport
	public List<SmsSendLogDomain> findByWhere(SmsSendLogDomain t) {
		return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
	}

	public List<SmsSendLogDomain> findByPhone(List<String> phoneNos) {
		return getPersistanceManager().find(getNamespace() + ".findByPhone", phoneNos);
	}



}
