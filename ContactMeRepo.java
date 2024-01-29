package com.twg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twg.entity.ContactMe;

@Repository
public interface ContactMeRepo  extends JpaRepository<ContactMe, String>{

}
