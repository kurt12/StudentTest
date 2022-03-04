package com.library.student.service;

import java.util.List;

public interface LibraryCrud <T, ID>{
     List<T> findAll();
     T saveOrUpdate(T t);
     void deleteById(ID id);

}
