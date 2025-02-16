public class Main{

    public static void main(String[] args)
    {

        // implementazioni liste in java

        Lista lista = new Lista();


        System.out.println("Creiamo la lista ed inseriamo il numero 1");
        lista.InserimentoInTesta(1);
        lista.VisualizzaLista();
        System.out.println("Inseriamo il 2 ed eliminiamo dalla testa.");
        lista.InserimentoInCoda(2);
        lista.EliminaTesta();
        lista.VisualizzaLista();

        System.out.println("Inseriamo il 3 e il 4 in testa.");
        lista.InserimentoInTesta(3);
        lista.InserimentoInTesta(4);
        lista.VisualizzaLista();
        System.out.println("Eliminiamo dalla coda.");
        lista.EliminaCoda();
        lista.VisualizzaLista();

    }
}