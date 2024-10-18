public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco;
    }
}

