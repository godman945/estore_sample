package com.fet.db.oracle.dao.estoreTutorialAiko;

import java.util.List;
import java.util.Map;

import com.fet.db.oracle.dao.base.IBaseDAO;
import com.fet.db.oracle.pojo.EstoreTutorialAlex;

public interface IEstoreTutorialAlexDAO extends IBaseDAO<EstoreTutorialAlex, String> {

	public List<Map<String, String>> findAlex() throws Exception;
}
