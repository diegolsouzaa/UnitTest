import java.util.ArrayList;

public class Pilha {

    private int limit = 5;
    ArrayList<Livro> pilha = new ArrayList<Livro>();
    private IPilhaDAO pilhaDAO;

    public Pilha(IPilhaDAO pilhaDAO){
        this.pilhaDAO = pilhaDAO;

    }

    public void Push(Livro livro){
        if (pilha.size() >=limit)
            throw new ArrayStoreException();
        if (!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")){
            return;
        }

        pilha.add(livro);
        pilhaDAO.save(this);

    }

    public Livro Pop(){

        return pilha.get(pilha.size()-1);


    }

    public int count(){

        return pilha.size();
    }



}
