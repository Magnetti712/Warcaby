package warcaby;

public class Warcaby 
{
    public static char [][] plansza = new char[8][8];
    
    public static void main(String[] args)
    {   
        Menu m = new Menu( plansza );
        
        while( true )
        {
            m.menu();
        }
    }
}