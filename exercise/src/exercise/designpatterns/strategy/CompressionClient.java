package exercise.designpatterns.strategy;

public class CompressionClient {
public static void main(String[] args) {
  
  CompressionContext context = new CompressionContext();
  
  context.setCompression(new RarCompression());
  
  context.compressFiles("sample");
}
}
