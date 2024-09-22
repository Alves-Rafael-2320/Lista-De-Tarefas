import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
    
    public void adcionarTarefa(String descricao){
        Tarefa novaTarefa = new Tarefa(descricao);
        listaDeTarefas.add(novaTarefa);
    }
    public void removerTarefa(String descricao){
        for (Tarefa i : listaDeTarefas) {
            if (i.descricao.equalsIgnoreCase(descricao) ) {
                listaDeTarefas.remove(i);
            }
        }
    }
    public int obterNumeroDeTarefas(){
        return listaDeTarefas.size();
    }

    public List<String> obterDescricoesDeTarefas(){
        List<String> descricoes = new ArrayList<>();
        for (String i : descricoes) {
            descricoes.add(i);
        }
        return descricoes;
    }

}



