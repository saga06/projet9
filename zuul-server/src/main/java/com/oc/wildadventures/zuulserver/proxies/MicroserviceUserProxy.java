package com.oc.wildadventures.zuulserver.proxies;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-user", url = "localhost:8081")
public interface MicroserviceUserProxy {
}
