/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.peerinstruction.repositorio;

import br.edu.ifpb.dac.peerinstruction.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jose2
 */
public class RepositorioSGBD implements Repositorio {

    @Override
    public void save(Pessoa pessoa) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("peerInstruction_PU");
        return emf.createEntityManager();
    }
}
