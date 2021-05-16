package JavaRush.JavaCore.Level18.Lesson8;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Task5 {
    public class TableInterfaceWrapper implements TableInterface{
        TableInterface tableInterface;

        public TableInterfaceWrapper (TableInterface tableInterface){
            this.tableInterface = tableInterface;
        }
        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase(Locale.ROOT);
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
