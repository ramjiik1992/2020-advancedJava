package exercise.designpatterns.strategy;

public class CompressionContext {

  private CompressionStrategy strategy;
  
  public void setCompression(CompressionStrategy strategy) {
    this.strategy=strategy;
  }
  
  
  public void compressFiles(String fileName) {
    strategy.compressFiles(fileName);
  }
  
}
