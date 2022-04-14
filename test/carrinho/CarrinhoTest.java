package carrinho;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import produto.Produto;

public class CarrinhoTest {

    private Carrinho carrinho;

    private Produto prod1, prod2;
    
    @BeforeEach
    public void inicializa() {
        carrinho = new Carrinho();

        prod1 = new Produto("lapis", 2.00);

        prod2 = new Produto("caneta", 3.00);

        carrinho.addItem(prod1);

        carrinho.addItem(prod2);
    }
    
    @Test
    public void testvalortotal() {
        double valortot = carrinho.getValorTotal();

        Assertions.assertEquals(5, carrinho.getQtdeItems());
    }
}

