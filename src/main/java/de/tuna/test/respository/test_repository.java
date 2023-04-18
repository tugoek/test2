package de.tuna.test.respository;

import de.tuna.test.entity.test_entity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface test_repository extends JpaRepository<test_entity, Integer> {

}