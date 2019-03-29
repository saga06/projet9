package com.clientui.microserviceclientui.proxies;

import com.clientui.microserviceclientui.beans.AdventureBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/* Declare it as a Feigne Client, give the name of the microservice to call as parameter(find it in application.properties
* of the MS concerned, and the url */
@FeignClient(name = "zuul-server")
public interface MicroserviceAdventuresProxy {

    //Adventures
    @GetMapping(value = "/microservice-consultation/adventures")
    List<AdventureBean> listAdventures();

    //Adventure/{adventure_id}
    @GetMapping(value = "/microservice-consultation/adventures/{adventure_id}")
    AdventureBean displayAnAdventure(@PathVariable("adventure_id") int adventure_id);
}
