package warcaby;

public class Error 
{
    Plansza p = new Plansza();
    
    public Error nieWybranoPiona( char [][] tablica, int x, int y )
    {
        p.rysujPlansze( tablica );
                        
        System.out.println( "Nie wybrano piona!" + "\n" );

        x = tablica.length; y = tablica.length; // koniec pętli
        
        return this;
    }

    public Error nieMoznaWykonacRuchu( char [][] tablica, int x, int y )
    {
        p.rysujPlansze( tablica );
            
        System.out.println( "Nie można wykonać ruchu!" + "\n" );
        
        x = tablica.length; y = tablica.length; // koniec pętli
        
        return this;
    }
}