package estore_sample.estore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fet.db.oracle.service.estoreTutorialAiko.EstoreTutorialAlexService;
import com.fet.db.oracle.service.estoreTutorialAiko.IEstoreTutorialAlexService;

@Component
public class TestRun2 {

	@Autowired
	private IEstoreTutorialAlexService estoreTutorialAikoService;
	
	public EstoreTutorialAlexService getTEST(){
		return (EstoreTutorialAlexService) estoreTutorialAikoService;
	}

}
