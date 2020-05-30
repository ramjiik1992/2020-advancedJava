package exercise.designpatterns.strategy;

public class ZipCompression  implements CompressionStrategy{

  @Override
  public void compressFiles(String fileName) {
    System.out.println("file compression using Zip format");
    
  }

}
