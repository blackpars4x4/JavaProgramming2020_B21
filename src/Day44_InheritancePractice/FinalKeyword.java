package Day44_InheritancePractice;

class Q{

    public final void method(){
        System.out.println("Method A");
    }

    public final void method(int a){
        System.out.println("Method A"+ a);
    }


}


class FinalKeyWord extends Q {

    /*
    @Override
    public void method(){
        System.out.println("Method B");   // final methods cannot be overriden
    }
     */


    public final static int z = 200 ;

    public final static void main(String[] args) {

        System.out.println(z); // 0
        //  z = 300; cannot be re-assigned

    }

}



class Z {


}