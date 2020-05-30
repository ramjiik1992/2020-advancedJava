package exercise.designpatterns.strategy;

public class RarCompression  implements CompressionStrategy{

  @Override
  public void compressFiles(String fileName) {
    System.out.println("file compression using RAR format");
    
  }

}
