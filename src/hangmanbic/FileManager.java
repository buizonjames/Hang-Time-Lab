package hangmanbic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class FileManager {
    
    String fileName = "HangTimeLab.jed";
    
    public FileManager(){
        fileName = "HangTimeLab.jed";
    }
    
    public FileManager(String s){
        fileName = s;
    }
    
    public void writeToFile(Quiz q, HighScoreManager hsm){      
        try{
            FileOutputStream fos = new FileOutputStream("HangTimeLab.jed");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(q);
            oos.writeObject(hsm);
            oos.flush();
            oos.close();
            JOptionPane.showMessageDialog(null, "Saved successfully!");         
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void readFile()
    {
        try{
            FileInputStream fis = new FileInputStream("HangTimeLab.jed");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Quiz q = (Quiz)ois.readObject();
            HighScoreManager hsm = (HighScoreManager)ois.readObject();
            
            for(int i = 0; i < q.getAnswers().size(); i++){
                Game.getQuiz().addQuiz(q.getQuestions().get(i), q.getAnswers().get(i));
            }
            for(int i = 0; i < hsm.getScores().size(); i++){
                Game.getHighScoreManager().addScore(hsm.getScores().get(i));
                Game.getHighScoreManager().addNames(hsm.getNames().get(i));
            }
            ois.close();
            JOptionPane.showMessageDialog(null, "Save file loaded successfully!");
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "No save file exists!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
