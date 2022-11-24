package com.example.demo.myMonster;

import com.example.demo.entity.Monster;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MyMonsterController {
    @Autowired
    MyMonsterRepository myMonsterRepository;

    @GetMapping("mymonster")
    public String getMonster(Model model){
        Monster m = myMonsterRepository.find(1L);
        log.debug(m.toString());
        model.addAttribute("monster",m);
        return "myMonster";

    }

}
