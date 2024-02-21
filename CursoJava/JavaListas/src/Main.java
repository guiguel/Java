import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Bob");
        lista.add("Manoel");
        lista.add("Alex");

        lista.add(2,"Anna");
        
        System.out.println(lista.size());
        
        lista.remove("Bob");
        for (String list: lista) {
            System.out.println(list);
        }
        System.out.println("--------------------");

        // remove da lista tudo que inicia com M
        lista.removeIf(list -> list.charAt(0)=='M');
        for (String l: lista){
            System.out.println(l);
        }

        System.out.println("----------------------");
        System.out.println("Index of Manoel" +lista.indexOf("Manoel"));
        System.out.println("----------------------");

        List<String> l = lista.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
        for (String x: l){
            System.out.println(x);
        }

        System.out.println("----------------------------");
        //busca primeiro nome da lista que comece com ele senao retorna null
        String nome = lista.stream().filter(x->x.charAt(0)=='l').findFirst().orElse(null);
        System.out.println(nome);
    }
}