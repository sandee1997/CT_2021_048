package Q_04;

public class Main {
    public static void main(String[] args) {
        Owner sandeepa = new Owner("Sandeepa", "0771234567");
        BicycleNew tomahawk = new BicycleNew(sandeepa);
        System.out.println("Owner Name:" + tomahawk.getBicycleOwner().getOwnerName());
        System.out.println("Owner Phone No:" + tomahawk.getBicycleOwner().getPhoneNo());

    }
}

