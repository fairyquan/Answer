package pattern.behavior.visitor;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory userDir = new Directory("user");
        Directory tmpdir = new Directory("tmp");
        rootDir.add(binDir);
        rootDir.add(tmpdir);
        rootDir.add(userDir);
        binDir.add(new File("a", 1000));
        binDir.add(new File("b", 2000));
        rootDir.accept(new ListVisitor());

        System.out.println("=======================");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");
        userDir.add(yuki);
        userDir.add(hanako);
        userDir.add(tomura);
        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));
        hanako.add(new File("memo.tex", 300));
        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));
        rootDir.accept(new ListVisitor());

		System.out.println("==============================");
        FileFindVisitor ffv = new FileFindVisitor(".html");
        rootDir.accept(ffv);

        Iterator it = ffv.getFoundFiles();
        while (it.hasNext()) {
            File file = (File) it.next();
            System.out.println(file.toString());
        }
    }

}

