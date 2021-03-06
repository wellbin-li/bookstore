package org.easybooks.bookstore.dao.impl;

import java.util.List;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.ICatalogDAO;
import org.hibernate.Query;
import org.hibernate.Session;

public class CatalogDAO extends BaseDAO implements ICatalogDAO {
	//得到所有图书类别
	public List getAllCatalogs() {
		Session session=getSession();
		Query query=session.createQuery("from Catalog c");
		List catalogs=query.list();
		session.close();
		return catalogs;
	}

}
