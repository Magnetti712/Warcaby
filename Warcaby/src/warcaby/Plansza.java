package warcaby;

public class Plansza 
{
    public Plansza wypelnijPlansze( char [][] tablica ) // Uzupełnia tablice, która będzie planszą
    {
        for( int y = 0; y < tablica.length; y++ )
        {
            for( int x = 0; x < tablica.length; x++ )
            {
                if( ( x % 2 ) == 0 )
                {
                    if( ( y % 2 ) == 0  )
                        tablica[x][y] = '*'; // Białe pole
                    else
                        tablica[x][y] = ' '; // Pole na które może zostać postawiony pionek
                }
                else
                {
                    if( ( y % 2 ) == 0  )
                        tablica[x][y] = ' '; // Pole na które może zostać postawiony pionek
                    else
                        tablica[x][y] = '*'; // Białe pole
                }
            }
        }
        return this;
    }
    
    public Plansza umiescPiony( char [][] tablica )
    {
        for( int y = 0; y < tablica.length; y++ )
        {
            for( int x = 0; x < tablica.length; x++ )
            {
                if( ( y < 3 ) && tablica[x][y] == ' ' )
                {
                    tablica[x][y] = 'c'; // Umieszcza czarne piony
                } 
                else if ( ( y > 4 ) && tablica[x][y] == ' ' )
                {
                    tablica[x][y] = 'b'; // Umieszcza białe piony
                }
            }
        }
        return this;
    }
    
    public Plansza rysujPlansze( char [][] tablica ) // Rysuje plansze
    {
        System.out.println("   12345678\n  ==========");
        for( int y = 0; y < tablica.length; y++ )
        {
            System.out.print( ( y + 1 ) + " |" );
           
            for( int x = 0; x < tablica.length; x++ )
            {
                System.out.print( tablica[x][y] );
            }
           
            System.out.println( "|");
        }
        System.out.println("  ==========");
        
        return this;
    }
}