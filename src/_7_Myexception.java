public class _7_Myexception {
    public static void main(String[] args) {
        _7_UserDefineException udfe = new _7_UserDefineException();
       try{
           udfe.validate(22);
       }
       catch(_7_InvalidAgeException e){
           System.out.println(e.getMessage());
       }
    }
}
