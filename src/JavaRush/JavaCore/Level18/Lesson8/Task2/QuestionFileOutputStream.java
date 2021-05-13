package JavaRush.JavaCore.Level18.Lesson8.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class QuestionFileOutputStream implements AmigoOutputStream{
        private AmigoOutputStream amigoOutputStream;

        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        public QuestionFileOutputStream (AmigoOutputStream outputStream){
            this.amigoOutputStream = outputStream;
        }

        @Override
        public void flush() throws IOException {
            amigoOutputStream.flush();
        }

        @Override
        public void write(int b) throws IOException {
            amigoOutputStream.write(b);
        }

        @Override
        public void write(byte[] b) throws IOException {
            amigoOutputStream.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            amigoOutputStream.write(b, off, len);
        }

        @Override
        public void close() throws IOException {
            System.out.println("Вы действительно хотите закрыть поток? Д/Н");
            if (str.readLine().equals("Д")){
                amigoOutputStream.close();
            }
        }
}
