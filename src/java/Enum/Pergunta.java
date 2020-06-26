
package Enum;

import java.util.Arrays;
import java.util.List;

public enum Pergunta {
    
    PERGUNTA_1("Qual o app mais usado do mundo?"),
    PERGUNTA_2("Ano de fundação do Google?"),
    PERGUNTA_3("Qual o nome do fundador da IBM?"),
    PERGUNTA_4("Qual é a atual versão do HTML?"),
    PERGUNTA_5("Qual o navegador mais utilizado atualmente?");
    

    private final String pergunta;

    Pergunta(String pergunta){
        this.pergunta = pergunta;
    }

    public static List<Pergunta> getListaPerguntas(){
        List<Pergunta> listaPerguntas = Arrays.asList(Pergunta.values());
        return listaPerguntas;
    }
    
    public String getPergunta() {
        return pergunta;
    }
}
