package microservice.service;

import entity.Dept;

import java.util.List;

/**
 * @author yang
 * Date 2019/12/21 10:26
 */
public interface DeptService
{
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
