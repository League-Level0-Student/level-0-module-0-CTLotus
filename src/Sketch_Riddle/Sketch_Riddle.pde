import javax.swing.*;

void setup(){
  int score = 0;
  String answer = JOptionPane.showInputDialog("What is long and hard, but time consuming?");
  
  if(answer.equalsIgnoreCase("HomeWork")){
    JOptionPane.showMessageDialog(null, "Yay! Correct!");
    score = score + 1;
  }else{
   JOptionPane.showMessageDialog(null, "Error! The answer is homework.");
    
  }
  JOptionPane.showMessageDialog(null,"" + score);
 }
