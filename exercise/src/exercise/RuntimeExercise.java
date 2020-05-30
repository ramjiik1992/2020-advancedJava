package exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class RuntimeExercise {
  
  
  public static byte[] hexStringToByteArray(String s) {
    int len = s.length();
    byte[] data = new byte[len / 2];
    for (int i = 0; i < len; i += 2) {
        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                             + Character.digit(s.charAt(i+1), 16));
    }
    return data;
}
  

  public static void main(String[] args) throws Exception {
    
    InputStream cipherInputStream = null;
    try {
        final StringBuilder output = new StringBuilder();
        final byte[] secretKey = hexStringToByteArray("73656c616874");
        final byte[] initVector = hexStringToByteArray("656e69767269");
        
       
        
        
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(secretKey, "AES"), new IvParameterSpec(initVector, 0, cipher.getBlockSize()));
        cipherInputStream = new CipherInputStream(new FileInputStream("C:\\Users\\ramji\\Desktop\\summary.enc"), cipher);

        final String charsetName = "UTF-8";

        final byte[] buffer = new byte[8192];
        int read = cipherInputStream.read(buffer);

        while (read > -1) {
            output.append(new String(buffer, 0, read, charsetName));
            read = cipherInputStream.read(buffer);
        }

        System.out.println(output);
    } finally {
        if (cipherInputStream != null) {
            cipherInputStream.close();
        }
    }
  }
  }

