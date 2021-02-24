package com.fet.db.oracle.service.estoreTutorialAiko;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fet.db.oracle.dao.estoreTutorialAiko.IEstoreTutorialAlexDAO;
import com.fet.db.oracle.pojo.EstoreTutorialAlex;
import com.fet.db.oracle.service.base.BaseService;

@Service
public class EstoreTutorialAlexService extends BaseService<EstoreTutorialAlex, String> implements IEstoreTutorialAlexService {

	@Autowired
	public IEstoreTutorialAlexDAO estoreTutorialAlexDAO;
	
	public List<Map<String, String>> findAlex() throws Exception{
		return estoreTutorialAlexDAO.findAlex();
	}

}
