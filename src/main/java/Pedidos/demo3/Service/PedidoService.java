package Pedidos.demo3.service;

import Pedidos.demo3.entity.PedidoEntity;
import Pedidos.demo3.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public PedidoEntity salvar(PedidoEntity pedido) {
        return repository.save(pedido);
    }

    public List<PedidoEntity> listarTodos() {
        return repository.findAll();
    }

    public Optional<PedidoEntity> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}