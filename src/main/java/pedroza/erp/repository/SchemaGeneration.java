package pedroza.erp.repository;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pedroza.erp.model.Empresa;

public class SchemaGeneration {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");

		EntityManager em = emf.createEntityManager();

		List<Empresa> lista = em.createQuery("from Empresa", Empresa.class).getResultList();

		System.out.println(lista);

		em.close();
		emf.close();
	}

}
