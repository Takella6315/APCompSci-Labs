package Unit15;


public class Sentence{

    private static String sentence;
    private static int numWords = 0;
    public Sentence(String _sentence){
             sentence = _sentence;
        
        }
        public int getNumberOfWords(){
   
             for(int i = 0; i < sentence.length(); i++){
   
                  if(sentence.charAt(i) == ' ' || sentence.charAt(i) == ','){
                       numWords++;
                  } 
             }
            return numWords + 1;
            }
        public int getScore(String tested){
            int score = 0;
            
            score = score - numWords;


            if(sentence.contains(tested)){

                score += 10;

            }

            int location = sentence.indexOf(tested);
            if (sentence.substring(location, sentence.length()) == tested){

                score += 5;

            }
            return score;


        }


}


