package com.fet.db.oracle.service.coMaster;

import java.util.List;
import java.util.Map;

import com.fet.db.oracle.pojo.CoMaster;
import com.fet.db.oracle.service.base.IBaseService;

public interface IComasterService extends IBaseService<CoMaster, String> {

	public List<Map<String, String>> findComaster() throws Exception;
	
}
