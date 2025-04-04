class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 5.5;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 6.7;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.2;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");
    }
}
