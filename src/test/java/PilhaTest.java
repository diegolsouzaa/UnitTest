import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PilhaTest {

    Pilha pilha = new Pilha(new FakePilhaDAO());


    @Test
    public void testeRetiraUltimoLivro(){


        Livro livro = new Livro("A fortaleza");
        pilha.Push(livro);

        livro = new Livro("A emboscada");
        pilha.Push(livro);

        livro = new Livro("O naufrago");
        pilha.Push(livro);

        String resultadoEsperdo = "O naufrago";

        Assertions.assertEquals(pilha.Pop().getTitulo(), resultadoEsperdo);
    }

    @Test
    public void testNaoAdicionaLivrosAlemDoLimite(){


        Livro livro1 = new Livro("A fortaleza");
        Livro livro2 = new Livro("A emboscada");
        Livro livro3 = new Livro("O palhaço");
        Livro livro4 = new Livro("A terra");
        Livro livro5 = new Livro("O sol");
        //Livro livro6 = new Livro("A lua");

        pilha.Push(livro1);
        pilha.Push(livro2);
        pilha.Push(livro3);
        pilha.Push(livro4);
        pilha.Push(livro5);
        //pilha.Push(livro6);

        String resuladoEsperado = "O sol";

        Assertions.assertEquals(resuladoEsperado, pilha.Pop().getTitulo());
    }
}
