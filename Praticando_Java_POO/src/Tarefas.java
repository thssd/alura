import java.util.ArrayList;

public class Tarefas {

    String descricao;
    boolean concluida;

    ArrayList<Tarefas> listaDeTarefas = new ArrayList<>();

    public String exibeTarefas(){
        if (concluida){
            return "\nTarefa: " + descricao + " - Status: Concluída" ;
        } else {
            return "\nTarefa: " + descricao + " - Status: Pendente";
        }
    }
}
