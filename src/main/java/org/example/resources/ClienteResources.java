package org.example.resources;

import org.example.entities.Cliente;
import org.example.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteResources {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteService.findById(id);
        return cliente.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping
    public  ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        if(!clienteService.findById(id).isPresent()){
            return  ResponseEntity.notFound().build();
        }
        cliente.setIdCliente(id);
        return ResponseEntity.ok(clienteService.save(cliente));
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deleteCliente(@PathVariable Long id){
        if (!clienteService.findById(id).isPresent()){
            return ResponseEntity.notFound().build();
        }
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

}


