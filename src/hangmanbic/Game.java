package hangmanbic;

import java.awt.event.KeyEvent;
import java.io.*;
import sun.audio.*;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/*IMPORTANT NOTE: The val variable corresponds to the position of the question in the arraylist found 
in the Quiz class. It will serve as the core of the game since conditions within the letterBtns will
be based from it and it will be the sentinel value for randomizing the questions as the game goes on.
*/

/*LAST UPDATE: Finished programming all questions || **MAJOR BUG FIXES** || 3-13-2017
//NEXT UPDATE: Storyline[DONE],high score algorithm
  
//Benasa: Sounds, questions, scientist animation, help/instructions screen
//Estrada: Sprites, loading screen animation, game icon
FUTURE UPDATES: [DROP]Additonal game modes, [DONE]bgm loop through Audacity, [DONE]graphics improvements
PENDING GAME MODES: Multiple choice quiz, chemical combining(object clicking or dragging to form compounds)
*/

public class Game extends javax.swing.JFrame {
    static Quiz quiz = new Quiz();
    static HighScoreManager hsm = new HighScoreManager();
    FileManager fm = new FileManager();
    char answer;
    String guessedLetters;
    static int wrongCounter;
    int val = 0, score = 0, index = 0, sceneOrder = 0, skipVar = 0; 
    AudioStream audios, audios2, audios3; //Different audio input stream from specific files
    AudioData ad;
    ContinuousAudioDataStream loop = null;
    int endGameCounter = 0;
    
    public Game() {     
        quiz.initializeQuiz();
        initComponents();
        hidePic();
        this.setTitle("Hang Time Laboratory");
        this.setSize(720, 480);
        this.setResizable(false); //JFrame cannot be resized or maximized
        this.setLocationRelativeTo(null); //Spawns the JFrame to the center
        gamePanel.setVisible(false);
        highScorePanel.setVisible(false);
        loadPanel.setVisible(false);
        storyPanel.setVisible(false);
        helpPanel.setVisible(false);
        guessedLetters = "";
        answer = '\0';
        wrongCounter = 0;
    }
    
