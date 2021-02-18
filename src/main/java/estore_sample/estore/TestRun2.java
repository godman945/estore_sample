package estore_sample.estore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fet.db.oracle.service.estoreTutorialAiko.EstoreTutorialAikoService;
import com.fet.db.oracle.service.estoreTutorialAiko.IEstoreTutorialAikoService;

@Component
public class TestRun2 {

	@Autowired
	private IEstoreTutorialAikoService estoreTutorialAikoService;
	
	public EstoreTutorialAikoService getTEST(){
		return (EstoreTutorialAikoService) estoreTutorialAikoService;
	}

}
