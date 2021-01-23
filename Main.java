public class Main {
        public static void main(String[] args) {
            CreditPaymentService service = new CreditPaymentService();
//    Расчет аннуитетного платежа
            long payment1 = service.calculate(1_000_000, 12);
            long payment2 = service.calculate(1_000_000, 24);
            long payment3 = service.calculate(1_000_000, 36);

            System.out.println(payment1);
            System.out.println(payment2);
            System.out.println(payment3);
        }
}
