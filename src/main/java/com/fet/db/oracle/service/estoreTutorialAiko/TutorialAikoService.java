package com.fet.db.oracle.service.estoreTutorialAiko;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fet.db.oracle.dao.estoreTutorialAiko.ITutorialAikoDAO;
import com.fet.db.oracle.pojo.EstoreTutorialAiko;
import com.fet.db.oracle.service.base.BaseService;

import net.minidev.json.JSONObject;

@Service
public class TutorialAikoService extends BaseService<EstoreTutorialAiko, String> implements ITutorialAikoService {

	
	@Autowired
	public ITutorialAikoDAO tutorialAikoDAO;
	
	public JSONObject findAiko() throws Exception{
		
		JSONObject d = new JSONObject();
		
		List<Map<String, String>> test = tutorialAikoDAO.findAiko();
		for (Map<String, String> map : test) {
			System.out.println(map);
		}
		
		
		
		
		
		
		return d;
	}

}
