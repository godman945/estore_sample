package com.fet.db.oracle.service.coMaster;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fet.db.oracle.dao.coMaster.IComasterDAO;
import com.fet.db.oracle.pojo.CoMaster;
import com.fet.db.oracle.service.base.BaseService;

@Service
public class ComasterService extends BaseService<CoMaster, String> implements IComasterService {

	
	@Autowired
	public IComasterDAO comasterDAO;
	
	public List<Map<String, String>> findComaster() throws Exception{
		
		return comasterDAO.findComaster();
	}

}
