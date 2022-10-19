package ThirdLesson;

public class GetReady {
    boolean sts;
    boolean maintenance;
    boolean contract;
    boolean money;

    public void STS(){
        System.out.println("Registration certificate is check.");
        this.sts = true;
    }

    public void Maintenance(){
        System.out.println("Service is check.");
        this.maintenance = true;
    }

    public void Contract(){
        System.out.println("Contract signed");
        this.contract = true;
    }

    public void Money(){
        System.out.println("Money paid.");
        this.money = true;
    }

    public void getready() throws ReadyException {
        if (sts && maintenance && contract && money){
            System.out.println("Car is ready for purchase");
        }
        else {
            throw new ReadyException ("Car is not ready for purchase");
        }

    }

}