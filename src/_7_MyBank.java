public class _7_MyBank {
    public static void main(String[] args) {
        _7_Bank b = new _7_Bank();
      try{
          b.withdraw(1200);
      } catch (_7_InsufficientBalanceException e) {
          System.out.println(e.getMessage());

      }
    }
}
