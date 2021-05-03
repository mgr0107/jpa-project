package com.manvi.demoJPA;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Crud");
    	EntityManager em =  emf.createEntityManager();
    	
    	employee e1 = em.find(employee.class, 4);
    }
}
