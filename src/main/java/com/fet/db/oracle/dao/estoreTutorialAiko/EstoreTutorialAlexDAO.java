package com.fet.db.oracle.dao.estoreTutorialAiko;

import java.util.List;
import java.util.Map;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.fet.db.oracle.dao.base.BaseDAO;
import com.fet.db.oracle.pojo.EstoreTutorialAlex;

@Repository
public class EstoreTutorialAlexDAO extends BaseDAO<EstoreTutorialAlex, String> implements IEstoreTutorialAlexDAO {

	
	public List<Map<String, String>> findAlex() throws Exception{
	    StringBuffer sql = new StringBuffer();
	    sql.append(" SELECT * from ESTORE_TUTORIAL_ALEX ");
	    NativeQuery query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createNativeQuery(sql.toString());
	    query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
	    return query.list();

	}
}
