package com.pm.springboot_redis.controller;
import com.pm.springboot_redis.pojo.Person;
import com.pm.springboot_redis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HiController
 * @Description TODO
 * @Date 2019/7/11 9:23
 * @Created by Eaven
 */
@Controller
public class HiController {
    @Autowired
    private PersonService personService;

    @RequestMapping("hi")
    public String hi(){
        return "hi";
    }

    /**
     * 调用Service的缓存接口
     * @param model
     * @param personId
     * @return
     */
    @GetMapping("/getPersonById/{personId}")
    public String getPersonById(Model model, @PathVariable Integer personId){
        Person person = personService.SelectByPrimaryKey(personId);
        model.addAttribute("person",person);
        return "selectPage";
    }
}
