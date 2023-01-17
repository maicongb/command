import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandle;
import loja.pedido.Pedido;
import orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/********************************************************************************
*
* O objeto deste projeto é fazer de forma padrão o salvar e o envier email
* serve para separar a parde de dados dos comandos em si
*
* A ideia é separar em 2 classes uma classe para apresentar os dados e a outra
* classe apenas para executar o comando(salvar, enviar email....)
*
******************************************************************************* */
public class Main {
    public static void main(String[] args) {

        //Essas informações serão repassadas pelo usuário
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens  = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandle handle = new GeraPedidoHandle(/*repository, classe que sabe enviar e-mail...*/);
        handle.execute(gerador);

    }
}