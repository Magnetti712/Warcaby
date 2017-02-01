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
                        + "| 2) Wyjście    | \n"
                        + "================= \n" );
        return this;
    }
    
    public void opcja1()
    {
        Plansza p = new Plansza();
        Gracz g = new Gracz();
        
        p.wypelnijPlansze( this.plansza );        
        p.umiescPiony( this.plansza );
        
        while( true )
        {
            p.rysujPlansze( this.plansza );
            g.wybierzPiona( this.plansza );
        }
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
                System.exit(0);
            break;
            
            default:
                System.out.println( "Nie wybrano poprawnie opcji! \n" );
            break;
        }
        return this;
    }
}