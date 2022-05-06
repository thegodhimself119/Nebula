public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        Grid g = new Grid();
        
        g.gridSetup();
        
        g.placeMines();
        // g.revealMines();
        
        
        while (true)
        {
            int row = readInt("Enter row: ");
            int col = readInt("Enter col: ");
            if (row > 8 || row < 1 || col > 8 || col < 1)
            {
                System.out.println("row and column should be between  1- 8");
                continue;
            } 
            
            
            g.revealLocation(row, col);
            
            g.gridSetup();
            
            if (g.gameOver)
            {
                break;
            }
            if (g.win)
            {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("!!!YOU WIN!!!");
                break;
            }
            
            
            System.out.println();
            
        }
    }
}
