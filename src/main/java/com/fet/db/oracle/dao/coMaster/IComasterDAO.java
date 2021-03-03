package com.fet.db.oracle.dao.coMaster;

import java.util.List;
import java.util.Map;

import com.fet.db.oracle.dao.base.IBaseDAO;
import com.fet.db.oracle.pojo.CoMaster;

public interface IComasterDAO extends IBaseDAO<CoMaster, String> {
	
	public List<Map<String, String>> findComaster() throws Exception;
}
