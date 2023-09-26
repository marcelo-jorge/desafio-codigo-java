package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos{
    //atributos
    private Map<LocalDate,Evento> eventosMap;

    //construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    //adcionar evento
    public void adicionarEvento(LocalDate data, String evento, String atracao){
        eventosMap.put(data, new Evento(evento, atracao));
    }

    //exibir agenda
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Evento> entry: eventosTreeMap.entrySet()){
            System.out.println("Data: " + entry.getKey() + ", Evento: " + entry.getValue().getNome() + ", Atração: " + entry.getValue().getAtracao());
        }
    }

    //pegar proximo evento
    

    public static void main(String[] args) {
        System.out.println("heloo world");
    }
}