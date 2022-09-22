package com.stock.pStock.controller;

import com.stock.pStock.model.Client;
import com.stock.pStock.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping("/clients")
    public List<Client> getClient(){
        return clientService.getClients();
    }
    @RequestMapping("/client/{id}")
    public Client getClients(@PathVariable long id){
        return clientService.getClient(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/client/{id}")
    public void DeleteClient(@PathVariable long id){
        clientService.deleteClient(id);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/clients")
    public void AddClient(@RequestBody Client client){
        clientService.addClient(client);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/client/{id}")
    public void updateClient(@RequestBody Client client,@PathVariable long id){
        clientService.updateClient(client,id);
    }
}
