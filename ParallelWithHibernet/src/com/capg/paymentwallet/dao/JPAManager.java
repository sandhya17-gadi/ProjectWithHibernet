package com.capg.paymentwallet.dao;

public class JPAManager {
	
	public static EntityManager createEntityManager(){
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
	public static void closeResources(EntityManager em){
		em.close();
		
	}

	
	

}
