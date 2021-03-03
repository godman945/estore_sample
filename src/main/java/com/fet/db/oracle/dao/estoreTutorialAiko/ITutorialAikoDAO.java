package com.fet.db.oracle.dao.estoreTutorialAiko;

import java.util.List;
import java.util.Map;

import com.fet.db.oracle.dao.base.IBaseDAO;
import com.fet.db.oracle.pojo.EstoreTutorialAiko;

public interface ITutorialAikoDAO extends IBaseDAO<EstoreTutorialAiko, String> {
	
	public List<Map<String, String>> findAiko() throws Exception;
}
