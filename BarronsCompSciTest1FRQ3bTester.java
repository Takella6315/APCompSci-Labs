import java.util.ArrayList;

public class BarronsCompSciTest1FRQ3bTester {
    public static void main(String args[]){
        
        ArrayList<String> lines2 = new ArrayList<>();
        lines2.add("Mr. J. Adams");
        lines2.add("6 Rose St.");
        lines2.add("Ithaca, NY 14850");
        lines2.add("");
        lines2.add("Jack S. Smith");
        lines2.add("12 Posy Way");
        lines2.add("Suite 201");
        lines2.add("Glendale, CA 91203");
        lines2.add("");
        lines2.add("Teja Akella");
        lines2.add("6315 hilltop trail dr");
        lines2.add("new Albany, OH 43054");
        lines2.add("");
        lines2.add("manasa Akella");
        lines2.add("boston something");
        lines2.add("bostong sometihing else");
        lines2.add("");


        
        //System.out.print(lines2);

        BarronsCompSciTest1FRQ3b obj = new BarronsCompSciTest1FRQ3b(lines2);
        var address = obj.getAdress("Teja Akella");
        System.out.println(address);




    }
}
