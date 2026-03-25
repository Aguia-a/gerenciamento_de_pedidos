package Pedidos.demo3.controller;

import Pedidos.demo3.entity.PedidoEntity;
import Pedidos.demo3.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public PedidoEntity criar(@RequestBody PedidoEntity pedido) {
        return service.salvar(pedido);
    }

    @GetMapping
    public List<PedidoEntity> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<PedidoEntity> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}