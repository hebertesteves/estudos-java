public class Cube {

  private int side;
  
  public Cube() {
    setSide(0);
  }
  
  public Cube(int newSide) {
    setSide(Math.abs(newSide));
  }
    
  public int getSide() {
    return side;
  }
  
  public void setSide(int side) {
    this.side = Math.abs(side);
  }

}
