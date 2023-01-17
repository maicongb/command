package orcamento;

import java.math.BigDecimal;

public class Orcamento {

    public Orcamento(BigDecimal valor, int quantidadeItem) {
        this.valor = valor;
        this.quantidadeItem = quantidadeItem;
    }

    private BigDecimal valor;
    private int quantidadeItem;

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

}
