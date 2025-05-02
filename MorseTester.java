public class MorseTester {
    public static void main(String[] args) {
        MorseTree treeTest = new MorseTree();
        TreeNode<String> e = new TreeNode<String>("e");
        TreeNode<String> i = new TreeNode<String>("i");
        TreeNode<String> s = new TreeNode<String>("s");
        TreeNode<String> h = new TreeNode<String>("h");
        TreeNode<String> t = new TreeNode<String>("t");
        TreeNode<String> m = new TreeNode<String>("m");
        TreeNode<String> o = new TreeNode<String>("o");
        TreeNode<String> a = new TreeNode<String>("a");
        TreeNode<String> n = new TreeNode<String>("n");
        TreeNode<String> u = new TreeNode<String>("u");
        TreeNode<String> r = new TreeNode<String>("r");
        TreeNode<String> w = new TreeNode<String>("w");
        TreeNode<String> d = new TreeNode<String>("d");
        TreeNode<String> k = new TreeNode<String>("k");
        TreeNode<String> g = new TreeNode<String>("g");
        TreeNode<String> v = new TreeNode<String>("v");
        TreeNode<String> f = new TreeNode<String>("f");
        TreeNode<String> l = new TreeNode<String>("l");
        TreeNode<String> p = new TreeNode<String>("p");
        TreeNode<String> j = new TreeNode<String>("j");
        TreeNode<String> b = new TreeNode<String>("b");
        TreeNode<String> x = new TreeNode<String>("x");
        TreeNode<String> c = new TreeNode<String>("c");
        TreeNode<String> y = new TreeNode<String>("y");
        TreeNode<String> z = new TreeNode<String>("z");
        TreeNode<String> q = new TreeNode<String>("q");
        treeTest.morseTreeRoot.setLeft(e);
        e.setLeft(i);
        e.setRight(a);
        a.setLeft(r);
        r.setLeft(l);
        a.setRight(w);
        w.setLeft(p);
        w.setRight(j);
        i.setLeft(s);
        i.setRight(u);
        u.setLeft(f);
        s.setLeft(h);
        s.setRight(v);
        treeTest.morseTreeRoot.setRight(t);
        t.setRight(m);
        t.setLeft(n);
        n.setLeft(d);
        d.setLeft(b);
        d.setRight(x);
        n.setRight(k);
        k.setLeft(c);
        k.setRight(y);
        m.setRight(o);
        m.setLeft(g);
        g.setLeft(z);
        g.setRight(q);


        System.out.println(treeTest.preorderTree());
        System.out.println(treeTest.postorderString());

        System.out.println(treeTest.engtoMorse("The quick fox"));

        String morseSentence = treeTest.engtoMorse("The quick fox");

        System.out.println(treeTest.morseToEng(morseSentence));
    }
}
