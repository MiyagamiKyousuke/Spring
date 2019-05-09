package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//taskテーブルアクセス用のリポジトリ(DAOのような役割を担う)
@Transactional
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

}
