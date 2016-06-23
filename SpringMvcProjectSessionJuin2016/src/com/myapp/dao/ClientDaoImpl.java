package com.myapp.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.myapp.entitis.Client;
import com.myapp.entitis.Voiture;
import com.mysql.jdbc.log.Log;

public class ClientDaoImpl implements IclientDao {
    Logger log = Logger.getLogger("ClientDaoImpl");
	SessionFactory sf = SingleTon.getSessfionfactory();
    @Override
	public Client addClient(Client c) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.save(c);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getNomClient()+" a bien été enregistré");
		return c;
	}

	@Override
	public Client addClientToVoiture(Client c, Long idVoiture) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Voiture v = ss.get(Voiture.class, idVoiture);
		c.getVoitures().add(v);
		ss.save(c);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getNomClient()+"avec "+v.getMarqueVoiture()+" a bien été enregistré");
		return c;
	}

	@Override
	public Client updateClient(Client c) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		ss.saveOrUpdate(c);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getIdClient()+" a bien été modifié");
		return c;
	}

	@Override
	public Client supClient(Long idClient) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Client c = ss.get(Client.class, idClient);
		ss.delete(c);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getNomClient()+" a bien été suprimmé");
		return c;
	}

	@Override
	public Client getClient(Long idClient) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Client c = ss.get(Client.class, idClient);
		ss.getTransaction().commit();ss.close();
		log.info("le client"+c.getNomClient()+" a bien été recupérer");
		return c;
	}

	@Override
	public List<Client> getClients() {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Client c");
		ss.getTransaction().commit();
		log.info("ils existe"+query.list().size()+" clients");
		return query.list();
	}

	@Override
	public List<Client> getClientsPaMc(String mc) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		Query query = ss.createQuery("from Client c where c.nomClient like :x");
		query.setParameter("x","%"+mc+"%");
		ss.getTransaction().commit();
		log.info("ils existe"+query.list().size()+" clients");
		return query.list();

	}

}
