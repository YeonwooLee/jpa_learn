package com.example.demo.myMonster;


import com.example.demo.entity.Monster;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MyMonsterRepository {
    @PersistenceContext
    EntityManager em;

    public Long save(Monster monster){
        em.persist(monster);
        return monster.getId();
    }

    public Monster find(Long id){
        return em.find(Monster.class,id);
    }

}
