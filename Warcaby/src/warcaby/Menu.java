package warcaby;

import java.util.Scanner;

public class Menu 
{
    public char [][] plansza;  
    
    Menu( char [][] tablica )
    {
        this.plansza = tablica;
    }
    
    public Menu menuText()
    {
        System.out.print( "================= \n"
                        + "|    Warcaby    | \n"
                        + "================= \n"
                        + "| 1) Zagraj     | \n"
                        + "================= \n"
                        + "| 2) Statystyki | \n"
                        + "================= \n"
                        + "| 3) Wyjśćie    | \n"
                        + "================= \n" );
        return this;
    }
    
    public Menu opcja1()
    {
        Plansza pl = new Plansza( this.plansza );
        Gracz gr = new Gracz();
                
        pl.umiescPiony( this.plansza );
        pl.rysujPlansze( this.plansza );
        gr.wybierzPion( plansza );
        
        return this;
    }
    
    public Menu opcja2()
    {
        
        return this;
    }
    
    public Menu opcja3( )
    {
        
        return this;
    }
    
    public Menu menu()
    {
        Scanner sc = new Scanner( System.in );
        
        menuText();
        int menu = sc.nextInt();
        
        switch( menu )
        {
            case 1:
                opcja1();
            break;
            
            case 2:
                opcja2();
            break;
            
            case 3:
                opcja3();
            break;
            
            default:
                System.out.println( "Nie wybrano poprawnie opcji! \n" );
            break;
        }
        return this;
    }
}