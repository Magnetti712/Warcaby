package warcaby;

import java.util.Random;

public class NPC 
{
    Error e = new Error();
    Plansza p = new Plansza();
    Gracz g = new Gracz();
    
    public int losuj()
    {
        Random r = new Random();
        int losowaWspolrzedna = r.nextInt( 7 );
        
        if( losowaWspolrzedna == 0 )
            return losowaWspolrzedna + 1;
        else if( losowaWspolrzedna == 8 )
            return losowaWspolrzedna - 1;
        else
            return losowaWspolrzedna;
    }
    
    public NPC wybierzPiona( char [][] tablica ) // Wybiera piona z tablicy
    {        
        int pobraneX = losuj();   
        int pobraneY = losuj();
        
        if( pobraneX > tablica.length || pobraneX < 0 && pobraneY > tablica.length && pobraneY < 0 ) // Sprawdza, czy AI nie wylosował danych z poza zakresu planszy
        {
            wybierzPiona( tablica );
        }
        else
        {
            for( int y = 0; y < tablica.length; y++ )
            {
                for( int x = 0; x < tablica.length; x++ )
                {
                    if( pobraneX <= x && pobraneY <= y )
                    {
                    if( tablica[pobraneX][pobraneY] == 'c' ) // Sprawdza, czy został wybrany odpowiedni pion
                    {
                        ruchPiona( tablica, pobraneX, pobraneY );
                        g.wybierzPiona( tablica );
                        
                        x = tablica.length; y = tablica.length; // koniec pętli
                    }
                    else
                    {
                        wybierzPiona( tablica );
                    }
                    }
                }
            }
        }
        return this;
    }
    
    public NPC ruchPiona( char [][] tablica, int pionX, int pionY ) // Funkcja, która pozwala AI poruszać pionami
    {
        int pobraneX = losuj();   
        int pobraneY = losuj();
        
        if( pobraneX > tablica.length || pobraneX < 0 && pobraneY > tablica.length && pobraneY < 0 ) // Sprawdza, czy AI nie podała danych z poza zakresu planszy
        {
            wybierzPiona( tablica );
        }
        else
        {
            for( int y = 0; y < tablica.length; y++ )
            {
                for( int x = 0; x < tablica.length; x++ )
                { 
                    if( tablica[pobraneX][pobraneY] == ' ' ) //Sprawdza, czy AI wybrał najbliższe wolne pole na planszy
                    {
                        if ( ( ( pobraneY - pionY ) == 1 || ( pionY - pobraneY ) == 1 )  &&
                             ( ( pobraneX - pionX ) == 1 || ( pionX - pobraneX ) == 1 ) ) 
                        {
                            char temp = tablica[pobraneX][pobraneY];
                    
                            tablica[pobraneX][pobraneY] = tablica[pionX][pionY];
                            tablica[pionX][pionY] = temp;
                  
                            x = tablica.length; y = tablica.length; // koniec pętli
                        }
                        else if( tablica[pobraneX][pobraneY] == ' ' && ( tablica[pobraneX - 1][pobraneY - 1] == 'b' ) || ( tablica[pobraneX + 1][pobraneY - 1] == 'b' ) || ( tablica[pobraneX - 1][pobraneY + 1] == 'b' ) || ( tablica[pobraneX + 1][pobraneY + 1] == 'b' ) )
                        {
                            if ( ( ( pobraneY - pionY ) == 2 || ( pionY - pobraneY ) == 2 )  &&
                                 ( ( pobraneX - pionX ) == 2 || ( pionX - pobraneX ) == 2 ) )
                            {
                                if( tablica[pobraneX - 1][pobraneY - 1] == 'b' )
                                    tablica[pobraneX - 1][pobraneY - 1] = ' ';
                                
                                if( tablica[pobraneX + 1][pobraneY - 1] == 'b' )
                                    tablica[pobraneX + 1][pobraneY - 1] = ' ';
                                
                                if( tablica[pobraneX - 1][pobraneY + 1] == 'b' )
                                    tablica[pobraneX - 1][pobraneY + 1] = ' ';
                                
                                if( tablica[pobraneX + 1][pobraneY + 1] == 'b' )
                                    tablica[pobraneX + 1][pobraneY + 1] = ' ';
                                
                                char temp = tablica[pobraneX][pobraneY];

                                tablica[pobraneX][pobraneY] = tablica[pionX][pionY];
                                tablica[pionX][pionY] = temp;

                                x = tablica.length; y = tablica.length; // koniec pętli
                            }
                        }
                        else
                        {
                            wybierzPiona( tablica );
                        }
                    }
                    else
                    {                        
                        wybierzPiona( tablica );
                    }
                }
            }
        }
        return this;
    }
}