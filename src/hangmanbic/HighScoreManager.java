package hangmanbic;

import java.io.Serializable;
import java.util.ArrayList;

public class HighScoreManager implements Serializable{
    
    ArrayList<String> names;
    ArrayList<Integer> scores;
    private static final long serialVersionUID = -2551036701513105634L;
    
    public HighScoreManager(){    
        names = new ArrayList<>();
        scores = new ArrayList<>();
    }
    
    public ArrayList<String> getNames(){
        return names;
    }
    
    public ArrayList<Integer> getScores(){
        return scores;
    }
    
    public void addScore(int x){
        scores.add(x);
    }
    
    public void addNames(String n){
        names.add(n);
    }
    
    public void sortScores(){
        String tempName;
        int tempScore;
       
        for(int i = scores.size() - 1; i > 0; i--){
            if(scores.get(i) > scores.get(i - 1)){
                tempName = names.get(i);
                tempScore = scores.get(i);
                names.set(i, names.get(i-1));
                scores.set(i, scores.get(i - 1));
                names.set(i - 1, tempName);
                scores.set(i - 1, tempScore);
            }
        }
    }
    
    public String displayHighScore(){
        String str = "";
        
        for(int i = 0; i < scores.size(); i++){
            str += "RANK " + (i + 1)  + ": " + names.get(i) + " - " + scores.get(i).toString() + "\n";
        }
        return str;
    }
}
