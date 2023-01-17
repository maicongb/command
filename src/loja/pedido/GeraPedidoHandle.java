package loja.pedido;

import loja.pedido.acao.EnviarEmailPedido;
import loja.pedido.acao.SalvarPedidoNoBancoDeDados;
import orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandle {

    //essa classe apenas teria a parte de excuçaõ de comandos, como salvar.
    //construtor com injeção de dependencias: repository, service, etc
    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        email.executar(pedido);

        SalvarPedidoNoBancoDeDados salvarDados = new SalvarPedidoNoBancoDeDados();
        salvarDados.executar(pedido);
    }
}
