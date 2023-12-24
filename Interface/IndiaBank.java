public class IndiaBank implements Bank{
    @Override
    public boolean canHaveBankAccount(Person person) {
        if(person.getAge() < 21){
            return false;
        }
        else
            return true;
    }
}
