import java.util.ArrayList;

public class BarronsCompSciTest1FRQ3b {

    public static ArrayList<String> lines;
   

    public BarronsCompSciTest1FRQ3b(ArrayList<String> _lines){

        lines = _lines;
        
        


    }

    public String getAdress(String name){
        //System.out.println("\n" + name);
        String temp = "";
        for(int i = 0; i < lines.size(); i++){

            if(lines.get(i) == name){
                //System.out.println(i); //4

                for(int x = i; lines.get(x) != ""; x++){
                    //System.out.println(x);
                    temp = temp + lines.get(x) + "\n";
                    //System.out.println(temp);
                   
                }
            } 
            

        }
        
        return temp;
        
        

    }

}
