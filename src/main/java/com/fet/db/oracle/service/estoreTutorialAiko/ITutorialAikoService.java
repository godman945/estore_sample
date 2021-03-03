package com.fet.db.oracle.service.estoreTutorialAiko;

import com.fet.db.oracle.pojo.EstoreTutorialAiko;
import com.fet.db.oracle.service.base.IBaseService;

import net.minidev.json.JSONObject;

public interface ITutorialAikoService extends IBaseService<EstoreTutorialAiko, String> {

	public JSONObject findAiko() throws Exception;
	
}
