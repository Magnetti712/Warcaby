package warcaby;

import java.util.Scanner;

class Gracz
{    
    public Gracz wybierzPion( char [][] tablica )
    {
        Scanner sc = new Scanner( System.in );
        
        System.out.print( "Wpisz współrzedne piona, x: " ); 
        int x = sc.nextInt();
        
        System.out.print( "Wpisz współrzedne piona, y: " ); 
        int y = sc.nextInt();
      
        if( ( x > 0 && x < 9 ) && ( y > 0 && y < 9 ) )
        {
            for( int i = 0; i < tablica.length; i++ )
            {
                for( int j = 0; j < tablica.length; j++ )
                {
                    if( tablica[y-1][x-1] == 'B' )
                    {
                        ruchPiona( tablica );
                    }
                }
            }
        }
        else
        {
            System.out.print( "Nie wybrano piona! ;c" );
        }
        
        return this;
    }
    
    public Gracz ruchPiona( char [][] tablica )
    {
        Scanner sc = new Scanner( System.in );
        
        System.out.print( "Wpisz współrzedne gdzie pion ma się poruszyć, x: " ); 
        int x = sc.nextInt();
        
        System.out.print( "Wpisz współrzedne gdzie pion ma się poruszyć, y: " ); 
        int y = sc.nextInt();
        
        if( ( x > 0 && x < 9 ) && ( y > 0 && y < 9 ) )
        {
            for( int i = 0; i < tablica.length; i++ )
            {
                for( int j = 0; j < tablica.length; j++ )
                {
                    if( tablica[y-1][x-1] == 'B' || tablica[y-1][x-1] == 'C' || tablica[y-1][x-1] == '-' )
                    {
                        System.out.print( "Nie można zrobić ruchu!" );
                        wybierzPion( tablica );
                    }
                    else if( tablica[y][x-2] == ' ' )
                    {
                        char temp = tablica[y-1][x-1];
                        tablica[y-1][x-1] = ' ';
                        tablica[y][x-2] = temp;
                    } 
                    else if( tablica[y][x] == ' ' )
                    {
                        char temp = tablica[y-1][x-1];
                        tablica[y-1][x-1] = ' ';
                        tablica[y][x] = temp;
                    }       
                }
            }
        }
        else
        {
            System.out.print( "Nie można zrobić ruchu!" );
            wybierzPion( tablica );
        }
        
        return this;
    }
}