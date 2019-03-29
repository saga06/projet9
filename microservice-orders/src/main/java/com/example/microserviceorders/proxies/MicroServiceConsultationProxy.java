package com.example.microserviceorders.proxies;

import com.example.microserviceorders.model.Adventure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@FeignClient(name = "microservice-consultation", url = "localhost:8080")
public interface MicroServiceConsultationProxy {

    @GetMapping(value="adventure_name/")
    List<Adventure> getAdventureNameById(@RequestParam("adventure_ids") List<Integer> adventure_ids);

    @GetMapping(value="adventures/{adventure_id}")
    Adventure getAdventureById(@RequestParam("adventure_id") int adventure_ids);
}
