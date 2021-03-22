package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static class Couple {

        public int x;
        public String y;

        public Couple(int x, String y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        {
            try {
                String s = str.readLine();

                Pattern p = Pattern.compile("(\\d)\\[(\\d+)\\[(.*?)\\](.*?)\\]");
                Matcher m = p.matcher(s);

                List<Couple> couples = new ArrayList<>();
                while (m.find()) {
                    couples.add(new Couple(Integer.parseInt(m.group(1)), m.group(2)));
                }

                String rest = s.substring(s.lastIndexOf("]") + 1, s.length());
                StringBuilder sb = new StringBuilder();

                for (Couple c : couples) {
                    for (int i = 0; i < c.x; i++) {
                        sb.append(c.y);
                    }
                }

                sb.append(rest);
                System.out.println(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}