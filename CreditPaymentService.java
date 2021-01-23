public class CreditPaymentService {

//    Расчет аннуитетного платежа
    public long calculate(int credit, int month) {
        double monthPercent = 9.99 / 12 / 100;
        double coefficient = monthPercent * Math.pow((1 + monthPercent), month) / (Math.pow((1 + monthPercent), month) - 1);
        double payment = (credit * coefficient);
        return (long) payment;
    }
}
