package warcaby;

import java.util.Scanner;

public class Menu 
{
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
                        + "================= \n \n" );
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

            break;
            
            case 2:
                
            break;
            
            case 3:
                
            break;
        }
        return this;
    }
}