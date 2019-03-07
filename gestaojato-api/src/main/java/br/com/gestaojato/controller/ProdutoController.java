package br.com.gestaojato.controller;

import br.com.gestaojato.dto.ProdutoDTO;
import br.com.gestaojato.model.Produto;
import br.com.gestaojato.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(value = "Produtos", description = "Manipulando Produtos")
@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @ApiOperation(value = "Retorna todos produtos")
    @GetMapping
    @ResponseBody
    public ResponseEntity<?> retornarTodosProdutos () {
        List<Produto> produtos = produtoService.findAll();
        return new ResponseEntity<List>(produtos, HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna produto por id")
    @GetMapping(value = "/id/{id}")
    @ResponseBody
    public ResponseEntity<?> retornarProdutosPorId (@PathVariable("id") String id) {
        Optional<Produto> produto = produtoService.findById(id);
        return new ResponseEntity<>(produto, HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna produto por nome")
    @GetMapping(value = "/nome/{nome}")
    @ResponseBody
    public ResponseEntity<?> retornarProdutosPorNome (@PathVariable("nome") String nome) {
        List<Produto> produto = produtoService.findByNome(nome);
        return new ResponseEntity<>(produto, HttpStatus.OK);
    }

    @ApiOperation(value = "Cria um novo produto")
    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<?> criarProduto (@RequestBody ProdutoDTO produto) {
        return new ResponseEntity<>(produtoService.save(produto.transformaParaObjeto()), HttpStatus.OK);
    }

    @ApiOperation(value = "Exclui produto por id")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "id") String id) {
        produtoService.deleteById(id);
    }
}
