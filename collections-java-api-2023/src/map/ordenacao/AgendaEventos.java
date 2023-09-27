package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
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
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for(Map.Entry<LocalDate,Evento> entry: eventosMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            if(dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)){
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }

        if(proximoEvento != null){
            System.out.println("O proximo evento: " + proximoEvento.getNome() + "Acontecera na data: " + proximaData);
        }else{
            System.out.println("Não há eventos futuros na agenda.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        //adiona eventos data segue padrão ano,mes,dia
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");        
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        //exibe a agenda

    }
}