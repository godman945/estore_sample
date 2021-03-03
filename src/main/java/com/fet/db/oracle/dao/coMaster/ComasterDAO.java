package com.fet.db.oracle.dao.coMaster;

import java.util.List;
import java.util.Map;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.fet.db.oracle.dao.base.BaseDAO;
import com.fet.db.oracle.pojo.CoMaster;

@Repository
public class ComasterDAO extends BaseDAO<CoMaster, String> implements IComasterDAO {

	public List<Map<String, String>> findComaster() throws Exception{
		
		StringBuffer sql = new StringBuffer();
		sql.append(" select cono, ");
		sql.append(" co_type  ");
		sql.append(" from co_master where rownum <130 ");
		
		NativeQuery query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createNativeQuery(sql.toString());
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
		
	}
}
