package warcaby;

import java.util.Scanner;

public class Gracz 
{   
    Plansza p = new Plansza();
    Error e = new Error();
    
    public int pobierzWspolrzedne( char znakWsporzednej ) // Pobiera współrzedne podane przez użytkownika
    {
        Scanner sc = new Scanner( System.in );
        
        System.out.print( "Wpisz współrzedną, " + znakWsporzednej + ": " ); 
        int pobranaWspolrzedna = sc.nextInt();
        
        return pobranaWspolrzedna;
    }
    
    public Gracz wybierzPiona( char [][] tablica ) // Wybiera piona z tablicy
    {
        System.out.println( "Wybierz piona: ");
        
        int pobraneX = pobierzWspolrzedne( 'x' ) - 1;   
        int pobraneY = pobierzWspolrzedne( 'y' ) - 1;
        
        if( pobraneX > tablica.length || pobraneX < 0 && pobraneY > tablica.length && pobraneY < 0 ) // Sprawdza, czy gracz nie podał danych z poza zakresu planszy
        {
            e.nieWybranoPiona( tablica, 0, 0 );
            wybierzPiona( tablica );
        }
        else
        {
            for( int y = 0; y < tablica.length; y++ )
            {
                for( int x = 0; x < tablica.length; x++ )
                {
                    if( tablica[pobraneX][pobraneY] == 'b' ) // Sprawdza, czy został wybrany odpowiedni pion
                    {
                        p.rysujPlansze( tablica );
                        ruchPiona( tablica, pobraneX, pobraneY );

                        x = tablica.length; y = tablica.length; // koniec pętli
                    }
                    else
                    {
                        e.nieWybranoPiona( tablica , x, y );
                        wybierzPiona( tablica );
                    }
                }
            }
        }
        return this;
    }
    
    public Gracz ruchPiona( char [][] tablica, int pionX, int pionY ) // Funkcja, która pozwala użytkownikowi poruszać pionami
    {
        System.out.println( "Gdzie ruszyć piona" );
        
        int pobraneX = pobierzWspolrzedne( 'x' ) - 1;   
        int pobraneY = pobierzWspolrzedne( 'y' ) - 1;
        
        if( pobraneX > tablica.length || pobraneX < 0 && pobraneY > tablica.length && pobraneY < 0 ) // Sprawdza, czy użytkownik nie podał danych z poza zakresu planszy
        {
            e.nieMoznaWykonacRuchu( tablica, 0, 0 );
            wybierzPiona( tablica );
        }
        else
        {
            for( int y = 0; y < tablica.length; y++ )
            {
                for( int x = 0; x < tablica.length; x++ )
                { 
                    if( tablica[pobraneX][pobraneY] == ' ' ) //Sprawdza, czy użytkownik wybrał najbliższe wolne pole na planszy
                    {
                        if ( ( ( pobraneY - pionY ) == 1 || ( pionY - pobraneY ) == 1 )  &&
                             ( ( pobraneX - pionX ) == 1 || ( pionX - pobraneX ) == 1 ) ) 
                        {
                            char temp = tablica[pobraneX][pobraneY];
                    
                            tablica[pobraneX][pobraneY] = tablica[pionX][pionY];
                            tablica[pionX][pionY] = temp;
                  
                            x = tablica.length; y = tablica.length; // koniec pętli
                        }
                        else if( tablica[pobraneX][pobraneY] == ' ' && ( tablica[pobraneX - 1][pobraneY - 1] == 'c' ) || ( tablica[pobraneX + 1][pobraneY - 1] == 'c' ) || ( tablica[pobraneX - 1][pobraneY + 1] == 'c' ) || ( tablica[pobraneX + 1][pobraneY + 1] == 'c' ) )
                        {
                            if ( ( ( pobraneY - pionY ) == 2 || ( pionY - pobraneY ) == 2 )  &&
                                 ( ( pobraneX - pionX ) == 2 || ( pionX - pobraneX ) == 2 ) )
                            {
                                if( tablica[pobraneX - 1][pobraneY - 1] == 'c' )
                                    tablica[pobraneX - 1][pobraneY - 1] = ' ';
                                
                                if( tablica[pobraneX + 1][pobraneY - 1] == 'c' )
                                    tablica[pobraneX + 1][pobraneY - 1] = ' ';
                                
                                if( tablica[pobraneX - 1][pobraneY + 1] == 'c' )
                                    tablica[pobraneX - 1][pobraneY + 1] = ' ';
                                
                                if( tablica[pobraneX + 1][pobraneY + 1] == 'c' )
                                    tablica[pobraneX + 1][pobraneY + 1] = ' ';
                                
                                char temp = tablica[pobraneX][pobraneY];

                                tablica[pobraneX][pobraneY] = tablica[pionX][pionY];
                                tablica[pionX][pionY] = temp;
                                
                                x = tablica.length; y = tablica.length; // koniec pętli
                            }
                        }
                        else
                        {
                            e.nieMoznaWykonacRuchu( tablica, x, y );
                            wybierzPiona( tablica );
                        }
                    }
                    else
                    {                        
                        e.nieMoznaWykonacRuchu( tablica, x, y );
                        wybierzPiona( tablica );
                    }
                }
            }
        }
        return this;
    }
}