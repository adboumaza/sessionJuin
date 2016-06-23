package com.myapp.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.entitis.Client;
import com.myapp.service.IclientService;

public class ClientServiceImplTestU {
    
	private static IclientService service;
	private static ClassPathXmlApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		service = (IclientService) context.getBean("serviceClient");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

/*	@Test
	public void testAddClient() {
		Client c = new Client("A", "aabou", 29);
		service.addClient(c);
		Client c2 = new Client("A", "aabou", 29);
		service.addClient(c2);
		Client c3 = new Client("A", "aabou", 29);
		service.addClient(c3);
		Client c4 = new Client("A", "aabou", 29);
		service.addClient(c4);
		Client c5 = new Client("A", "aabou", 29);
		service.addClient(c5);
		assertNotNull(c.getIdClient());
	}*/

	/*@Test
	public void testAddClientToVoiture() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testUpdateClient() {
		Client c = service.getClient(1L);
		c.setNomClient("B");
		service.updateClient(c);
		Client c2 = service.getClient(1L);
		assertTrue(c2.getNomClient().equals("B"));
	}

	@Test
	public void testSupClient() {
		Client c =service.getClient(3L);
		service.supClient(3L);
		assertNotNull(c.getIdClient());
	}

	@Test
	public void testGetClient() {
		Client c =service.getClient(1L);
		assertTrue(c.getIdClient()!=null);
	}

	@Test
	public void testGetClients() {
		List<Client> tab = service.getClients();
		assertTrue(tab.size()>0);
	}

	@Test
	public void testGetClientsPaMc() {
		List<Client> tab =service.getClientsPaMc("A");
		for(Client t : tab){
			if(t.getNomClient().contains("A")){
				assertTrue(true);
			}
		}
	}

}
