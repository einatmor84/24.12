public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(20);
        IndiaBank  IB = new IndiaBank();
        IsraelBank SB = new IsraelBank();
        System.out.println( "Is p1 can have a Bank Account in India? "  +  IB.canHaveBankAccount(p1) );
        System.out.println( "Is p1 can have a Bank Account in Israel? "  +  SB.canHaveBankAccount(p1) );

    }
}