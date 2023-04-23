

public class test{

    private int score;
    private String sentence;
    private static int numWords;

    public test(String _sentence){

        score = 0;
        sentence = _sentence;

    }

    public static void getNumberOfWords(String sentence){

        for(int i =0; i < sentence.length(); i++){

            if(sentence.charAt(i) == ' '){
                System.out.print(sentence.charAt(i));

                numWords++;
                
                

            }
            }
        System.out.print(numWords + 1);
}

    public static void main(String argsp[]){
        
        getNumberOfWords("hello how are you hi hi hi");

    }

}




