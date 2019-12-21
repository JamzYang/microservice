package microservice.controller;

import entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author yang
 * Date 2019/12/21 10:58
 */
@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/dept/add")
    public ResponseEntity<Boolean> add(Dept dept){
        return restTemplate.postForEntity(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/dept/get/{id}")
    public ResponseEntity<Dept> get(@PathVariable Long id){
        return restTemplate.getForEntity(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @GetMapping("/dept/list")
    public ResponseEntity<List> list(){
        return restTemplate.getForEntity(REST_URL_PREFIX+"/dept/list", List.class);
    }

}
