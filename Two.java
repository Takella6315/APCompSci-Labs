public class Two{

    public One part1; 
    public One part2;

    public Two(String name){

        part1 = new One(name, 13);
        part2 = new One("B");

    }

    public String toString(){

        return part1 + " " + part2;

    }




}

