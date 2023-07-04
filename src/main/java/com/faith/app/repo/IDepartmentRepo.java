package com.faith.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Department;

public interface IDepartmentRepo extends CrudRepository<Department,Integer>{


}
