import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos = new ArrayList<>();
    private DescontoStrategy descontoStrategy;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void definirDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += descontoStrategy.calcularDesconto(produto.getPreco());
        }
        return total;
    }
}
