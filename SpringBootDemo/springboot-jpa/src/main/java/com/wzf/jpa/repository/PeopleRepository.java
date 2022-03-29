package com.wzf.jpa.repository;

import com.wzf.jpa.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PeopleRepository extends JpaRepository<People, Long> {
}
