import java.io.FileInputStream; //«input-output»
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
     public static void main(String[] args) throws IOException {
          try {
              FileInputStream in = new FileInputStream("E:\\Программирование\\Text\\Test.txt");
              byte[] array = new byte[in.available()];
              in.read(array);
              String text = new String(array);
              int count = 0;
              for (int i = 0; i < text.length(); i++) {
                  if (text.charAt(i) == 'r') {
                      count++;
                  }
              }
              System.out.println(count);

          } catch (IOException e) {
              e.printStackTrace(); //инструмент для диагностики исключения.
          }
      }
  }
/*public static void main(String[] args) throws FileNotFoundException {
    FileInputStream in = new FileInputStream("E:\\Программирование\\Text\\Test.txt");
    try {
        byte[] array = new byte[in.available()];
        in.read(array);
        String str = new String(array);
        int k = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'r') && (str.charAt(i) != ' ')) {
                k++;
            }
            if (str.charAt(i) == ' ') {
                if (k >= 3) {
                    count++;
                }
                k = 0;
            }
        }
        if (k >= 3) {
            count++;
        }
        System.out.println("Количество слов = " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/
