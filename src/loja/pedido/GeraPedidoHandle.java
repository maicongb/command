package loja.pedido;

import orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandle {

    //essa classe apenas teria a parte de excuçaõ de comandos, como salvar.
    //construtor com injeção de dependencias: repository, service, etc
    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
