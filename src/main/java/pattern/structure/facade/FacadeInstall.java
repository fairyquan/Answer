package pattern.structure.facade;

public class FacadeInstall {

  private MainBoard mainBoard;

  private NetCard netCard;

  private VideoCard videoCard;

  public FacadeInstall(){
    mainBoard = new MainBoard();
    netCard = new NetCard();
    videoCard = new VideoCard();
  }

  public void start(){
    mainBoard.start();
    netCard.start();
    videoCard.start();
  }
}