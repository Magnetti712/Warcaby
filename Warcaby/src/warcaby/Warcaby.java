package warcaby;

import java.util.Scanner;

public class Warcaby 
{
    public static void menuText()
    {
        System.out.print( "================= \n"
                        + "|    Warcaby    | \n"
                        + "================= \n"
                        + "| 1) Zagraj     | \n"
                        + "================= \n"
                        + "| 2) Statystyki | \n"
                        + "================= \n"
                        + "| 3) Wyjśćie    | \n"
                        + "================= \n \n" );
    }
    
    public static void menu()
    {
        Scanner sc = new Scanner( System.in );
        
        menuText();
        int menu = sc.nextInt();
        
        switch( menu )
        {
            case 1:
                Plansza pl = new Plansza();
                
                pl.umiescPiony();
                pl.rysujPlansze();
            break;
            
            case 2:
                
            break;
            
            case 3:
                
            break;
        }
        
    }
    
    public static void main(String[] args)
    {
        Plansza pl = new Plansza();
                
        pl.umiescPiony();
        pl.rysujPlansze();
    }
}