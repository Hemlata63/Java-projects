class Bank {
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 7.4f;
    }
}
class AXIS extends Bank{
    @Override
    float getRateOfInterest() {
        return 8.2f;
    }
}
class YES extends Bank{
    float getRateOfInterest(){
        return 9.3f;
    }
}

class testPolymorphism{
    public static void main(String args[]){
        Bank b;
        b = new SBI();
        System.out.println("SBI Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Interest: " + b.getRateOfInterest());
        b = new YES();
        System.out.println("YES Interest: " + b.getRateOfInterest());
    }
}
