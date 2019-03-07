package br.com.gestaojato.controller;

import br.com.gestaojato.dto.ClienteDTO;
import br.com.gestaojato.model.Cliente;
import br.com.gestaojato.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(value = "Clientes", description = "Manipulando Clientes")
@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @ApiOperation(value = "Retorna todos clientes")
    @GetMapping
    @ResponseBody
    public ResponseEntity<?> retornarTodosClientes () {
        List<Cliente> list = clienteService.findAll();
        return new ResponseEntity<List>(list, HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna cliente por id")
    @GetMapping (value = "/id/{id}")
    @ResponseBody
    public ResponseEntity<?> retornarClientePorId (@PathVariable("id") String id) {
        Optional<Cliente> list = clienteService.findById(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna cliente por nome")
    @GetMapping (value = "/nome/{nome}")
    @ResponseBody
    public ResponseEntity<?> retornarClientePorNome (@PathVariable("nome") String nome) {
        List<Cliente> list = clienteService.findByNome(nome);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @ApiOperation(value = "Cria um novo cliente")
    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<?> criarCliente (@RequestBody ClienteDTO cliente) {
        return new ResponseEntity<>(clienteService.save(cliente.transformaParaObjeto()), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Exclui cliente por id")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "id") String id) {
        clienteService.deleteById(id);
    }
}
