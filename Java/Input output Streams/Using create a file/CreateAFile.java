import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

public class CreateAFile {
    public static void main(String[] args) {
        
        // create a new file using file.createNewFile()

        // File f = new File("./newFile.txt");
        // try {
        //     f.createNewFile();
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.out.println("Error while creating a new file");
        // }



        // write in a file using same wr.write

        // try {
        //     FileWriter wr = new FileWriter("newFile.txt");
        //     wr.write("this is our first file we written it using java program \n Okay now the second line we writting from here");
        //     wr.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.out.println("error while trying to write in a file");
        // }




        // read a file using scanner class

        // File readThisFile = new File("newFile.txt");

        // try {
        //     Scanner sc = new Scanner(readThisFile);
        //     while (sc.hasNextLine()) {
        //         System.out.println(sc.nextLine());
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }



        // delete a file

        File deleteThisFile = new File("newFile.txt");
        if(deleteThisFile.delete()) System.out.println("This file has been deleted" + deleteThisFile.getName());
        else System.out.println("Error while deleting this file");


    }
}
