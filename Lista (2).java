public class Lista
{

    private Nodo head;
    private int Nelementi;

    public Lista()
    {
        head = null;
        Nelementi = 0;
    }

    public void VisualizzaLista()
    {
        Nodo nodo = head;

        while(nodo != null){

            System.out.println(nodo.getDati());

            nodo = nodo.getLink();
        }

    }


    public void InserimentoInTesta(Object oggetto)
    {
        Nodo nodo = new Nodo(oggetto);
        nodo.setLink(head);
        head = nodo;
        Nelementi++;
    }

    public void InserimentoInCoda(Object oggetto){

        if(head != null){

            Nodo nodoAggiunto = new Nodo(oggetto);
            Nodo nodoCiclo = head;

            while(nodoCiclo.getLink() != null){
                nodoCiclo = nodoCiclo.getLink();
            }

            nodoCiclo.setLink(nodoAggiunto);
            nodoAggiunto.setLink(null);
        }
        else{
            Nodo nodo = new Nodo(oggetto);
            head = nodo;

            Nelementi++;
        }
    }


    public void EliminaTesta(){

        if(head == null){
            return;
        }

        head = head.getLink();
        Nelementi--;
    }

    public void EliminaCoda(){

        if(head.getLink() == null){
            EliminaTesta();
            return;
        }

        Nodo penultimo = head;
        Nodo ultimo = head.getLink();

        while(ultimo.getLink() != null){
            penultimo = ultimo;
            ultimo = ultimo.getLink();
        }

        penultimo.setLink(null);
        Nelementi--;
    }



}

