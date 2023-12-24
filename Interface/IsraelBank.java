public class IsraelBank implements Bank{
    public boolean canHaveBankAccount(Person person){
        if(person.getAge() < 18){
            return false;
        }
        else
            return true;
    }
}
