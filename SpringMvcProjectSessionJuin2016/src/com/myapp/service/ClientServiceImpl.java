package com.myapp.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.myapp.dao.IclientDao;
import com.myapp.entitis.Client;

public class ClientServiceImpl implements IclientService{

	private IclientDao dao;
	
	Logger log = Logger.getLogger("ClientServiceImpl");
	
	public void setDao(IclientDao dao) {
		this.dao = dao;
		log.info("<----------daoClient injceted-------->");
	}

	@Override
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return dao.addClient(c);
	}

	@Override
	public Client addClientToVoiture(Client c, Long idVoiture) {
		// TODO Auto-generated method stub
		return dao.addClientToVoiture(c, idVoiture);
	}

	@Override
	public Client updateClient(Client c) {
		// TODO Auto-generated method stub
		return dao.updateClient(c);
	}

	@Override
	public Client supClient(Long idClient) {
		// TODO Auto-generated method stub
		return dao.supClient(idClient);
	}

	@Override
	public Client getClient(Long idClient) {
		// TODO Auto-generated method stub
		return dao.getClient(idClient);
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return dao.getClients();
	}

	@Override
	public List<Client> getClientsPaMc(String mc) {
		// TODO Auto-generated method stub
		return dao.getClientsPaMc(mc);
	}

}
