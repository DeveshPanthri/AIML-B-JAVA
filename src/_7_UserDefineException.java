public class _7_UserDefineException {
    public void validate(int age) throws _7_InvalidAgeException{
        if(age<18)
            throw new _7_InvalidAgeException("Cannot cast vote age is less than 18");
        else
            System.out.println("Eligible to vote ");
    }
}
