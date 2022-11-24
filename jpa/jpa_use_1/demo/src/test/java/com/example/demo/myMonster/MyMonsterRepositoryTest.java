package com.example.demo.myMonster;

import com.example.demo.entity.Monster;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyMonsterRepositoryTest {

    @Autowired
    MyMonsterRepository myMonsterRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void monsterTest() throws Exception{
        //given
        Monster m = new Monster();
        m.setAttack(9000);
        m.setDefense(900);
        m.setDescription("개쩌는 용이다");
        m.setTribe("용족");
        m.setName("황금용");

        //when
        Long savedId = myMonsterRepository.save(m);
        Monster myMonster = myMonsterRepository.find(savedId);
        //Then
        Assertions.assertThat(savedId).isEqualTo(myMonster.getId());
    }


}