package pattern.structure.composite.security;

class Test {
    public static void main(String[] args) {
        Composite root=new Composite("root");

        Composite branchA=new Composite("---branchA");
        Composite branchB=new Composite("------branchB");
        Composite branchC=new Composite("------branchC");

        Component leaf=new Leaf("---leaf");
        Component leafB1=new Leaf("---------leafB1");
        Component leafB2=new Leaf("---------leafB2");
        Component leafC1=new Leaf("---------leafC1");
        Component leafC2=new Leaf("---------leafC2");

        root.addChild(branchA);
        root.addChild(leaf);

        branchA.addChild(branchB);
        branchA.addChild(branchC);

        branchB.addChild(leafB1);
        branchB.addChild(leafB2);
        branchC.addChild(leafC1);
        branchC.addChild(leafC2);
        

        String result = root.operation();
        System.out.println(result);



    }
}