package com.stock.pStock.repository;

import com.stock.pStock.model.Client;
import com.stock.pStock.model.Scategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface ClientRepos extends JpaRepository<Client, Long> {
}
