public class MorseTree {    
    public TreeNode<String> morseTreeRoot =  new TreeNode<String>(null);
    public MorseTree(){
        morseTreeRoot.setElement(null);
    }

    public String preorderTree(){
       return morseTreeRoot.preorder(morseTreeRoot);
    }

    public String postorderString(){
        return morseTreeRoot.postorder(morseTreeRoot);
    }

    public String engtoMorse(String sentence){
        int index = sentence.length();
        String morse = "";
        String charString = "";
        for (int i = 0; i < index; i++){
            if (sentence.charAt(i) != ' '){
                morse = charString + sentence.charAt(i);
                morse = morseTreeRoot.morseString(morse) + "|";
                charString = "";
            }
        }
        return morse;
    }

}