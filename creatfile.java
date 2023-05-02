import java.util.io.File;
import java.util.io.IOException;

class creatfile{
    public static void main(String arg[])
    {
        try{
            File myobj=new File("myfile.txt");
            if(myobj.createNewfile()){
              System.out.println("File created"+myobj.getName());
            }
            else
            {  
                System.out.println("file is exist");
            }
        }catch(IOException e){
        System.out.println("error occured");
        }
    }
}