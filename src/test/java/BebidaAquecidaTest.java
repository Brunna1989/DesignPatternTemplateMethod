import br.com.brunnadornelles.model.CappucinoVegano;
import br.com.brunnadornelles.model.ChocolateQuenteMexicano;
import br.com.brunnadornelles.model.DalgonaCoffe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BebidaAquecidaTest {

    @Test
    public void testChocolateQuenteMexicano() {
        ChocolateQuenteMexicano chocolateQuenteMexicano = new ChocolateQuenteMexicano();
        Assertions.assertEquals(chocolateQuenteMexicano.pedidoRecebido(),"1 - Iniciando o preparo de seu Chocolate Quente Mexicano.\n");
        Assertions.assertEquals(chocolateQuenteMexicano.addIngredientes(), "2 - Adicionando todos os ingredientes necessários.\n");
        Assertions.assertEquals(chocolateQuenteMexicano.aquecendoBebida(),"3 - Aquecendo por 30 segundos\n");
        Assertions.assertEquals(chocolateQuenteMexicano.pedidoFinalizado(),"4 - Hmmm...bebida pronta. Favor, retire o seu copo!\n");
    }

    @Test
    public void testDalgonaCoffe() {
        DalgonaCoffe dalgonaCoffe = new DalgonaCoffe();
        Assertions.assertEquals(dalgonaCoffe.pedidoRecebido(),"1 - Iniciando o preparo de seu Dalgona Coffe.\n");
        Assertions.assertEquals(dalgonaCoffe.addIngredientes(), "2 - Adicionando todos os ingredientes necessários.\n");
        Assertions.assertEquals(dalgonaCoffe.aquecendoBebida(),"3 - Aquecendo por 30 segundos.\n");
        Assertions.assertEquals(dalgonaCoffe.pedidoFinalizado(),"4 - Hmmm...bebida pronta. Favor, retire o seu copo!\n");
    }

    @Test
    public void testCappucinoVegano() {
        CappucinoVegano cappucinoVegano = new CappucinoVegano();
        Assertions.assertEquals(cappucinoVegano.pedidoRecebido(),"1 - Iniciando o preparo de seu Cappucino Vegano.\n");
        Assertions.assertEquals(cappucinoVegano.addIngredientes(), "2 - Adicionando todos os ingredientes necessários.\n");
        Assertions.assertEquals(cappucinoVegano.aquecendoBebida(),"3 - Aquecendo por 30 segundos.\n");
        Assertions.assertEquals(cappucinoVegano.pedidoFinalizado(),"4 - Hmmm...bebida pronta. Favor, retire o seu copo!\n");
    }
}
