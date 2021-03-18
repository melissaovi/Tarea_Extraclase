package throws_examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class example1 {

    public void read_file() throws FileNotFoundException{
        File file1 = new File("C:\\Users\\KimO\\Escritorio\\Tarea_Extraclase\\Tarea_Extraclase\\src");
        FileReader file_reader = new FileReader(file1);
    }



}
