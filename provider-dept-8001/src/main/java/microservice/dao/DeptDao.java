package microservice.dao;

import entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yang
 * Date 2019/12/21 10:24
 */
@Mapper
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

