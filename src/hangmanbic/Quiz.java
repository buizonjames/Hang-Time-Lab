package hangmanbic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Quiz implements Serializable{
    
    private ArrayList<String> questions;
    private ArrayList<String> answers;
    Random rand = new Random();
    private int order;
    private int[] num = new int[54];
    private static final long serialVersionUID = -2551036701513105634L;
    
    public Quiz(){   
        questions = new ArrayList<>();
        answers = new ArrayList<>();
        order = rand.nextInt(55); //Used to access and randomize different quizzes from the array
    }
       
    public void randomizeQuiz(){ //Generates numbers wuthout repetition 
        for(int i = 0; i < num.length; i++){
            num[i] = rand.nextInt(55);
            for(int j = 0; j < i; j++){ //Loop to prevent repetition of random generated numbers
                if(num[i] == num[j]){
                    i--;
                    break;
                }
            }
        }      
    }
    
    public int getNum(int i){
        return num[i];
    }
    
    public int getOrder(){
        return order;
    }
    
    public ArrayList<String> getQuestions(){
        return questions;
    }
    
    public ArrayList<String> getAnswers(){
        return answers;
    }
    
    public void addQuiz(String q, String a){
        questions.add(q);
        answers.add(a);
    }
    
    public void initializeQuiz(){
        questions.add("What is the chemical representation of table salt?");
        answers.add("nacl");
        
        questions.add("What is the chemical element name for the symbol Au?");
        answers.add("gold");
        
        questions.add("What is the chemical element name for the symbol Fe?");
        answers.add("iron");
        
        questions.add("What is the chemical element name for the symbol Zn?");
        answers.add("zinc");
        
        questions.add("What is the chemical element name for the symbol Pb?");
        answers.add("lead");
        
        questions.add("What is the chemical element name for the symbol Ne?");
        answers.add("neon");
        
        questions.add("What is the basic unit of a chemical element?");
        answers.add("atom"); 
        
        questions.add("A compound that gives a pH level of less than 7.0.");
        answers.add("acid");
        
        questions.add("A substance that has a pH level of more than 7.0.");
        answers.add("base");
        
        questions.add("The _ _ _ _ atomic model depicts the atom as as a small, positively charged nucleus surrounded by electrons that travel in circular orbits around the nucleus.");
        answers.add("bohr");
        
        questions.add("_ _ _ _ / volume is the formula to compute for the density of a matter.");
        answers.add("mass"); 
        
        questions.add("The attraction and repulsion between atoms and molecules that is a cornerstone of chemistry.");
        answers.add("bond"); 
        
        questions.add("The energy transferred from one system to another by thermal interaction.");
        answers.add("heat"); //Index 12
        
        questions.add("What is the chemical element name for the symbol Cu?");
        answers.add("copper"); //Index 13
        
        questions.add("What is the chemical element name for the symbol I?");
        answers.add("iodine"); //Index 14
        
        questions.add("What is the chemical element name for the symbol Ni?");
        answers.add("nickel"); //Index 15
        
        questions.add("It is the element found in water with one atom.");
        answers.add("oxygen"); //Index 16
        
        questions.add("It is the second element in the periodic table.");
        answers.add("helium"); //Index 17
        
        questions.add("What is the chemical element name for the symbol Ag?");
        answers.add("silver"); //Index 18 
        
        questions.add("What is the chemical element name for the symbol S?");
        answers.add("sulfur"); //Index 19
        
        questions.add("What is the chemical element name for the symbol C?");
        answers.add("carbon"); //Index 20
        
        questions.add("What is the chemical element name for the symbol Ba?");
        answers.add("barium"); //Index 21
        
        questions.add("What is the chemical element name for the symbol Co?");
        answers.add("cobalt"); //Index 22
        
        questions.add("What is the chemical element name for the symbol Cs?");
        answers.add("cesium"); //Index 23 
        
        questions.add("What is the chemical element name for the symbol Ra?");
        answers.add("radium"); //Index 24 
        
        questions.add("The metals of Group 1 of the periodic table are called _ _ _ _ _ _ metals.");
        answers.add("alkali"); //Index 25
        
        questions.add("The value representing an element which corresponds with the number of protons within the nucleus is called atomic _ _ _ _ _ _.");
        answers.add("number"); //Index 26
        
        questions.add("Atomic _ _ _ _ _ _ is the total distance from an atom's nucleus to the outermost orbital of electron.");
        answers.add("radius"); //Index 27
        
        questions.add("A positively charged ion.");
        answers.add("cation"); //Index 28
        
        questions.add("_ _ _ _ _ _ electrolyte is a solute that completely, or almost completely, ionizes or dissociates in a solution.");
        answers.add("strong"); //Index 29
        
        questions.add("The ability to do work.");
        answers.add("energy"); //Index 30
        
        questions.add("The amount of space the matter takes up.");
        answers.add("volume"); //Index 31
        
        questions.add("The SI base unit of thermodynamic temperature.");
        answers.add("kelvin"); //Index 32
        
        questions.add("Condensation is a form of physical change from gas to _ _ _ _ _ _.");
        answers.add("liquid"); //Index 33
        
        questions.add("A sub-atomic particle that has a positive charge.");
        answers.add("proton"); //Index 34
        
        questions.add("State of matter similar to gas in which a certain portion of the particles are ionized.");
        answers.add("plasma"); //Index 35
        
        questions.add("The part of the solution that is mixed into the solvent (NaCl in saline water).");
        answers.add("solute"); //Index 36
        
        questions.add("The general term for NaCl in water is _ _ _ _ _ _ solution.");
        answers.add("saline"); //Index 37
        
        questions.add("A type of bond wherein there is sharing of one pair of electrons.");
        answers.add("single"); //Index 38 
        
        questions.add("A set of statements or principles devised to explain a group of facts or phenomena.");
        answers.add("theory"); //Index 39
        
        questions.add("A type of bond wherein there is sharing of three pairs of electrons within a covalent bond. (Ex: N2)");
        answers.add("triple"); //Index 40
        
        questions.add("A type of bond wherein there is sharing of two pairs of electrons (in a covalent bond).");
        answers.add("double"); //Index 41
        
        questions.add("What is the chemical element name for Ar?");
        answers.add("argon"); //Index 42
        
        questions.add("What is the chemical element name for B?");
        answers.add("boron"); //Index 43
        
        questions.add("What is the chemical element name for Rn?");
        answers.add("radon"); //Index 44
        
        questions.add("What is the chemical element name for Xe?");
        answers.add("xenon"); //Index 45
        
        questions.add("A _ _ _ _ _ structure is a structural representation of a molecule where dots are used to show electron position around the atoms and lines or dot pairs represent covalent bonds between atoms.");
        answers.add("lewis"); //Index 46
        
        questions.add("A state of matter characterized by structural rigidity and resistance to changes of shape or volume.");
        answers.add("solid"); //Index 47
        
        questions.add("A substance with high electrical conductivity, luster, and malleability, which readily loses electrons to form positive ions (cations).");
        answers.add("metal"); //Index 48  BUG-FREE TIL HERE
        
        questions.add("A chemical bond formed between two ions with opposite charges.");
        answers.add("ionic"); //Index 49
        
        questions.add("A negatively charged ion.");
        answers.add("anion"); //Index 50
        
        questions.add("_ _ _ _ _ mass is the mass of a molecule in grams per mole");
        answers.add("molar"); //Index 51
        
        questions.add("_ _ _ _ _ gas is any of the chemically inert gaseous elements of group 8A of the periodic table: helium, neon, argon, krypton, xenon, and radon.");
        answers.add("noble"); //Index 52
        
        questions.add("A gas formed by boiling or evaporating a liquid.");
        answers.add("vapor"); //Index 53
        
        questions.add("One of the most abundant and useful compunds on the Earth's surface. Its chemical formula is H2O.");
        answers.add("water"); //Index 54
        
        questions.add("It is the SI unit of work or energy.");
        answers.add("joule"); //Index 55
    }
}