    private void hidePic(){
        firstWrong.setVisible(false);
        secondWrong.setVisible(false);
        thirdWrong.setVisible(false);
        gameOver.setVisible(false);
        namePrompt.setVisible(false);
        saveHighScore.setVisible(false);
        playerName.setVisible(false);
        checkSymbol.setVisible(false);
        checkSymbol2.setVisible(false);
        checkSymbol3.setVisible(false);
        nextQuestion.setVisible(false);
        goToMain.setVisible(false);
        exitGame.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        highScore = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        char1 = new javax.swing.JLabel();
        char2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        copyRight = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        quiz1 = new javax.swing.JPanel();
        letterO = new javax.swing.JButton();
        letterN = new javax.swing.JButton();
        letterM = new javax.swing.JButton();
        letterL = new javax.swing.JButton();
        letterK = new javax.swing.JButton();
        letterJ = new javax.swing.JButton();
        letterI = new javax.swing.JButton();
        letterH = new javax.swing.JButton();
        letterP = new javax.swing.JButton();
        letterG = new javax.swing.JButton();
        letterT = new javax.swing.JButton();
        letterR = new javax.swing.JButton();
        letterF = new javax.swing.JButton();
        letterE = new javax.swing.JButton();
        letterS = new javax.swing.JButton();
        letterD = new javax.swing.JButton();
        letterY = new javax.swing.JButton();
        letterZ = new javax.swing.JButton();
        letterX = new javax.swing.JButton();
        letterW = new javax.swing.JButton();
        letterV = new javax.swing.JButton();
        letterQ = new javax.swing.JButton();
        letterU = new javax.swing.JButton();
        letterA = new javax.swing.JButton();
        letterB = new javax.swing.JButton();
        letterC = new javax.swing.JButton();
        fiveLetPanel = new javax.swing.JPanel();
        checkSymbol3 = new javax.swing.JLabel();
        fiveLet1 = new javax.swing.JLabel();
        fiveLet2 = new javax.swing.JLabel();
        fiveLet3 = new javax.swing.JLabel();
        fiveLet4 = new javax.swing.JLabel();
        fiveLet5 = new javax.swing.JLabel();
        fourLetPanel = new javax.swing.JPanel();
        letter1 = new javax.swing.JLabel();
        letter2 = new javax.swing.JLabel();
        letter3 = new javax.swing.JLabel();
        letter4 = new javax.swing.JLabel();
        checkSymbol = new javax.swing.JLabel();
        sixLetPanel = new javax.swing.JPanel();
        checkSymbol2 = new javax.swing.JLabel();
        sixLet1 = new javax.swing.JLabel();
        sixLet2 = new javax.swing.JLabel();
        sixLet3 = new javax.swing.JLabel();
        sixLet4 = new javax.swing.JLabel();
        sixLet5 = new javax.swing.JLabel();
        sixLet6 = new javax.swing.JLabel();
        goToMain = new javax.swing.JButton();
        exitGame = new javax.swing.JButton();
        nextQuestion = new javax.swing.JButton();
        scientist = new javax.swing.JLabel();
        scoreDisp = new javax.swing.JLabel();
        firstWrong = new javax.swing.JLabel();
        secondWrong = new javax.swing.JLabel();
        thirdWrong = new javax.swing.JLabel();
        question1 = new javax.swing.JLabel();
        namePrompt = new javax.swing.JLabel();
        gameOver = new javax.swing.JLabel();
        saveHighScore = new javax.swing.JButton();
        playerName = new javax.swing.JTextField();
        labBG = new javax.swing.JLabel();
        helpPanel = new javax.swing.JPanel();
        goBack = new javax.swing.JButton();
        miniChar = new javax.swing.JLabel();
        helpBG = new javax.swing.JLabel();
        loadPanel = new javax.swing.JPanel();
        frame1 = new javax.swing.JLabel();
        frame2 = new javax.swing.JLabel();
        frame3 = new javax.swing.JLabel();
        frame4 = new javax.swing.JLabel();
        frame5 = new javax.swing.JLabel();
        frame6 = new javax.swing.JLabel();
        frame7 = new javax.swing.JLabel();
        frame8 = new javax.swing.JLabel();
        frame9 = new javax.swing.JLabel();
        frame10 = new javax.swing.JLabel();
        frame11 = new javax.swing.JLabel();
        frame12 = new javax.swing.JLabel();
        frame13 = new javax.swing.JLabel();
        frame14 = new javax.swing.JLabel();
        frame15 = new javax.swing.JLabel();
        frame16 = new javax.swing.JLabel();
        frame17 = new javax.swing.JLabel();
        frame18 = new javax.swing.JLabel();
        frame19 = new javax.swing.JLabel();
        frame20 = new javax.swing.JLabel();
        frame21 = new javax.swing.JLabel();
        frame22 = new javax.swing.JLabel();
        frame23 = new javax.swing.JLabel();
        frame24 = new javax.swing.JLabel();
        frame25 = new javax.swing.JLabel();
        frame26 = new javax.swing.JLabel();
        frame27 = new javax.swing.JLabel();
        frame28 = new javax.swing.JLabel();
        frame29 = new javax.swing.JLabel();
        frame30 = new javax.swing.JLabel();
        frame31 = new javax.swing.JLabel();
        frame32 = new javax.swing.JLabel();
        frame33 = new javax.swing.JLabel();
        frame34 = new javax.swing.JLabel();
        frame35 = new javax.swing.JLabel();
        frame36 = new javax.swing.JLabel();
        frame37 = new javax.swing.JLabel();
        frame38 = new javax.swing.JLabel();
        frame39 = new javax.swing.JLabel();
        frame40 = new javax.swing.JLabel();
        frame41 = new javax.swing.JLabel();
        frame42 = new javax.swing.JLabel();
        frame43 = new javax.swing.JLabel();
        frame44 = new javax.swing.JLabel();
        frame45 = new javax.swing.JLabel();
        frame46 = new javax.swing.JLabel();
        frame47 = new javax.swing.JLabel();
        frame48 = new javax.swing.JLabel();
        frame49 = new javax.swing.JLabel();
        frame50 = new javax.swing.JLabel();
        storyPanel = new javax.swing.JPanel();
        skipStory = new javax.swing.JButton();
        scene1 = new javax.swing.JLabel();
        scene2 = new javax.swing.JLabel();
        scene3 = new javax.swing.JLabel();
        scene4 = new javax.swing.JLabel();
        scene5 = new javax.swing.JLabel();
        scene6 = new javax.swing.JLabel();
        scene7 = new javax.swing.JLabel();
        scene8 = new javax.swing.JLabel();
        scene9 = new javax.swing.JLabel();
        highScorePanel = new javax.swing.JPanel();
        goBack2 = new javax.swing.JButton();
        scrollPane1 = new javax.swing.JScrollPane();
        highScoreList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        titlePanel.setMaximumSize(new java.awt.Dimension(765, 450));
        titlePanel.setPreferredSize(new java.awt.Dimension(720, 450));
        titlePanel.setLayout(null);

        playButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playButton.setText("Start Game");
        playButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        titlePanel.add(playButton);
        playButton.setBounds(320, 220, 140, 40);

        highScore.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        highScore.setText("High Scores");
        highScore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        highScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreActionPerformed(evt);
            }
        });
        titlePanel.add(highScore);
        highScore.setBounds(320, 270, 140, 40);

        helpButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        helpButton.setText("How To Play");
        helpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        titlePanel.add(helpButton);
        helpButton.setBounds(320, 320, 140, 40);

        char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Chitoge.png"))); // NOI18N
        titlePanel.add(char1);
        char1.setBounds(460, 230, 190, 190);

        char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Onodera.png"))); // NOI18N
        titlePanel.add(char2);
        char2.setBounds(140, 260, 150, 160);

        exitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        titlePanel.add(exitButton);
        exitButton.setBounds(320, 370, 140, 40);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/logo.png"))); // NOI18N
        titlePanel.add(titleLabel);
        titleLabel.setBounds(70, 80, 580, 70);

        copyRight.setBackground(new java.awt.Color(57, 101, 173));
        copyRight.setForeground(new java.awt.Color(255, 255, 255));
        copyRight.setText(" © 2017 ADAMSON UNIVERSITY BIC ENTERTAINMENT. ALL RIGHTS RESERVED");
        copyRight.setOpaque(true);
        titlePanel.add(copyRight);
        copyRight.setBounds(150, 420, 450, 20);

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/titleBackground.png"))); // NOI18N
        bgLabel.setBounds(0, 0, 720, 480);
        bgLabel.setPreferredSize(new java.awt.Dimension(720, 500));
        titlePanel.add(bgLabel);
        bgLabel.setBounds(0, 0, 720, 450);

        gamePanel.setPreferredSize(new java.awt.Dimension(720, 450));
        gamePanel.setLayout(new java.awt.CardLayout());

        quiz1.setLayout(null);

        letterO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterO.setText("O");
        letterO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterOActionPerformed(evt);
            }
        });
        quiz1.add(letterO);
        letterO.setBounds(90, 400, 44, 40);

        letterN.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterN.setText("N");
        letterN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterNActionPerformed(evt);
            }
        });
        quiz1.add(letterN);
        letterN.setBounds(40, 400, 43, 40);

        letterM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterM.setText("M");
        letterM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterMActionPerformed(evt);
            }
        });
        quiz1.add(letterM);
        letterM.setBounds(640, 350, 45, 40);

        letterL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterL.setText("L");
        letterL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterLActionPerformed(evt);
            }
        });
        quiz1.add(letterL);
        letterL.setBounds(590, 350, 41, 40);

        letterK.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterK.setText("K");
        letterK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterKActionPerformed(evt);
            }
        });
        quiz1.add(letterK);
        letterK.setBounds(540, 350, 43, 40);

        letterJ.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterJ.setText("J");
        letterJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterJActionPerformed(evt);
            }
        });
        quiz1.add(letterJ);
        letterJ.setBounds(490, 350, 40, 40);

        letterI.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterI.setText("I");
        letterI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterIActionPerformed(evt);
            }
        });
        quiz1.add(letterI);
        letterI.setBounds(440, 350, 40, 40);

        letterH.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterH.setText("H");
        letterH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterHActionPerformed(evt);
            }
        });
        quiz1.add(letterH);
        letterH.setBounds(390, 350, 43, 40);

        letterP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterP.setText("P");
        letterP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterPActionPerformed(evt);
            }
        });
        quiz1.add(letterP);
        letterP.setBounds(140, 400, 42, 40);

        letterG.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterG.setText("G");
        letterG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterGActionPerformed(evt);
            }
        });
        quiz1.add(letterG);
        letterG.setBounds(340, 350, 44, 40);

        letterT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterT.setText("T");
        letterT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterTActionPerformed(evt);
            }
        });
        quiz1.add(letterT);
        letterT.setBounds(340, 400, 41, 40);

        letterR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterR.setText("R");
        letterR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterRActionPerformed(evt);
            }
        });
        quiz1.add(letterR);
        letterR.setBounds(240, 400, 43, 40);

        letterF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterF.setText("F");
        letterF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterFActionPerformed(evt);
            }
        });
        quiz1.add(letterF);
        letterF.setBounds(290, 350, 41, 40);

        letterE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterE.setText("E");
        letterE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterEActionPerformed(evt);
            }
        });
        quiz1.add(letterE);
        letterE.setBounds(240, 350, 42, 40);

        letterS.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterS.setText("S");
        letterS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterSActionPerformed(evt);
            }
        });
        quiz1.add(letterS);
        letterS.setBounds(290, 400, 42, 40);

        letterD.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterD.setText("D");
        letterD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterDActionPerformed(evt);
            }
        });
        quiz1.add(letterD);
        letterD.setBounds(190, 350, 43, 40);

        letterY.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterY.setText("Y");
        letterY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterYActionPerformed(evt);
            }
        });
        quiz1.add(letterY);
        letterY.setBounds(590, 400, 43, 40);

        letterZ.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterZ.setText("Z");
        letterZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterZActionPerformed(evt);
            }
        });
        quiz1.add(letterZ);
        letterZ.setBounds(640, 400, 40, 40);

        letterX.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterX.setText("X");
        letterX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterXActionPerformed(evt);
            }
        });
        quiz1.add(letterX);
        letterX.setBounds(540, 400, 42, 40);

        letterW.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterW.setText("W");
        letterW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterWActionPerformed(evt);
            }
        });
        quiz1.add(letterW);
        letterW.setBounds(490, 400, 47, 40);

        letterV.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterV.setText("V");
        letterV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterVActionPerformed(evt);
            }
        });
        quiz1.add(letterV);
        letterV.setBounds(440, 400, 43, 40);

        letterQ.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterQ.setText("Q");
        letterQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterQActionPerformed(evt);
            }
        });
        quiz1.add(letterQ);
        letterQ.setBounds(190, 400, 44, 40);

        letterU.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterU.setText("U");
        letterU.setToolTipText("");
        letterU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterUActionPerformed(evt);
            }
        });
        quiz1.add(letterU);
        letterU.setBounds(390, 400, 43, 40);

        letterA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterA.setText("A");
        letterA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterAActionPerformed(evt);
            }
        });
        quiz1.add(letterA);
        letterA.setBounds(40, 350, 43, 40);

        letterB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterB.setText("B");
        letterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterBActionPerformed(evt);
            }
        });
        quiz1.add(letterB);
        letterB.setBounds(90, 350, 43, 40);

        letterC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        letterC.setText("C");
        letterC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterCActionPerformed(evt);
            }
        });
        quiz1.add(letterC);
        letterC.setBounds(140, 350, 43, 40);

        fiveLetPanel.setOpaque(false);

        checkSymbol3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/download.png"))); // NOI18N

        fiveLet1.setBackground(new java.awt.Color(255, 255, 255));
        fiveLet1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fiveLet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiveLet1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fiveLet1.setOpaque(true);

        fiveLet2.setBackground(new java.awt.Color(255, 255, 255));
        fiveLet2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fiveLet2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiveLet2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fiveLet2.setOpaque(true);

        fiveLet3.setBackground(new java.awt.Color(255, 255, 255));
        fiveLet3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fiveLet3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiveLet3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fiveLet3.setOpaque(true);

        fiveLet4.setBackground(new java.awt.Color(255, 255, 255));
        fiveLet4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fiveLet4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiveLet4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fiveLet4.setOpaque(true);

        fiveLet5.setBackground(new java.awt.Color(255, 255, 255));
        fiveLet5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fiveLet5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiveLet5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fiveLet5.setOpaque(true);

        javax.swing.GroupLayout fiveLetPanelLayout = new javax.swing.GroupLayout(fiveLetPanel);
        fiveLetPanel.setLayout(fiveLetPanelLayout);
        fiveLetPanelLayout.setHorizontalGroup(
            fiveLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fiveLetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fiveLet1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiveLet2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiveLet3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiveLet4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiveLet5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSymbol3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        fiveLetPanelLayout.setVerticalGroup(
            fiveLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fiveLetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fiveLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkSymbol3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveLet5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveLet4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveLet3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveLet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveLet1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        quiz1.add(fiveLetPanel);
        fiveLetPanel.setBounds(240, 180, 370, 50);

        fourLetPanel.setOpaque(false);

        letter1.setBackground(new java.awt.Color(255, 255, 255));
        letter1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        letter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        letter1.setOpaque(true);

        letter2.setBackground(new java.awt.Color(255, 255, 255));
        letter2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        letter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        letter2.setOpaque(true);

        letter3.setBackground(new java.awt.Color(255, 255, 255));
        letter3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        letter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        letter3.setOpaque(true);

        letter4.setBackground(new java.awt.Color(255, 255, 255));
        letter4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        letter4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        letter4.setOpaque(true);

        checkSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/download.png"))); // NOI18N

        javax.swing.GroupLayout fourLetPanelLayout = new javax.swing.GroupLayout(fourLetPanel);
        fourLetPanel.setLayout(fourLetPanelLayout);
        fourLetPanelLayout.setHorizontalGroup(
            fourLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fourLetPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fourLetPanelLayout.setVerticalGroup(
            fourLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fourLetPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fourLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(fourLetPanelLayout.createSequentialGroup()
                .addComponent(checkSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        quiz1.add(fourLetPanel);
        fourLetPanel.setBounds(240, 180, 270, 50);

        sixLetPanel.setOpaque(false);

        checkSymbol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/download.png"))); // NOI18N

        sixLet1.setBackground(new java.awt.Color(255, 255, 255));
        sixLet1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sixLet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixLet1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sixLet1.setOpaque(true);

        sixLet2.setBackground(new java.awt.Color(255, 255, 255));
        sixLet2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sixLet2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixLet2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sixLet2.setOpaque(true);

        sixLet3.setBackground(new java.awt.Color(255, 255, 255));
        sixLet3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sixLet3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixLet3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sixLet3.setOpaque(true);

        sixLet4.setBackground(new java.awt.Color(255, 255, 255));
        sixLet4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sixLet4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixLet4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sixLet4.setOpaque(true);

        sixLet5.setBackground(new java.awt.Color(255, 255, 255));
        sixLet5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sixLet5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixLet5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sixLet5.setOpaque(true);

        sixLet6.setBackground(new java.awt.Color(255, 255, 255));
        sixLet6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sixLet6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixLet6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sixLet6.setOpaque(true);

        javax.swing.GroupLayout sixLetPanelLayout = new javax.swing.GroupLayout(sixLetPanel);
        sixLetPanel.setLayout(sixLetPanelLayout);
        sixLetPanelLayout.setHorizontalGroup(
            sixLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sixLetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sixLet1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sixLet2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sixLet3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sixLet4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sixLet5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sixLet6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSymbol2)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        sixLetPanelLayout.setVerticalGroup(
            sixLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sixLetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sixLetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkSymbol2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixLet6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixLet5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixLet4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixLet3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixLet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixLet1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        quiz1.add(sixLetPanel);
        sixLetPanel.setBounds(200, 180, 370, 50);

        goToMain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goToMain.setText("Main Menu");
        goToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToMainActionPerformed(evt);
            }
        });
        quiz1.add(goToMain);
        goToMain.setBounds(230, 250, 120, 40);

        exitGame.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitGame.setText("Exit Game");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });
        quiz1.add(exitGame);
        exitGame.setBounds(380, 250, 120, 40);

        nextQuestion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nextQuestion.setText("Next Question");
        nextQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionActionPerformed(evt);
            }
        });
        quiz1.add(nextQuestion);
        nextQuestion.setBounds(290, 250, 160, 40);

        scientist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/scientist1.png"))); // NOI18N
        quiz1.add(scientist);
        scientist.setBounds(600, 120, 110, 240);

        scoreDisp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        scoreDisp.setForeground(new java.awt.Color(255, 255, 255));
        scoreDisp.setText("SCORE: "+ score);
        quiz1.add(scoreDisp);
        scoreDisp.setBounds(10, 10, 160, 30);

        firstWrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/wrong.png")));
        quiz1.add(firstWrong);
        firstWrong.setBounds(570, 10, 40, 40);

        secondWrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/wrong.png")));
        quiz1.add(secondWrong);
        secondWrong.setBounds(610, 10, 40, 40);

        thirdWrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/wrong.png")));
        quiz1.add(thirdWrong);
        thirdWrong.setBounds(650, 10, 40, 40);

        question1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        question1.setForeground(new java.awt.Color(255, 255, 255));
        quiz1.add(question1);
        question1.setBounds(90, 30, 530, 90);
        question1.setText("<html>" + quiz.getQuestions().get(val) + "</html>");
        question1.setHorizontalAlignment(JLabel.CENTER);

        namePrompt.setBackground(new java.awt.Color(51, 51, 51));
        namePrompt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        namePrompt.setForeground(new java.awt.Color(255, 255, 255));
        namePrompt.setText("Enter your name: ");
        namePrompt.setOpaque(true);
        quiz1.add(namePrompt);
        namePrompt.setBounds(170, 310, 130, 19);

        gameOver.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        gameOver.setForeground(new java.awt.Color(255, 255, 255));
        gameOver.setText("GAME OVER!");
        quiz1.add(gameOver);
        gameOver.setBounds(290, 130, 160, 32);

        saveHighScore.setText("OK");
        saveHighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHighScoreActionPerformed(evt);
            }
        });
        quiz1.add(saveHighScore);
        saveHighScore.setBounds(450, 300, 50, 32);

        playerName.setBackground(new java.awt.Color(255, 255, 255));
        quiz1.add(playerName);
        playerName.setBounds(310, 300, 130, 30);

        labBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/insideLab.jpg"))); // NOI18N
        labBG.setToolTipText("");
        labBG.add(question1);
        quiz1.add(labBG);
        labBG.setBounds(0, 0, 720, 450);

        gamePanel.add(quiz1, "card2");

        helpPanel.setMaximumSize(new java.awt.Dimension(720, 450));
        helpPanel.setMinimumSize(new java.awt.Dimension(720, 450));
        helpPanel.setPreferredSize(new java.awt.Dimension(720, 450));
        helpPanel.setLayout(null);

        goBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goBack.setText("Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });
        helpPanel.add(goBack);
        goBack.setBounds(320, 350, 77, 35);

        miniChar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/SteinsGate.png"))); // NOI18N
        helpPanel.add(miniChar);
        miniChar.setBounds(470, 290, 220, 127);

        helpBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/rules 2.jpg"))); // NOI18N
        helpBG.setOpaque(true);
        helpPanel.add(helpBG);
        helpBG.setBounds(0, 0, 720, 450);

        loadPanel.setPreferredSize(new java.awt.Dimension(720, 450));
        loadPanel.setLayout(null);

        frame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading1.png"))); // NOI18N
        frame1.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame1);
        frame1.setBounds(0, 0, 720, 450);

        frame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading2.png"))); // NOI18N
        frame2.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame2);
        frame2.setBounds(0, 0, 720, 450);

        frame3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading2a.png"))); // NOI18N
        frame3.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame3);
        frame3.setBounds(0, 0, 720, 450);

        frame4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading2c.png"))); // NOI18N
        frame4.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame4);
        frame4.setBounds(0, 0, 720, 450);

        frame5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading3.png"))); // NOI18N
        frame5.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame5);
        frame5.setBounds(0, 0, 720, 450);

        frame6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading3a.png"))); // NOI18N
        frame6.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame6);
        frame6.setBounds(0, 0, 720, 450);

        frame7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading3b.png"))); // NOI18N
        frame7.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame7);
        frame7.setBounds(0, 0, 720, 450);

        frame8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading3c.png"))); // NOI18N
        frame8.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame8);
        frame8.setBounds(0, 0, 720, 450);

        frame9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading4.png"))); // NOI18N
        frame9.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame9);
        frame9.setBounds(0, 0, 720, 450);

        frame10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading4a.png"))); // NOI18N
        frame10.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame10);
        frame10.setBounds(0, 0, 720, 450);

        frame11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading4b.png"))); // NOI18N
        frame11.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame11);
        frame11.setBounds(0, 0, 720, 450);

        frame12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading4c.png"))); // NOI18N
        frame12.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame12);
        frame12.setBounds(0, 0, 720, 450);

        frame13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading5.png"))); // NOI18N
        frame13.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame13);
        frame13.setBounds(0, 0, 720, 450);

        frame14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading5a.png"))); // NOI18N
        frame14.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame14);
        frame14.setBounds(0, 0, 720, 450);

        frame15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading5b.png"))); // NOI18N
        frame15.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame15);
        frame15.setBounds(0, 0, 720, 450);

        frame16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading5c.png"))); // NOI18N
        frame16.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame16);
        frame16.setBounds(0, 0, 720, 450);

        frame17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading6.png"))); // NOI18N
        frame17.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame17);
        frame17.setBounds(0, 0, 720, 450);

        frame18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading6a.png"))); // NOI18N
        frame18.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame18);
        frame18.setBounds(0, 0, 720, 450);

        frame19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading6b.png"))); // NOI18N
        frame19.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame19);
        frame19.setBounds(0, 0, 720, 450);

        frame20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading6c.png"))); // NOI18N
        frame20.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame20);
        frame20.setBounds(0, 0, 720, 450);

        frame21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading7.png"))); // NOI18N
        frame21.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame21);
        frame21.setBounds(0, 0, 720, 450);

        frame22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading7a.png"))); // NOI18N
        frame22.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame22);
        frame22.setBounds(0, 0, 720, 450);

        frame23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading7b.png"))); // NOI18N
        frame23.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame23);
        frame23.setBounds(0, 0, 720, 450);

        frame24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading7c.png"))); // NOI18N
        frame24.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame24);
        frame24.setBounds(0, 0, 720, 450);

        frame25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading8.png"))); // NOI18N
        frame25.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame25);
        frame25.setBounds(0, 0, 720, 450);

        frame26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading8a.png"))); // NOI18N
        frame26.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame26);
        frame26.setBounds(0, 0, 720, 450);

        frame27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading8b.png"))); // NOI18N
        frame27.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame27);
        frame27.setBounds(0, 0, 720, 450);

        frame28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading8c.png"))); // NOI18N
        frame28.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame28);
        frame28.setBounds(0, 0, 720, 450);

        frame29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading9.png"))); // NOI18N
        frame29.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame29);
        frame29.setBounds(0, 0, 720, 450);

        frame30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading9a.png"))); // NOI18N
        frame30.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame30);
        frame30.setBounds(0, 0, 720, 450);

        frame31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading9b.png"))); // NOI18N
        frame31.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame31);
        frame31.setBounds(0, 0, 720, 450);

        frame32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading9c.png"))); // NOI18N
        frame32.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame32);
        frame32.setBounds(0, 0, 720, 450);

        frame33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading10.png"))); // NOI18N
        frame33.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame33);
        frame33.setBounds(0, 0, 720, 450);

        frame34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading10a.png"))); // NOI18N
        frame34.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame34);
        frame34.setBounds(0, 0, 720, 450);

        frame35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading10b.png"))); // NOI18N
        frame35.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame35);
        frame35.setBounds(0, 0, 720, 450);

        frame36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading10c.png"))); // NOI18N
        frame36.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame36);
        frame36.setBounds(0, 0, 720, 450);

        frame37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading11.png"))); // NOI18N
        frame37.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame37);
        frame37.setBounds(0, 0, 720, 450);

        frame38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading11a.png"))); // NOI18N
        frame38.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame38);
        frame38.setBounds(0, 0, 720, 450);

        frame39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading11b.png"))); // NOI18N
        frame39.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame39);
        frame39.setBounds(0, 0, 720, 450);

        frame40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading11c.png"))); // NOI18N
        frame40.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame40);
        frame40.setBounds(0, 0, 720, 450);

        frame41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading12.png"))); // NOI18N
        frame41.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame41);
        frame41.setBounds(0, 0, 720, 450);

        frame42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading12a.png"))); // NOI18N
        frame42.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame42);
        frame42.setBounds(0, 0, 720, 450);

        frame43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading12b.png"))); // NOI18N
        frame43.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame43);
        frame43.setBounds(0, 0, 720, 450);

        frame44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading12c.png"))); // NOI18N
        frame44.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame44);
        frame44.setBounds(0, 0, 720, 450);

        frame45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading13.png"))); // NOI18N
        frame45.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame45);
        frame45.setBounds(0, 0, 720, 450);

        frame46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading13a.png"))); // NOI18N
        frame46.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame46);
        frame46.setBounds(0, 0, 720, 450);

        frame47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading13b.png"))); // NOI18N
        frame47.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame47);
        frame47.setBounds(0, 0, 720, 450);

        frame48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading13.png"))); // NOI18N
        frame48.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame48);
        frame48.setBounds(0, 0, 720, 450);

        frame49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading13.png"))); // NOI18N
        frame49.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame49);
        frame49.setBounds(0, 0, 720, 450);

        frame50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/Loading13.png"))); // NOI18N
        frame50.setPreferredSize(new java.awt.Dimension(720, 500));
        loadPanel.add(frame50);
        frame50.setBounds(0, 0, 720, 450);

        storyPanel.setMaximumSize(new java.awt.Dimension(720, 450));
        storyPanel.setMinimumSize(new java.awt.Dimension(720, 450));
        storyPanel.setPreferredSize(new java.awt.Dimension(720, 450));
        storyPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                storyPanelKeyPressed(evt);
            }
        });
        storyPanel.setLayout(null);

        skipStory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/video.png"))); // NOI18N
        skipStory.setBorderPainted(false);
        skipStory.setContentAreaFilled(false);
        skipStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipStoryActionPerformed(evt);
            }
        });
        storyPanel.add(skipStory);
        skipStory.setBounds(600, 370, 50, 50);

        scene1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b1.jpg"))); // NOI18N
        scene1.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene1);
        scene1.setBounds(0, 0, 720, 450);

        scene2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b2.jpg"))); // NOI18N
        scene2.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene2);
        scene2.setBounds(0, 0, 720, 450);

        scene3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b3.jpg"))); // NOI18N
        scene3.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene3);
        scene3.setBounds(0, 0, 720, 450);

        scene4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b4.jpg"))); // NOI18N
        scene4.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene4);
        scene4.setBounds(0, 0, 720, 450);

        scene5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b5.jpg"))); // NOI18N
        scene5.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene5);
        scene5.setBounds(0, 0, 720, 450);

        scene6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b6.jpg"))); // NOI18N
        scene6.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene6);
        scene6.setBounds(0, 0, 720, 450);

        scene7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b7.jpg"))); // NOI18N
        scene7.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene7);
        scene7.setBounds(0, 0, 720, 450);

        scene8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b8.jpg"))); // NOI18N
        scene8.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene8);
        scene8.setBounds(0, 0, 720, 450);

        scene9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmanbic/b9.jpg"))); // NOI18N
        scene9.setPreferredSize(new java.awt.Dimension(720, 500));
        storyPanel.add(scene9);
        scene9.setBounds(0, 0, 720, 450);

        highScorePanel.setPreferredSize(new java.awt.Dimension(720, 450));
        highScorePanel.setLayout(null);

        goBack2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goBack2.setText("Back");
        goBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBack2ActionPerformed(evt);
            }
        });
        highScorePanel.add(goBack2);
        goBack2.setBounds(340, 360, 77, 32);

        scrollPane1.setPreferredSize(new java.awt.Dimension(720, 450));

        highScoreList.setColumns(20);
        highScoreList.setRows(5);
        scrollPane1.setViewportView(highScoreList);

        highScorePanel.add(scrollPane1);
        scrollPane1.setBounds(0, 0, 720, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(storyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(helpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(highScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(storyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(helpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(highScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        score = 0;
        skipVar = 0;
        sceneOrder = 0;
        storyPanel.setVisible(false);
        gamePanel.setVisible(false);
        highScorePanel.setVisible(false);
        titlePanel.setVisible(false);
        fourLetPanel.setVisible(false);
        sixLetPanel.setVisible(false);
        fiveLetPanel.setVisible(false);
        saveHighScore.setEnabled(true);
        val = quiz.getNum(index);
        panelSwitch();
        question1.setText("<html>" + quiz.getQuestions().get(val) + "</html>");
        hidePic();
        guessedLetters = "";
        answer = '\0';
        wrongCounter = 0;
        resetLetters();
        turnOnBtn();
        scientist.setIcon(new ImageIcon(getClass().getResource("/hangmanbic/scientist1.png")));
        
        loadInterface();
        
        InputStream music;
        ClassLoader cl = getClass().getClassLoader();
        try{
            music = getClass().getResourceAsStream("experiment.wav");
            audios2 = new AudioStream(music);
            //ad = audios2.getData();
            //loop = new ContinuousAudioDataStream (ad);
            AudioPlayer.player.stop(audios);
            AudioPlayer.player.start(audios2);
        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getLocalizedMessage());}       
            
    }//GEN-LAST:event_playButtonActionPerformed

    private void letterCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterCActionPerformed
        if(val == 0){
            answer = 'c';
            letter3.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 3){
            answer = 'c';
            letter4.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 7){
            answer = 'c';
            letter2.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 13){
            answer = 'c';
            sixLet1.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 15){
            answer = 'c';
            sixLet3.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 20){
            answer = 'c';
            sixLet1.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 22){
            answer = 'c';
            sixLet1.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 23){
            answer = 'c';
            sixLet1.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 28){
            answer = 'c';
            sixLet1.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 49){
            answer = 'c';
            fiveLet5.setText("C");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterC.setEnabled(false);
    }//GEN-LAST:event_letterCActionPerformed

    private void letterDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterDActionPerformed
        if(val == 1){
            answer = 'd';
            letter4.setText("D");
            guessedLetters += answer;
            gameOver();
        }     
        else if(val == 4){
            answer = 'd';
            letter4.setText("D");
            guessedLetters += answer;
            gameOver();
        }     
        else if(val == 7){
            answer = 'd';
            letter4.setText("D");
            guessedLetters += answer;
            gameOver();
        }     
        else if(val == 11){
            answer = 'd';
            letter4.setText("D");
            guessedLetters += answer;
            gameOver();
        }   
        else if(val == 14){
            answer = 'd';
            sixLet3.setText("D");
            guessedLetters += answer;
            gameOver();
        }   
        else if(val == 24){
            answer = 'd';
            sixLet3.setText("D");
            guessedLetters += answer;
            gameOver();
        }   
        else if(val == 27){
            answer = 'd';
            sixLet3.setText("D");
            guessedLetters += answer;
            gameOver();
        }   
        else if(val == 33){
            answer = 'd';
            sixLet6.setText("D");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 41){
            answer = 'd';
            sixLet1.setText("D");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 44){
            answer = 'd';
            fiveLet3.setText("D");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 47){
            answer = 'd';
            fiveLet5.setText("D");
            guessedLetters += answer;
            gameOver();
        }  
        else{
            wrongCounter++;
            gameOver();
        }
        letterD.setEnabled(false);
    }//GEN-LAST:event_letterDActionPerformed

    private void letterAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterAActionPerformed
        if(val == 0){
            answer = 'a';
            letter2.setText("a");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 4){
            answer = 'a';
            letter3.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 6){
            answer = 'a';
            letter1.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 7){
            answer = 'a';
            letter1.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 8){
            answer = 'a';
            letter2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 10){
            answer = 'a';
            letter2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 12){
            answer = 'a';
            letter3.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 20){
            answer = 'a';
            sixLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 21){
            answer = 'a';
            sixLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 22){
            answer = 'a';
            sixLet4.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 24){
            answer = 'a';
            sixLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 25){
            answer = 'a';
            sixLet1.setText("A");
            sixLet4.setText("A");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 27){
            answer = 'a';
            sixLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 28){
            answer = 'a';
            sixLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 35){
            answer = 'a';
            sixLet3.setText("A");
            sixLet6.setText("A");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 37){
            answer = 'a';
            sixLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 42){
            answer = 'a';
            fiveLet1.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 44){
            answer = 'a';
            fiveLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 48){
            answer = 'a';
            fiveLet4.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 50){
            answer = 'a';
            fiveLet1.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 51){
            answer = 'a';
            fiveLet4.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 53){
            answer = 'a';
            fiveLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 54){
            answer = 'a';
            fiveLet2.setText("A");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterA.setEnabled(false);
    }//GEN-LAST:event_letterAActionPerformed

    private void letterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterBActionPerformed
        if(val == 8){
            answer = 'b';
            letter1.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 9){
            answer = 'b';
            letter1.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 11){
            answer = 'b';
            letter1.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 20){
            answer = 'b';
            sixLet4.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 21){
            answer = 'b';
            sixLet1.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 22){
            answer = 'b';
            sixLet3.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 26){
            answer = 'b';
            sixLet4.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 41){
            answer = 'b';
            sixLet4.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 43){
            answer = 'b';
            fiveLet1.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 52){
            answer = 'b';
            fiveLet3.setText("B");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();   
        }
        
        letterB.setEnabled(false);
    }//GEN-LAST:event_letterBActionPerformed

    private void letterEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterEActionPerformed
        if(val == 4){
            answer = 'e';
            letter2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 5){
            answer = 'e';
            letter2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 8){
            answer = 'e';
            letter4.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 12){
            answer = 'e';
            letter2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 13){
            answer = 'e';
            sixLet5.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 14){
            answer = 'e';
            sixLet6.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 15){
            answer = 'e';
            sixLet5.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 16){
            answer = 'e';
            sixLet5.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 17){
            answer = 'e';
            sixLet2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 18){
            answer = 'e';
            sixLet5.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 23){
            answer = 'e';
            sixLet2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 26){
            answer = 'e';
            sixLet5.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 30){
            answer = 'e';
            sixLet1.setText("E");
            sixLet3.setText("E");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 31){
            answer = 'e';
            sixLet6.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 32){
            answer = 'e';
            sixLet2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 36){
            answer = 'e';
            sixLet6.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 37){
            answer = 'e';
            sixLet6.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 38){
            answer = 'e';
            sixLet6.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 39){
            answer = 'e';
            sixLet3.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 40){
            answer = 'e';
            sixLet6.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 41){
            answer = 'e';
            sixLet6.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 45){
            answer = 'e';
            fiveLet2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 46){
            answer = 'e';
            fiveLet2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 48){
            answer = 'e';
            fiveLet2.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 52){
            answer = 'e';
            fiveLet5.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 54){
            answer = 'e';
            fiveLet4.setText("E");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterE.setEnabled(false);
    }//GEN-LAST:event_letterEActionPerformed

    private void letterFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterFActionPerformed
        if(val == 19){
            answer = 'f';
            sixLet4.setText("F");
            guessedLetters += answer;
            gameOver();    
        }
        else{
            wrongCounter++;
            gameOver();
        }      
        letterF.setEnabled(false);
    }//GEN-LAST:event_letterFActionPerformed

    private void letterGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterGActionPerformed
        if(val == 1){
            answer = 'g';
            letter1.setText("G");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 16){
            answer = 'g';
            sixLet4.setText("G");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 29){
            answer = 'g';
            sixLet6.setText("G");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 30){
            answer = 'g';
            sixLet5.setText("G");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 38){
            answer = 'g';
            sixLet4.setText("G");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 42){
            answer = 'g';
            fiveLet3.setText("G");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterG.setEnabled(false);
    }//GEN-LAST:event_letterGActionPerformed

    private void letterHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterHActionPerformed
        if(val == 9){
            answer = 'h';
            letter3.setText("H");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 12){
            answer = 'h';
            letter1.setText("H");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 17){
            answer = 'h';
            sixLet1.setText("H");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 39){
            answer = 'h';
            sixLet2.setText("H");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }     
        letterH.setEnabled(false);
    }//GEN-LAST:event_letterHActionPerformed

    private void letterIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterIActionPerformed
        if(val == 2){
            answer = 'i';
            letter1.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 3){
            answer = 'i';
            letter2.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 7){
            answer = 'i';
            letter3.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 14){
            answer = 'i';
            sixLet1.setText("I");
            sixLet4.setText("I");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 15){
            answer = 'i';
            sixLet2.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 17){
            answer = 'i';
            sixLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 18){
            answer = 'i';
            sixLet2.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 21){
            answer = 'i';
            sixLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 23){
            answer = 'i';
            sixLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 24){
            answer = 'i';
            sixLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 25){
            answer = 'i';
            sixLet6.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 27){
            answer = 'i';
            sixLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 28){
            answer = 'i';
            sixLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 32){
            answer = 'i';
            sixLet5.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 33){
            answer = 'i';
            sixLet2.setText("I");
            sixLet5.setText("I");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 37){
            answer = 'i';
            sixLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 38){
            answer = 'i';
            sixLet2.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 40){
            answer = 'i';
            sixLet3.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 46){
            answer = 'i';
            fiveLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 47){
            answer = 'i';
            fiveLet4.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 49){
            answer = 'i';
            fiveLet1.setText("I");
            fiveLet4.setText("I");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 50){
            answer = 'i';
            fiveLet3.setText("I");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterI.setEnabled(false);
    }//GEN-LAST:event_letterIActionPerformed

    private void letterJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterJActionPerformed
        if(val == 55){
            answer = 'j';
            fiveLet1.setText("J");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterJ.setEnabled(false);
    }//GEN-LAST:event_letterJActionPerformed

    private void letterKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterKActionPerformed
        if(val == 15){
            answer = 'k';
            sixLet4.setText("K");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 25){
            answer = 'k';
            sixLet3.setText("K");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 32){
            answer = 'k';
            sixLet1.setText("K");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterK.setEnabled(false);
    }//GEN-LAST:event_letterKActionPerformed

    private void letterLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterLActionPerformed
        if(val == 0){
            answer = 'l';
            letter4.setText("l");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 1){
            answer = 'l';
            letter3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 4){
            answer = 'l';
            letter1.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 15){
            answer = 'l';
            sixLet6.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 17){
            answer = 'l';
            sixLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 18){
            answer = 'l';
            sixLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 19){
            answer = 'l';
            sixLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 22){
            answer = 'l';
            sixLet5.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 25){
            answer = 'l';
            sixLet2.setText("L");
            sixLet5.setText("L");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 31){
            answer = 'l';
            sixLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 32){
            answer = 'l';
            sixLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 33){
            answer = 'l';
            sixLet1.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 35){
            answer = 'l';
            sixLet2.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 36){
            answer = 'l';
            sixLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 37){
            answer = 'l';
            sixLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 38){
            answer = 'l';
            sixLet5.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 40){
            answer = 'l';
            sixLet5.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 41){
            answer = 'l';
            sixLet5.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 46){
            answer = 'l';
            fiveLet1.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 47){
            answer = 'l';
            fiveLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 48){
            answer = 'l';
            fiveLet5.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 51){
            answer = 'l';
            fiveLet3.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 52){
            answer = 'l';
            fiveLet4.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 55){
            answer = 'l';
            fiveLet4.setText("L");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterL.setEnabled(false);
    }//GEN-LAST:event_letterLActionPerformed

    private void letterMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterMActionPerformed
        if(val ==6){
            answer = 'm';
            letter4.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 10){
            answer = 'm';
            letter1.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 17){
            answer = 'm';
            sixLet6.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 21){
            answer = 'm';
            sixLet6.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 23){
            answer = 'm';
            sixLet6.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 24){
            answer = 'm';
            sixLet6.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 26){
            answer = 'm';
            sixLet3.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 31){
            answer = 'm';
            sixLet5.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 35){
            answer = 'm';
            sixLet5.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 48){
            answer = 'm';
            fiveLet1.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 51){
            answer = 'm';
            fiveLet1.setText("M");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterM.setEnabled(false);
    }//GEN-LAST:event_letterMActionPerformed

    private void letterNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterNActionPerformed
        if(val == 0){
            answer = 'n';
            letter1.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 2){
            answer = 'n';
            letter4.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 3){
            answer = 'n';
            letter3.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 5){
            answer = 'n';
            letter1.setText("N");
            letter4.setText("N");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 11){
            answer = 'n';
            letter3.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 14){
            answer = 'n';
            sixLet5.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 15){
            answer = 'n';
            sixLet1.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 16){
            answer = 'n';
            sixLet6.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 20){
            answer = 'n';
            sixLet6.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 26){
            answer = 'n';
            sixLet1.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 28){
            answer = 'n';
            sixLet6.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 29){
            answer = 'n';
            sixLet5.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 30){
            answer = 'n';
            sixLet2.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 32){
            answer = 'n';
            sixLet6.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 34){
            answer = 'n';
            sixLet6.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 37){
            answer = 'n';
            sixLet5.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 38){
            answer = 'n';
            sixLet3.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 42){
            answer = 'n';
            fiveLet5.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 43){
            answer = 'n';
            fiveLet5.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 44){
            answer = 'n';
            fiveLet5.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 45){
            answer = 'n';
            fiveLet3.setText("N");
            fiveLet5.setText("N");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 49){
            answer = 'n';
            fiveLet3.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 50){
            answer = 'n';
            fiveLet2.setText("N");
            fiveLet5.setText("N");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 52){
            answer = 'n';
            fiveLet1.setText("N");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterN.setEnabled(false);
    }//GEN-LAST:event_letterNActionPerformed

    private void letterOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterOActionPerformed
        if(val == 1){
            answer = 'o';
            letter2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 2){
            answer = 'o';
            letter3.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 5){
            answer = 'o';
            letter3.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 6){
            answer = 'o';
            letter3.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 9){
            answer = 'o';
            letter2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 11){
            answer = 'o';
            letter2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 13){
            answer = 'o';
            sixLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 14){
            answer = 'o';
            sixLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 16){
            answer = 'o';
            sixLet1.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 20){
            answer = 'o';
            sixLet5.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 22){
            answer = 'o';
            sixLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 28){
            answer = 'o';
            sixLet5.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 29){
            answer = 'o';
            sixLet4.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 31){
            answer = 'o';
            sixLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 34){
            answer = 'o';
            sixLet3.setText("O");
            sixLet5.setText("O");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 36){
            answer = 'o';
            sixLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 39){
            answer = 'o';
            sixLet4.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 41){
            answer = 'o';
            sixLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 42){
            answer = 'o';
            fiveLet4.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 43){
            answer = 'o';
            fiveLet2.setText("O");
            fiveLet4.setText("O");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 44){
            answer = 'o';
            fiveLet4.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 45){
            answer = 'o';
            fiveLet4.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 47){
            answer = 'o';
            fiveLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 49){
            answer = 'o';
            fiveLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 50){
            answer = 'o';
            fiveLet4.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 51){
            answer = 'o';
            fiveLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 52){
            answer = 'o';
            fiveLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 53){
            answer = 'o';
            fiveLet4.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 55){
            answer = 'o';
            fiveLet2.setText("O");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterO.setEnabled(false);
    }//GEN-LAST:event_letterOActionPerformed

    private void letterPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterPActionPerformed
        if(val == 13){
            answer = 'p';
            sixLet3.setText("P");
            sixLet4.setText("P");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 34){
            answer = 'p';
            sixLet1.setText("P");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 35){
            answer = 'p';
            sixLet1.setText("P");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 40){
            answer = 'p';
            sixLet4.setText("P");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 53){
            answer = 'p';
            fiveLet3.setText("P");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterP.setEnabled(false);
    }//GEN-LAST:event_letterPActionPerformed

    private void letterQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterQActionPerformed
        if(val == 33){
            answer = 'q';
            sixLet3.setText("Q");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }     
        letterQ.setEnabled(false);
    }//GEN-LAST:event_letterQActionPerformed

    private void letterRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterRActionPerformed
        if(val == 2){
            answer = 'r';
            letter2.setText("R");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 9){
            answer = 'r';
            letter4.setText("R");
            guessedLetters += answer;
            gameOver();
        }      
        else if(val == 13){
            answer = 'r';
            sixLet6.setText("R");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 18){
            answer = 'r';
            sixLet6.setText("R");
            guessedLetters += answer;
            gameOver();
        }      
        else if(val == 19){
            answer = 'r';
            sixLet6.setText("R");
            guessedLetters += answer;
            gameOver();
        }      
        else if(val == 20){
            answer = 'r';
            sixLet3.setText("R");
            guessedLetters += answer;
            gameOver();
        }    
        else if(val == 21){
            answer = 'r';
            sixLet3.setText("R");
            guessedLetters += answer;
            gameOver();
        }    
        else if(val == 24){
            answer = 'r';
            sixLet1.setText("R");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 26){
            answer = 'r';
            sixLet6.setText("R");
            guessedLetters += answer;
            gameOver();
        }   
        else if(val == 27){
            answer = 'r';
            sixLet1.setText("R");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 29){
            answer = 'r';
            sixLet3.setText("R");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 30){
            answer = 'r';
            sixLet4.setText("R");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 34){
            answer = 'r';
            sixLet2.setText("R");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 39){
            answer = 'r';
            sixLet5.setText("R");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 40){
            answer = 'r';
            sixLet2.setText("R");
            guessedLetters += answer;
            gameOver();
        }  
        else if(val == 42){
            answer = 'r';
            fiveLet2.setText("R");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 43){
            answer = 'r';
            fiveLet3.setText("R");
            guessedLetters += answer;
            gameOver();    
        }  
        else if(val == 44){
            answer = 'r';
            fiveLet1.setText("R");
            guessedLetters += answer;
            gameOver();    
        }  
        else if(val == 51){
            answer = 'r';
            fiveLet5.setText("R");
            guessedLetters += answer;
            gameOver();    
        }  
        else if(val == 53){
            answer = 'r';
            fiveLet5.setText("R");
            guessedLetters += answer;
            gameOver();    
        }  
        else if(val == 54){
            answer = 'r';
            fiveLet5.setText("R");
            guessedLetters += answer;
            gameOver();    
        }  
        else{
            wrongCounter++;
            gameOver();
        }
        letterR.setEnabled(false);
    }//GEN-LAST:event_letterRActionPerformed

    private void letterSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterSActionPerformed
        if(val == 8){
            answer = 's';
            letter3.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 10){
            answer = 's';
            letter3.setText("S");
            letter4.setText("S");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 18){
            answer = 's';
            sixLet1.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 19){
            answer = 's';
            sixLet1.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 23){
            answer = 's';
            sixLet3.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 27){
            answer = 's';
            sixLet6.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 29){
            answer = 's';
            sixLet1.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 35){
            answer = 's';
            sixLet4.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 36){
            answer = 's';
            sixLet1.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 37){
            answer = 's';
            sixLet1.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 38){
            answer = 's';
            sixLet1.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 46){
            answer = 's';
            fiveLet5.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 47){
            answer = 's';
            fiveLet1.setText("S");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }
        letterS.setEnabled(false);
    }//GEN-LAST:event_letterSActionPerformed

    private void letterTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterTActionPerformed
        if(val == 6){
            answer = 't';
            letter2.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 12){
            answer = 't';
            letter4.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 22){
            answer = 't';
            sixLet6.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 28){
            answer = 't';
            sixLet3.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 29){
            answer = 't';
            sixLet2.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 34){
            answer = 't';
            sixLet4.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 36){
            answer = 't';
            sixLet5.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 39){
            answer = 't';
            sixLet1.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 40){
            answer = 't';
            sixLet1.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 48){
            answer = 't';
            fiveLet3.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 54){
            answer = 't';
            fiveLet3.setText("T");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();   
        }
        letterT.setEnabled(false);
    }//GEN-LAST:event_letterTActionPerformed

    private void letterUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterUActionPerformed
        if(val == 17){
            answer = 'u';
            sixLet5.setText("U");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 19){
            answer = 'u';
            sixLet2.setText("U");
            sixLet5.setText("U");
            guessedLetters += answer;
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 21){
            answer = 'u';          
            sixLet5.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 23){
            answer = 'u';          
            sixLet5.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 24){
            answer = 'u';          
            sixLet5.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 26){
            answer = 'u';          
            sixLet2.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 27){
            answer = 'u';          
            sixLet5.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 31){
            answer = 'u';          
            sixLet4.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 33){
            answer = 'u';          
            sixLet4.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 36){
            answer = 'u';          
            sixLet4.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 41){
            answer = 'u';          
            sixLet3.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 55){
            answer = 'u';          
            fiveLet3.setText("U");          
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }   
        letterU.setEnabled(false);
    }//GEN-LAST:event_letterUActionPerformed

    private void letterVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterVActionPerformed
        if(val == 18){
            answer = 'v';
            sixLet4.setText("V");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 31){
            answer = 'v';
            sixLet1.setText("V");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 32){
            answer = 'v';
            sixLet4.setText("V");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 53){
            answer = 'v';
            fiveLet1.setText("V");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }      
        letterV.setEnabled(false);
    }//GEN-LAST:event_letterVActionPerformed

    private void letterWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterWActionPerformed
        if(val == 46){
            answer = 'w';
            fiveLet3.setText("W");
            guessedLetters += answer;
            gameOver();      
        }
        else if(val == 54){
            answer = 'w';
            fiveLet1.setText("W");
            guessedLetters += answer;
            gameOver();      
        }
        else{
            wrongCounter++;
            gameOver();
        }  
        letterW.setEnabled(false);
    }//GEN-LAST:event_letterWActionPerformed

    private void letterXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterXActionPerformed
        if(val == 16){
            answer = 'x';
            sixLet2.setText("X");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 45){
            answer = 'x';
            fiveLet1.setText("X");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        }    
        letterX.setEnabled(false);
    }//GEN-LAST:event_letterXActionPerformed

    private void letterYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterYActionPerformed
        if(val == 16){
            answer = 'y';
            sixLet3.setText("Y");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 30){
            answer = 'y';
            sixLet6.setText("Y");
            guessedLetters += answer;
            gameOver();
        }
        else if(val == 39){
            answer = 'y';
            sixLet6.setText("Y");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver();
        } 
        letterY.setEnabled(false);
    }//GEN-LAST:event_letterYActionPerformed

    private void letterZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterZActionPerformed
        if(val == 3){
            answer = 'z';
            letter1.setText("Z");
            guessedLetters += answer;
            gameOver();
        }
        else{
            wrongCounter++;
            gameOver(); 
        }
        letterZ.setEnabled(false);
    }//GEN-LAST:event_letterZActionPerformed

    private void nextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionActionPerformed
        index++;
        endGameCounter++;
        val = quiz.getNum(index);
        fourLetPanel.setVisible(false);
        sixLetPanel.setVisible(false);
        fiveLetPanel.setVisible(false);
        panelSwitch();
        hidePic();
        resetLetters();
        guessedLetters = "";
        wrongCounter = 0;
        question1.setText("<html>" + quiz.getQuestions().get(val) + "</html>");
        turnOnBtn();
        scientist.setIcon(new ImageIcon(getClass().getResource("/hangmanbic/scientist1.png")));
    }//GEN-LAST:event_nextQuestionActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fm.readFile();
        InputStream music;
        try{
            music = getClass().getResourceAsStream("laboratory.wav"); 
            audios = new AudioStream(music);        
            AudioPlayer.player.start(audios);
        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getLocalizedMessage());} 
        quiz.randomizeQuiz();
    }//GEN-LAST:event_formWindowOpened

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitGameActionPerformed

    private void goToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToMainActionPerformed
        quiz.randomizeQuiz();
        index = 0;
        gamePanel.setVisible(false);
        titlePanel.setVisible(true);
        InputStream music;
        try{
            music = getClass().getResourceAsStream("laboratory.wav"); 
            audios = new AudioStream(music);
            AudioPlayer.player.stop(audios2);
            AudioPlayer.player.start(audios);
        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getLocalizedMessage());}       
    }//GEN-LAST:event_goToMainActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        titlePanel.setVisible(false);
        loadPanel.setVisible(false);
        storyPanel.setVisible(false);
        helpPanel.setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed

    private void storyPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_storyPanelKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        sceneOrder++;
    }//GEN-LAST:event_storyPanelKeyPressed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        helpPanel.setVisible(false);
        titlePanel.setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void skipStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipStoryActionPerformed
        skipVar = 1;
    }//GEN-LAST:event_skipStoryActionPerformed

    private void saveHighScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHighScoreActionPerformed
        hsm.addNames(playerName.getText());
        hsm.addScore(score);
        fm.writeToFile(quiz, hsm);
        saveHighScore.setEnabled(false);
    }//GEN-LAST:event_saveHighScoreActionPerformed

    private void highScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoreActionPerformed
        hsm.sortScores();
        highScoreList.setText(hsm.displayHighScore());
        titlePanel.setVisible(false);
        loadPanel.setVisible(false);
        storyPanel.setVisible(false);
        highScorePanel.setVisible(true);
    }//GEN-LAST:event_highScoreActionPerformed

    private void goBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBack2ActionPerformed
        highScorePanel.setVisible(false);
        titlePanel.setVisible(true);
    }//GEN-LAST:event_goBack2ActionPerformed

    private void gameOver(){   //Continue here     
        if(correctAnswer()){
            if(val >= 0 && val <= 12)
                score += 100;
            else if(val >= 13 && val <= 41)
                score += 150;
            else if(val > 41)
                score += 125;
            scoreDisp.setText("SCORE: " + score);
            checkSymbol.setVisible(true);
            checkSymbol2.setVisible(true);
            checkSymbol3.setVisible(true);
            nextQuestion.setVisible(true);
        }          
        else if(wrongCounter == 3 || endGameCounter == 55){
            thirdWrong.setVisible(true);
            turnOffBtn();
            gameOver.setVisible(true);
            namePrompt.setVisible(true);
            playerName.setVisible(true);
            saveHighScore.setVisible(true);
            goToMain.setVisible(true);
            exitGame.setVisible(true);
            scientist.setIcon(new ImageIcon(getClass().getResource("/hangmanbic/scientist4.png")));
        }
        else if(wrongCounter == 1){
            firstWrong.setVisible(true);
            scientist.setIcon(new ImageIcon(getClass().getResource("/hangmanbic/scientist2.png")));
            
        }
            
        else if(wrongCounter == 2){
            secondWrong.setVisible(true);
            scientist.setIcon(new ImageIcon(getClass().getResource("/hangmanbic/scientist3.png")));
            
        }        
    }
    
    private boolean correctAnswer(){
        String str = quiz.getAnswers().get(val);
        return sameChars(str, guessedLetters);
    }
    
    private boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
    
    private void hideFrames(){
        frame1.setVisible(false);
        frame2.setVisible(false);
        frame3.setVisible(false);
        frame4.setVisible(false);
        frame5.setVisible(false);
        
        frame6.setVisible(false);
        frame7.setVisible(false);
        frame8.setVisible(false);
        frame9.setVisible(false);
        frame10.setVisible(false);
        
        frame11.setVisible(false);
        frame12.setVisible(false);
        frame13.setVisible(false);
        frame14.setVisible(false);
        frame15.setVisible(false);
        
        frame16.setVisible(false);
        frame17.setVisible(false);
        frame18.setVisible(false);
        frame19.setVisible(false);
        frame20.setVisible(false);
        
        frame21.setVisible(false);
        frame22.setVisible(false);
        frame23.setVisible(false);
        frame24.setVisible(false);
        frame25.setVisible(false);
        
        frame26.setVisible(false);
        frame27.setVisible(false);
        frame28.setVisible(false);
        frame29.setVisible(false);
        frame30.setVisible(false);
        
        frame31.setVisible(false);
        frame32.setVisible(false);
        frame33.setVisible(false);
        frame34.setVisible(false);
        frame35.setVisible(false);
        
        frame36.setVisible(false);
        frame37.setVisible(false);
        frame38.setVisible(false);
        frame39.setVisible(false);
        frame40.setVisible(false);
        
        frame41.setVisible(false);
        frame42.setVisible(false);
        frame43.setVisible(false);
        frame44.setVisible(false);
        frame45.setVisible(false);
        
        frame46.setVisible(false);
        frame47.setVisible(false);
        frame48.setVisible(false);
        frame49.setVisible(false);
        
    }
    
    private void displayFrame1(){
        hideFrames();
        frame1.setVisible(true);
    }   
    private void displayFrame2(){
        hideFrames();
        frame2.setVisible(true);
    }    
    private void displayFrame3(){
        hideFrames();
        frame3.setVisible(true);
    }   
    private void displayFrame4(){
        hideFrames();
        frame4.setVisible(true);
    }
    private void displayFrame5(){
        hideFrames();
        frame5.setVisible(true);
    }
    
    private void displayFrame6(){
        hideFrames();
        frame6.setVisible(true);
    }
    private void displayFrame7(){
        hideFrames();
        frame7.setVisible(true);
    }
    private void displayFrame8(){
        hideFrames();
        frame8.setVisible(true);
    }
    private void displayFrame9(){
        hideFrames();
        frame9.setVisible(true);
    }
    private void displayFrame10(){
        hideFrames();
        frame10.setVisible(true);
    }
    
    private void displayFrame11(){
        hideFrames();
        frame11.setVisible(true);
    }
    private void displayFrame12(){
        hideFrames();
        frame12.setVisible(true);
    }
    private void displayFrame13(){
        hideFrames();
        frame13.setVisible(true);
    }
    private void displayFrame14(){
        hideFrames();
        frame14.setVisible(true);
    }
    private void displayFrame15(){
        hideFrames();
        frame15.setVisible(true);
    }
    
    private void displayFrame16(){
        hideFrames();
        frame16.setVisible(true);
    }
    private void displayFrame17(){
        hideFrames();
        frame17.setVisible(true);
    }
    private void displayFrame18(){
        hideFrames();
        frame18.setVisible(true);
    }
    private void displayFrame19(){
        hideFrames();
        frame19.setVisible(true);
    }
    private void displayFrame20(){
        hideFrames();
        frame20.setVisible(true);
    }
    
    private void displayFrame21(){
        hideFrames();
        frame21.setVisible(true);
    }
    private void displayFrame22(){
        hideFrames();
        frame22.setVisible(true);
    }
    private void displayFrame23(){
        hideFrames();
        frame23.setVisible(true);
    }
    private void displayFrame24(){
        hideFrames();
        frame24.setVisible(true);
    }
    private void displayFrame25(){
        hideFrames();
        frame25.setVisible(true);
    }
    
    private void displayFrame26(){
        hideFrames();
        frame26.setVisible(true);
    }
    private void displayFrame27(){
        hideFrames();
        frame27.setVisible(true);
    }
    private void displayFrame28(){
        hideFrames();
        frame28.setVisible(true);
    }
    private void displayFrame29(){
        hideFrames();
        frame29.setVisible(true);
    }
    private void displayFrame30(){
        hideFrames();
        frame30.setVisible(true);
    }
    
    private void displayFrame31(){
        hideFrames();
        frame31.setVisible(true);
    }
    private void displayFrame32(){
        hideFrames();
        frame32.setVisible(true);
    }
    private void displayFrame33(){
        hideFrames();
        frame33.setVisible(true);
    }
    private void displayFrame34(){
        hideFrames();
        frame34.setVisible(true);
    }
    private void displayFrame35(){
        hideFrames();
        frame35.setVisible(true);
    }
    
    private void displayFrame36(){
        hideFrames();
        frame36.setVisible(true);
    }
    private void displayFrame37(){
        hideFrames();
        frame37.setVisible(true);
    }
    private void displayFrame38(){
        hideFrames();
        frame38.setVisible(true);
    }
    private void displayFrame39(){
        hideFrames();
        frame39.setVisible(true);
    }
    private void displayFrame40(){
        hideFrames();
        frame40.setVisible(true);
    }
    
    private void displayFrame41(){
        hideFrames();
        frame41.setVisible(true);
    }
    private void displayFrame42(){
        hideFrames();
        frame42.setVisible(true);
    }
    private void displayFrame43(){
        hideFrames();
        frame43.setVisible(true);
    }
    private void displayFrame44(){
        hideFrames();
        frame44.setVisible(true);
    }
    private void displayFrame45(){
        hideFrames();
        frame45.setVisible(true);
    }
    
    private void displayFrame46(){
        hideFrames();
        frame46.setVisible(true);
    }
    private void displayFrame47(){
        hideFrames();
        frame47.setVisible(true);
    }
    private void displayFrame48(){
        hideFrames();
        frame48.setVisible(true);
    }
    private void displayFrame49(){
        hideFrames();
        frame49.setVisible(true);
    }
    
    private void loadInterface(){
        loadPanel.setVisible(true);
        Timer timer = new Timer();
       
        TimerTask task = new TimerTask() {
           
         int secondsToWait = 49;    
            public void run() {  
            secondsToWait -= 1;
            if(secondsToWait == 49)
                displayFrame1();
            else if(secondsToWait == 48)
                displayFrame2();
            else if(secondsToWait == 47)
                displayFrame3();
            else if(secondsToWait == 46)
                displayFrame4();
            else if(secondsToWait == 45)
                displayFrame5();
            else if(secondsToWait == 44)
                displayFrame6();
            else if(secondsToWait == 43)
                displayFrame7();
            else if(secondsToWait == 42)
                displayFrame8();
            else if(secondsToWait == 41)
                displayFrame9();
            else if(secondsToWait == 40)
                displayFrame10();
            
            else if(secondsToWait == 39)
                displayFrame11();
            else if(secondsToWait == 38)
                displayFrame12();
            else if(secondsToWait == 37)
                displayFrame13();
            else if(secondsToWait == 36)
                displayFrame14();
            else if(secondsToWait == 35)
                displayFrame15();
            else if(secondsToWait == 34)
                displayFrame16();
            else if(secondsToWait == 33)
                displayFrame17();
            else if(secondsToWait == 32)
                displayFrame18();
            else if(secondsToWait == 31)
                displayFrame19();
            else if(secondsToWait == 30)
                displayFrame20();
            
            else if(secondsToWait == 29)
                displayFrame21();
            else if(secondsToWait == 28)
                displayFrame22();
            else if(secondsToWait == 27)
                displayFrame23();
            else if(secondsToWait == 26)
                displayFrame24();
            else if(secondsToWait == 25)
                displayFrame25();
            else if(secondsToWait == 24)
                displayFrame26();
            else if(secondsToWait == 23)
                displayFrame27();
            else if(secondsToWait == 22)
                displayFrame28();
            else if(secondsToWait == 21)
                displayFrame29();
            else if(secondsToWait == 20)
                displayFrame30();
            
            else if(secondsToWait == 19)
                displayFrame31();
            else if(secondsToWait == 18)
                displayFrame32();
            else if(secondsToWait == 17)
                displayFrame33();
            else if(secondsToWait == 16)
                displayFrame34();
            else if(secondsToWait == 15)
                displayFrame35();
            else if(secondsToWait == 14)
                displayFrame36();
            else if(secondsToWait == 13)
                displayFrame37();
            else if(secondsToWait == 12)
                displayFrame38();
            else if(secondsToWait == 11)
                displayFrame39();
            else if(secondsToWait == 10)
                displayFrame40();
            
            else if(secondsToWait == 9)
                displayFrame41();
            else if(secondsToWait == 8)
                displayFrame42();
            else if(secondsToWait == 7)
                displayFrame43();
            else if(secondsToWait == 6)
                displayFrame44();
            else if(secondsToWait == 5)
                displayFrame45();
            else if(secondsToWait == 4)
                displayFrame46();
            else if(secondsToWait == 3)
                displayFrame47();
            else if(secondsToWait == 2)
                displayFrame48();
            else if(secondsToWait == 1)
                displayFrame49();
            
            else if (secondsToWait == 0) {
                timer.cancel();
                timer.purge();
                storyPanel.setVisible(true);
                sceneInterface();
            }
        }
    };
    timer.scheduleAtFixedRate(task, 0, 250);
}
    
    private void turnOnBtn(){
        letterA.setEnabled(true);
        letterB.setEnabled(true);
        letterC.setEnabled(true);
        letterD.setEnabled(true);
        letterE.setEnabled(true);
        letterF.setEnabled(true);
        letterG.setEnabled(true);
        letterH.setEnabled(true);
        letterI.setEnabled(true);
        letterJ.setEnabled(true);
        letterK.setEnabled(true);
        letterL.setEnabled(true);
        letterM.setEnabled(true);
        letterN.setEnabled(true);
        letterO.setEnabled(true);
        letterP.setEnabled(true);
        letterQ.setEnabled(true);
        letterR.setEnabled(true);
        letterS.setEnabled(true);
        letterT.setEnabled(true);
        letterU.setEnabled(true);
        letterV.setEnabled(true);
        letterW.setEnabled(true);
        letterX.setEnabled(true);
        letterY.setEnabled(true);
        letterZ.setEnabled(true);
    }
    
    private void turnOffBtn(){
        letterA.setEnabled(false);
        letterB.setEnabled(false);
        letterC.setEnabled(false);
        letterD.setEnabled(false);
        letterE.setEnabled(false);
        letterF.setEnabled(false);
        letterG.setEnabled(false);
        letterH.setEnabled(false);
        letterI.setEnabled(false);
        letterJ.setEnabled(false);
        letterK.setEnabled(false);
        letterL.setEnabled(false);
        letterM.setEnabled(false);
        letterN.setEnabled(false);
        letterO.setEnabled(false);
        letterP.setEnabled(false);
        letterQ.setEnabled(false);
        letterR.setEnabled(false);
        letterS.setEnabled(false);
        letterT.setEnabled(false);
        letterU.setEnabled(false);
        letterV.setEnabled(false);
        letterW.setEnabled(false);
        letterX.setEnabled(false);
        letterY.setEnabled(false);
        letterZ.setEnabled(false);
    }
    private void panelSwitch(){
        if(val >= 0 && val <= 12)
            fourLetPanel.setVisible(true);
        else if (val >= 13 && val <= 41)
            sixLetPanel.setVisible(true);
        else if(val >41)
            fiveLetPanel.setVisible(true);   
    }
    
    private void resetLetters(){
        letter1.setText("");
        letter2.setText("");
        letter3.setText("");
        letter4.setText("");
        sixLet1.setText("");
        sixLet2.setText("");
        sixLet3.setText("");
        sixLet4.setText("");
        sixLet5.setText("");
        sixLet6.setText("");
        fiveLet1.setText("");
        fiveLet2.setText("");
        fiveLet3.setText("");
        fiveLet4.setText("");
        fiveLet5.setText("");
    }
    
    private void hideScene(){
        scene1.setVisible(false);
        scene2.setVisible(false);
        scene3.setVisible(false);
        scene4.setVisible(false);
        scene5.setVisible(false);
        scene6.setVisible(false);
        scene7.setVisible(false);
        scene8.setVisible(false);
        scene9.setVisible(false);
    }
    
    private void displayScene1(){
        hideScene();
        scene1.setVisible(true);
    }
    private void displayScene2(){
        hideScene();
        scene2.setVisible(true);
    }
    private void displayScene3(){
        hideScene();
        scene3.setVisible(true);
    }
    private void displayScene4(){
        hideScene();
        scene4.setVisible(true);
    }
    private void displayScene5(){
        hideScene();
        scene5.setVisible(true);
    }
    private void displayScene6(){
        hideScene();
        scene6.setVisible(true);
    }
    private void displayScene7(){
        hideScene();
        scene7.setVisible(true);
    }
    private void displayScene8(){
        hideScene();
        scene8.setVisible(true);
    }
    private void displayScene9(){
        hideScene();
        scene9.setVisible(true);
    }
    
    private void sceneInterface(){
        
        Timer timer = new Timer();
       
        TimerTask task = new TimerTask() {
           
        int storyTimer = 28;    
            public void run() {  
            storyTimer -= 1;
            
            if(storyTimer == 27)
                displayScene1();
            else if(storyTimer == 26)
                displayScene2();
            else if(storyTimer == 24)
                displayScene3();
            else if(storyTimer == 20)
                displayScene4();
            else if(storyTimer == 19)
                displayScene5();
            else if(storyTimer == 18)
                displayScene6();
            else if(storyTimer == 14)
                displayScene7();
            else if(storyTimer == 10)
                displayScene8();
            else if(storyTimer == 4)
                displayScene9();
            
            else if (storyTimer == 0 || skipVar == 1) {
                timer.cancel();
                timer.purge();
                storyPanel.setVisible(false);
                gamePanel.setVisible(true);
            }
        }
    };
    timer.scheduleAtFixedRate(task, 0, 1500);    
 }
    
    public static Quiz getQuiz(){
        return quiz;
    }
    
    public static HighScoreManager getHighScoreManager(){
        return hsm;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel char1;
    private javax.swing.JLabel char2;
    private javax.swing.JLabel checkSymbol;
    private javax.swing.JLabel checkSymbol2;
    private javax.swing.JLabel checkSymbol3;
    private javax.swing.JLabel copyRight;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitGame;
    private javax.swing.JLabel firstWrong;
    private javax.swing.JLabel fiveLet1;
    private javax.swing.JLabel fiveLet2;
    private javax.swing.JLabel fiveLet3;
    private javax.swing.JLabel fiveLet4;
    private javax.swing.JLabel fiveLet5;
    private javax.swing.JPanel fiveLetPanel;
    private javax.swing.JPanel fourLetPanel;
    private javax.swing.JLabel frame1;
    private javax.swing.JLabel frame10;
    private javax.swing.JLabel frame11;
    private javax.swing.JLabel frame12;
    private javax.swing.JLabel frame13;
    private javax.swing.JLabel frame14;
    private javax.swing.JLabel frame15;
    private javax.swing.JLabel frame16;
    private javax.swing.JLabel frame17;
    private javax.swing.JLabel frame18;
    private javax.swing.JLabel frame19;
    private javax.swing.JLabel frame2;
    private javax.swing.JLabel frame20;
    private javax.swing.JLabel frame21;
    private javax.swing.JLabel frame22;
    private javax.swing.JLabel frame23;
    private javax.swing.JLabel frame24;
    private javax.swing.JLabel frame25;
    private javax.swing.JLabel frame26;
    private javax.swing.JLabel frame27;
    private javax.swing.JLabel frame28;
    private javax.swing.JLabel frame29;
    private javax.swing.JLabel frame3;
    private javax.swing.JLabel frame30;
    private javax.swing.JLabel frame31;
    private javax.swing.JLabel frame32;
    private javax.swing.JLabel frame33;
    private javax.swing.JLabel frame34;
    private javax.swing.JLabel frame35;
    private javax.swing.JLabel frame36;
    private javax.swing.JLabel frame37;
    private javax.swing.JLabel frame38;
    private javax.swing.JLabel frame39;
    private javax.swing.JLabel frame4;
    private javax.swing.JLabel frame40;
    private javax.swing.JLabel frame41;
    private javax.swing.JLabel frame42;
    private javax.swing.JLabel frame43;
    private javax.swing.JLabel frame44;
    private javax.swing.JLabel frame45;
    private javax.swing.JLabel frame46;
    private javax.swing.JLabel frame47;
    private javax.swing.JLabel frame48;
    private javax.swing.JLabel frame49;
    private javax.swing.JLabel frame5;
    private javax.swing.JLabel frame50;
    private javax.swing.JLabel frame6;
    private javax.swing.JLabel frame7;
    private javax.swing.JLabel frame8;
    private javax.swing.JLabel frame9;
    private javax.swing.JLabel gameOver;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton goBack;
    private javax.swing.JButton goBack2;
    private javax.swing.JButton goToMain;
    private javax.swing.JLabel helpBG;
    private javax.swing.JButton helpButton;
    private javax.swing.JPanel helpPanel;
    private javax.swing.JButton highScore;
    private javax.swing.JTextArea highScoreList;
    private javax.swing.JPanel highScorePanel;
    private javax.swing.JLabel labBG;
    private javax.swing.JLabel letter1;
    private javax.swing.JLabel letter2;
    private javax.swing.JLabel letter3;
    private javax.swing.JLabel letter4;
    private javax.swing.JButton letterA;
    private javax.swing.JButton letterB;
    private javax.swing.JButton letterC;
    private javax.swing.JButton letterD;
    private javax.swing.JButton letterE;
    private javax.swing.JButton letterF;
    private javax.swing.JButton letterG;
    private javax.swing.JButton letterH;
    private javax.swing.JButton letterI;
    private javax.swing.JButton letterJ;
    private javax.swing.JButton letterK;
    private javax.swing.JButton letterL;
    private javax.swing.JButton letterM;
    private javax.swing.JButton letterN;
    private javax.swing.JButton letterO;
    private javax.swing.JButton letterP;
    private javax.swing.JButton letterQ;
    private javax.swing.JButton letterR;
    private javax.swing.JButton letterS;
    private javax.swing.JButton letterT;
    private javax.swing.JButton letterU;
    private javax.swing.JButton letterV;
    private javax.swing.JButton letterW;
    private javax.swing.JButton letterX;
    private javax.swing.JButton letterY;
    private javax.swing.JButton letterZ;
    private javax.swing.JPanel loadPanel;
    private javax.swing.JLabel miniChar;
    private javax.swing.JLabel namePrompt;
    private javax.swing.JButton nextQuestion;
    private javax.swing.JButton playButton;
    private javax.swing.JTextField playerName;
    private javax.swing.JLabel question1;
    private javax.swing.JPanel quiz1;
    private javax.swing.JButton saveHighScore;
    private javax.swing.JLabel scene1;
    private javax.swing.JLabel scene2;
    private javax.swing.JLabel scene3;
    private javax.swing.JLabel scene4;
    private javax.swing.JLabel scene5;
    private javax.swing.JLabel scene6;
    private javax.swing.JLabel scene7;
    private javax.swing.JLabel scene8;
    private javax.swing.JLabel scene9;
    private javax.swing.JLabel scientist;
    private javax.swing.JLabel scoreDisp;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JLabel secondWrong;
    private javax.swing.JLabel sixLet1;
    private javax.swing.JLabel sixLet2;
    private javax.swing.JLabel sixLet3;
    private javax.swing.JLabel sixLet4;
    private javax.swing.JLabel sixLet5;
    private javax.swing.JLabel sixLet6;
    private javax.swing.JPanel sixLetPanel;
    private javax.swing.JButton skipStory;
    private javax.swing.JPanel storyPanel;
    private javax.swing.JLabel thirdWrong;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}