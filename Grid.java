public class Location
{
    
    public boolean hasMine = false;
    
    boolean guessed = false;
    
    int numberOfMines = -1;
    
    
    public Location()
    {
        
    }
    
    public boolean hasMine()
    {
        return hasMine;
    }
    
    public void setMine(boolean val)
    {
        this.hasMine = val;
    }
    
    public boolean hasGuessed()
    {
        return guessed;
    }
    
    public void setGuess(boolean guess)
    {
        guessed = guess;
    }
    
    public void setNumOfMines(int mines)
    {
        numberOfMines = mines;
    }
    
    public int getNumOfMines()
    {
        return numberOfMines;
    }
    
    
}
