package com.fet.db.oracle.service.estoreTutorialAiko;

import java.util.List;
import java.util.Map;

import com.fet.db.oracle.pojo.EstoreTutorialAlex;
import com.fet.db.oracle.service.base.IBaseService;

public interface IEstoreTutorialAlexService extends IBaseService<EstoreTutorialAlex, String> {

	public List<Map<String, String>> findAlex() throws Exception; 
}
