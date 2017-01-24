package warcaby;

class Plansza 
{   
    Plansza( char [][] tablica ) // wypełnia tablice
    {
        for( int i = 0; i < tablica.length; i++ )
        {
            for( int j = 0; j < tablica.length; j++ )
            {
                if( ( i % 2 ) == 0 )
                {
                    if( ( j % 2 ) == 0  )
                        tablica[i][j] = '-'; // Białe pole
                    else
                        tablica[i][j] = ' '; // Pole na które może zostać postawiony pionek
                }
                else
                {
                    if( ( j % 2 ) == 0  )
                        tablica[i][j] = ' '; // Pole na które może zostać postawiony pionek
                    else
                        tablica[i][j] = '-'; // Białe pole
                }
            }
        }
    }
    
    public Plansza umiescPiony( char [][] tablica )
    {
        for( int i = 0; i < tablica.length; i++ )
        {
            for( int j = 0; j < tablica.length; j++ )
            {
                if( ( i < 3 ) && tablica[i][j] == ' ' )
                {
                    tablica[i][j] = 'C'; // Umieszcza czarne piony
                } 
                else if ( ( i > 4 ) && tablica[i][j] == ' ' )
                {
                    tablica[i][j] = 'B'; // Umieszcza białe piony
                }
            }
        }
        return this;
    }
    
    public Plansza rysujPlansze( char [][] tablica )
    {
        System.out.println( "  ABCDEFGH \n" + " ╔═════╗" );
        for( int i = 0; i < tablica.length; i++ )
        {
            System.out.print( i + 1 + "║" );
            
            for( int j = 0; j < tablica.length; j++ )
            {
                System.out.print( tablica[i][j] );
            }
            
            System.out.print ( "║ \n" );
        }
        System.out.println( " ╚═════╝" );
        
        return this;
    }
}