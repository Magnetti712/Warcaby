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
        
        //if( wybierz.toLowerCase() == 'a' &&  )
        
        return this;
    }
    
    public Pion ruch( char [][] tablica )
    {
        
        return this;
    }
}