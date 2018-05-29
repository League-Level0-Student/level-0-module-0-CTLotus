import javax.swing.JOptionPane;
/*
public static void main (String[] args){
  String yes = JOptionPane.showInputDialog("Can you say yes?");
  
  if(yes.equals("yes")){
    JOptionPane.showMessageDialog(null, "Happy");
  }else{
    JOptionPane.showMessageDialog(null, "Sad");
  }
  JOptionPane.showMessageDialog(null, "Wednesday");
}
*/
/*
void setup(){
  String ag3 = JOptionPane.showInputDialog("How old are you?");
  int age = Integer.parseInt(ag3);
  if (age <= 18){
   JOptionPane.showMessageDialog(null, "It's so great being young!"); 
  }else{
   JOptionPane.showMessageDialog(null, "Don't you wish you were young!"); 
  }
  
}
*/
//import javax.swing.JOptionPane;
//String numCats = JOptionPane.showInputDialog("number cats?");
//int totalCats = Integer.parseInt(numCats);
//if(totalCats > 2){
  //System.out.println("You're crazy!");
  
void setup(){
  String animal = JOptionPane.showInputDialog("What is your favorite pet?");
  
  if(animal.equalsIgnoreCase("Dog"){
    JOptionPane.showMessageDialog(null, "Dogs go woof!");
  }else{
   JOptionPane.showMessageDialog(null, "I don't know that animal"); 
  }
  if(animal.equalsIgnoreCase("Cat"){
    JOptionPane.showMessageDialog(null, "Cats go meow!");
  }else{
   JOptionPane.showMessageDialog(null, "I don't know that animal"); 
  }
    
  
  
}
