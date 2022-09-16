
class Super{
    public void display(){
        System.out.println("Super Class Display");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub Class Display");
    }
}
class TV {
    public void switchON(){
        System.out.println("TV is Switched ON");
    }
    public void changeChannel(){
        System.out.println("Tv channel is changed");
    }
}
class SmartTv extends TV{
        @Override
        public void switchON(){
            System.out.println("Smart Tv is Switched on");
        }
        @Override
        public void changeChannel(){
            System.out.println("SmartTv channel is changed");
        }
        public void browse(){
            System.out.println("Smart tv is browsing");
        }
}


public class Overriding {
    

    public static void main(String[] args) {

        TV tv = new TV();
        tv.changeChannel();
        tv.switchON();
        TV Tv = new SmartTv();
        Tv.changeChannel();
        Tv.switchON();
        /* Tv.browse(); */
        /* Super sup = new Super(); */
       /*  sup.display(); */
       /*  Sub sub = new Sub();
        sub.display();
        Super sup = new Sub();
        sup.display(); */
    }
}
