package warcaby;

class Plansza 
{
    public char [][] plansza = new char[8][8];
    
    Plansza() // wypełnia tablice plansza
    {
        for( int i = 0; i < plansza.length; i++ )
        {
            for( int j = 0; j < plansza.length; j++ )
            {
                if( ( i % 2 ) == 0 )
                {
                    if( ( j % 2 ) == 0  )
                        plansza[i][j] = '-'; // Białe pole
                    else
                        plansza[i][j] = ' '; // Pole na które może zostać postawiony pionek
                }
                else
                {
                    if( ( j % 2 ) == 0  )
                        plansza[i][j] = ' '; // Pole na które może zostać postawiony pionek
                    else
                        plansza[i][j] = '-'; // Białe pole
                }
            }
        }
    }
    
    public Plansza umiescPiony()
    {
        for( int i = 0; i < plansza.length; i++ )
        {
            for( int j = 0; j < plansza.length; j++ )
            {
                if( ( i < 3 ) && plansza[i][j] == ' ' )
                {
                    plansza[i][j] = 'C'; // Umieszcza czarne piony
                } 
                else if ( ( i > 4 ) && plansza[i][j] == ' ' )
                {
                    plansza[i][j] = 'B'; // Umieszcza białe piony
                }
            }
        }
        return this;
    }
    
    public Plansza rysujPlansze()
    {
        System.out.println( "  ABCDEFGH \n" + " ╔═════╗" );
        for( int i = 0; i < plansza.length; i++ )
        {
            System.out.print( i + 1 + "║" );
            
            for( int j = 0; j < plansza.length; j++ )
            {
                System.out.print( plansza[i][j] );
            }
            
            System.out.print ( "║ \n" );
        }
        System.out.println( " ╚═════╝" );
        
        return this;
    }
}