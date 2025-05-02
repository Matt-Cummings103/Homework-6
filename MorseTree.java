public class MorseTree {    
    public TreeNode<String> morseTreeRoot =  new TreeNode<String>("_");
    public MorseTree(){
        morseTreeRoot.setElement("_");
    }

    public String preorderTree(){
       return morseTreeRoot.preorder(morseTreeRoot);
    }

    public String postorderString(){
        return morseTreeRoot.postorder(morseTreeRoot);
    }

    public String engtoMorse(String sentence){
        String morse = "";
        for (int i = 0; i < sentence.length(); i++){
            morse += engToMorseChar((sentence.charAt(i) + "").toLowerCase(), "", morseTreeRoot);
            morse += "|";
        }
        return morse;
    }

    public String engToMorseChar(String letter, String path, TreeNode<String> node){
        if (node.getElement().equals(letter)){
            return path;
        }
        else{
            if (node.getLeft() == null && node.getRight() == null){
                return "";
            }
            else if (node.getLeft() != null && node.getRight() == null){
                return engToMorseChar(letter, path + "o", node.getLeft());
            }
            else if (node.getLeft() == null && node.getRight() != null){
                return engToMorseChar(letter, path + "-", node.getRight());
            }
            else{
                return engToMorseChar(letter, path + "o", node.getLeft()) + engToMorseChar(letter, path + "-", node.getRight());
            }
        }
    }

    public String morseToEng(String morse){
        String eng = "";
        TreeNode<String> temp = morseTreeRoot;
        for (int i = 0; i < morse.length();i++){
            if (morse.charAt(i) == '|'){
                temp = morseTreeRoot;
            }
            else {
                if (morse.charAt(i) == '-'){
                    temp = temp.getRight();
                }
                else if (morse.charAt(i) == 'o'){
                    temp = temp.getLeft();
                }
                if (morse.charAt(i+1) == '|'){
                    eng += temp.getElement();
                }
            }
        }
        return eng;
    }

}
