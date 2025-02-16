public class Nodo
{

    private Object dati;
    private Nodo link;

    public Nodo(Object oggetto)
    {
        dati = oggetto;
        link = null;
    }

    public void setLink(Nodo link)
    {
        this.link = link;
    }

    public Nodo getLink()
    {
        return link;
    }

    public Object getDati()
    {
        return dati;
    }


}