package SimpleGame;


public class Player
{
    private Cell position;

    public Player()
    {
        position = GameMaster.instance().getGameBoard().getCell(0);
    }

    public Cell getPosition()
    {
        return this.position;
    }

    public void setPosition(Cell position)
    {
        this.position = position;
    }
}
