package day49_Abstraction.ShapeTask;


interface X {
    void x();
}

interface Y  {
    void y();
}

interface Z {
    void z();
}

public interface InterfaceInheritance extends X, Y, Z {
    void q();
}

class Practice implements InterfaceInheritance {

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }

    @Override
    public void z() {

    }

    @Override
    public void q() {

    }
}



