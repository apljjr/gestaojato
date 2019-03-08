package br.com.gestaojato.controller;

import br.com.gestaojato.dto.PedidoDTO;
import br.com.gestaojato.model.Pedido;
import br.com.gestaojato.service.PedidoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(value = "Pedidos", description = "Manipulando Pedidos")
@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @ApiOperation(value = "Retorna todos pedidos")
    @GetMapping
    @ResponseBody
    public ResponseEntity<?> retornarTodosPedidos () {
        List<Pedido> list = pedidoService.findAll();
        return new ResponseEntity<List>(list, HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna pedido por id")
    @GetMapping (value = "/id/{id}")
    @ResponseBody
    public ResponseEntity<?> retornarPedidoPorId (@PathVariable("id") String id) {
        Optional<Pedido> list = pedidoService.findById(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @ApiOperation(value = "Cria um novo pedido")
    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<?> criarPedido (@RequestBody PedidoDTO pedido) {
        return new ResponseEntity<>(pedidoService.criar(pedido.transformaParaObjeto()), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Atualiza um pedido")
    @PutMapping (value = "/atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizarPedido (@RequestBody Pedido pedido) {
        return  new ResponseEntity<>(pedidoService.atualizar(pedido), HttpStatus.OK);
    }

}
