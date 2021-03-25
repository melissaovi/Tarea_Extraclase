package try_catch_throws;

import java.io.*;




public class Example1Throws {
    // IOException, checked
    public void read_file() throws FileNotFoundException, IOException {
        File archivo = new File("C:\\Users\\KimO\\Escritorio\\Tarea_Extraclase\\Tarea_Extraclase");
        FileReader file_reader = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(file_reader);
        String line;

        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void read_file2() {
        try {
            read_file();

        }catch(FileNotFoundException e){
            System.out.println("the file no exists");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("chhecked exception");
            e.printStackTrace();
        }finally {
            System.out.println("Finished program");
        }



    }

    public static void main(String[] args) {
        Example1Throws file = new Example1Throws();

        file.read_file2();

    }

}