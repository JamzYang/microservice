package microservice.controller;

import entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import microservice.service.DeptService;

import java.util.List;

/**
 * @author yang
 * Date 2019/12/21 10:28
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable Long id ){
        return deptService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.list();
    }
}
