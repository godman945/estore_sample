package com.fet.db.oracle.dao.estoreTutorialAiko;

import java.util.List;
import java.util.Map;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.fet.db.oracle.dao.base.BaseDAO;
import com.fet.db.oracle.pojo.EstoreTutorialAiko;

@Repository
public class TutorialAikoDAO extends BaseDAO<EstoreTutorialAiko, String> implements ITutorialAikoDAO {

	public List<Map<String, String>> findAiko() throws Exception {

		
		StringBuffer sql = new StringBuffer();
		sql.append(" select cono, ");
		sql.append(" co_type  ");
		sql.append(" from co_master where rownum <130 ");
		
		NativeQuery query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createNativeQuery(sql.toString());
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		
		return query.list();
		
		
	}

	
}
