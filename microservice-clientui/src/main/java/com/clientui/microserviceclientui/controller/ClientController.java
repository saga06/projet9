
package com.clientui.microserviceclientui.controller;
import com.clientui.microserviceclientui.beans.AdventureBean;
import com.clientui.microserviceclientui.proxies.MicroserviceAdventuresProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*To ask to spring to look for here some methods which respond to the URI asked => @Controller */

@Controller
public class ClientController {

    @Autowired
    /*Underlined in red by intelliJ, do not care about this "error" :) */
    MicroserviceAdventuresProxy mAdventuresProxy;

    /*Homepage*/
    @RequestMapping("/")
    /*Because we use thymeleaf as template engine, we always return a String, which is the name of the template to use*/
    public String homepage(Model model){
        List<AdventureBean> adventures =  mAdventuresProxy.listAdventures();
        /*model give the possibility to transfert the list to the template*/
        model.addAttribute("adventures", adventures);
        return "homepage";
    }




}
