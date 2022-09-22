package com.stock.pStock.service;

import com.stock.pStock.model.Client;
import com.stock.pStock.repository.ClientRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepos clientRepos;
    public List<Client> getClients(){
        List<Client> clients = new ArrayList<>();
        clientRepos.findAll().forEach(client -> {
            clients.add(client);
        });
        return clients;
    }

    public Client getClient(long id) {
        return clientRepos.findById(id).orElse(null);
    }

    public void deleteClient(long id) {
        clientRepos.deleteById(id);
    }

    public void addClient(Client client) {
        clientRepos.save(client);
    }

    public void updateClient(Client client, long id) {
        clientRepos.save(client);
    }
}
