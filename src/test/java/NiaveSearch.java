public class NiaveSearch {
    public static int niaveSearch(String toSearch, String pattern) {

        int matchCount = 0;

        if (pattern != null & toSearch != null){
            for(int i=0; i<toSearch.length(); i++){
                 matchCount = 0;
                 while(toSearch.charAt(i+matchCount) == pattern.charAt(matchCount)){
                     matchCount++;
                     if(toSearch.length() == matchCount){
                         i+=matchCount-1;
                         break;
                     }
                 }
            }
        }
        return matchCount;

    }


    public static void main(String[] args)
    {
        String pattern = "at";
        String toSearch = "The cat chased the dog";
        System.out.println("I am a Geek");
        int patternFound = niaveSearch(toSearch, pattern);
        System.out.println("Max Profit:" + patternFound);
    }
}
