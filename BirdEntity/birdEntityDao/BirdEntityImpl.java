package birdEntityDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import birdEntityDto.BirdEntity;

public class BirdEntityImpl implements BirdEntityDao {

	@Override
	public void save(BirdEntity entity) {
		
		Configuration configure = new Configuration().configure("hibernet.cfg.xml").addAnnotatedClass(BirdEntity.class);
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		BirdEntity ent = (BirdEntity) session.save(entity);
		tx.commit();
		session.clear();
		factory.close();
		}

	@Override
	public BirdEntity readById(int pk) {

		Configuration configure = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		BirdEntity ent = session.get(BirdEntity.class, pk);
		session.close();
		factory.close();
		return ent;
	}

}
