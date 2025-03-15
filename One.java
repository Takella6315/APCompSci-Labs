public class One {
    
    private int nb;
    private String str;

    public One(String str, int nb){

        this.str = str;
        this.nb = nb;

    }   

    public One(String str){

        this.str = str;
        this.nb = 1;

    }
    public String toString(){

        return nb + " " + str;

    }

}
