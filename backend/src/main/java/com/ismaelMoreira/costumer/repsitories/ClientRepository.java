package com.ismaelMoreira.costumer.repsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismaelMoreira.costumer.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
