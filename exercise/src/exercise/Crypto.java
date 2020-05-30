package exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Crypto {

  public static void main( String[] args )
  {
      try {
          File f = new File("C:\\Users\\ramji\\Desktop\\test1.enc");
          Cipher c;
          Key k;
          String secretString = "AE3274D5BFA170CA69BB534BE5A22467";
          String ivString = "0B02C7A619A8F348EE53A35EDC8DA116";
          byte[] secret = hexStringToByteArray(secretString);
          byte[] iv = hexStringToByteArray(ivString);

          c = Cipher.getInstance("AES/CBC/PKCS5Padding");
          k = new SecretKeySpec(secret, "AES");
          c.init(Cipher.DECRYPT_MODE, k, new IvParameterSpec(iv));

          CipherInputStream cis = new CipherInputStream(new FileInputStream(f), c);
          BufferedReader br = new BufferedReader(new InputStreamReader(cis));

          String line;
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          br.close();
      } catch (IOException e) {
          System.out.println(e.getMessage());
      } catch (NoSuchAlgorithmException e) {
          System.out.println(e.getMessage());
      } catch (NoSuchPaddingException e) {
          System.out.println(e.getMessage());
      } catch (InvalidKeyException e) {
          System.out.println(e.getMessage());
      } catch (InvalidAlgorithmParameterException e) {
          System.out.println(e.getMessage());
      }

  }

  public static byte[] hexStringToByteArray(String s) {
      int len = s.length();
      byte[] data = new byte[len / 2];
      for (int i = 0; i < len; i += 2) {
          data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                               + Character.digit(s.charAt(i+1), 16));
      }
      return data;
  }
}