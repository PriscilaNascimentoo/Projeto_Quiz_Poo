package Enum;

import java.util.Arrays;
import java.util.List;

public enum Resposta{
    
        RESPOSTA_1_PERGUNTA_1("Watsaap ", 1, true),
        RESPOSTA_2_PERGUNTA_1("facebook", 1, false),
        RESPOSTA_3_PERGUNTA_1("instagram", 1, false),
        RESPOSTA_4_PERGUNTA_1("pinterest", 1, false),
        
        RESPOSTA_1_PERGUNTA_2("1991", 2,false),
        RESPOSTA_2_PERGUNTA_2("1853", 2,false),
        RESPOSTA_3_PERGUNTA_2("1998", 2,true),
        RESPOSTA_4_PERGUNTA_2("2015", 2,false),
        
        
        RESPOSTA_1_PERGUNTA_3("Thomas John Watson", 3,false),
        RESPOSTA_2_PERGUNTA_3("Mark Loughridge", 3,false),
        RESPOSTA_3_PERGUNTA_3("Ginni Rometty",3,false),
        RESPOSTA_4_PERGUNTA_3("Charles Ranlett Flint verdadeiro", 3,true),

        
        RESPOSTA_1_PERGUNTA_4("5", 4,false),
        RESPOSTA_2_PERGUNTA_4("2", 4,false),
        RESPOSTA_3_PERGUNTA_4("x", 4,true),
        RESPOSTA_4_PERGUNTA_4(Ultra", 4,false),

        
        
        
        RESPOSTA_1_PERGUNTA_5("Google Chrome", 5,true),
        RESPOSTA_2_PERGUNTA_5("Microsoft Edge", 5,false),
        RESPOSTA_3_PERGUNTA_5("Apple Safari ", 5,true),
        RESPOSTA_4_PERGUNTA_5("Mozila Firefox", 5,false),


        


        private final String resposta;
        private final int Pergunta;
        private final boolean respostaVF;
        
        public int getCodigoPergunta() {
            return codigoPergunta;
        }

        public String getResposta() {
            return resposta;
        }
        
        public boolean getRespostaVF(){
            return respostaVF;
        }
        
        
        Resposta(String resposta, int codigoPergunta, boolean respostaVerdadeiraOuFalsa){
            this.resposta = resposta;
            this.Pergunta = Pergunta;
            this.respostaVF = respostaVF;
        }
        
        public static List<Resposta> getListaRespostas(){
            List<Resposta> listaRespostas = Arrays.asList(Resposta.values());
            return listaRespostas;
        }
        
    }