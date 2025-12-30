package org.learnings;

public class Dev {



    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("Building Project");
        comp.compile();
    }
}
