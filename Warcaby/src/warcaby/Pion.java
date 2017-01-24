package warcaby;

import java.util.Scanner;

class Pion
{    
    public char kolor;
    
    Pion( char kolor )
    {
        this.kolor = kolor;
    }
    
    public char wyswietlKolor()
    {
        return this.kolor;
    }
    
    public Pion wybierzPion( char [][] tablica )
    {
        Scanner sc = new Scanner( System.in );
        
        System.out.print( "Wybierz piona: " );
        String wybierz = sc.nextLine();
        
        char sprawdzLitere = wybierz.toLowerCase().charAt(0);
        char sprawdzCyfre = wybierz.charAt(1);
        
        if( ( sprawdzLitere == 'a' || sprawdzLitere == 'b' || sprawdzLitere == 'c' || sprawdzLitere == 'd' || sprawdzLitere == 'e' || sprawdzLitere == 'f' || sprawdzLitere == 'g' || sprawdzLitere == 'h' ) && 
            ( sprawdzCyfre == '1' || sprawdzCyfre == '2' || sprawdzCyfre == '3' || sprawdzCyfre == '4' ) || sprawdzCyfre == '5' || sprawdzCyfre == '6' || sprawdzCyfre == '7' || sprawdzCyfre == '8' ) 
        {
            System.out.print( "Powiedzmy, że działa!" );
        }
        else
        {
            System.out.print( "Nie działa! ;c" );
        }
            
        for( int i = 0; i < tablica.length; i++ )
        {
            for( int j = 0; j < tablica.length; j++ )
            {
                
            }
        }
        
        return this;
    }
    
    public Pion ruch( char [][] tablica )
    {
        
        return this;
    }
}