package warcaby;

public class Warcaby 
{
    public static char [][] plansza = new char[8][8];
    
    public static void main(String[] args)
    {
        Plansza pl = new Plansza( plansza );
                
        pl.umiescPiony( plansza );
        pl.rysujPlansze( plansza );
    }
}