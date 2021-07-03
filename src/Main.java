public class Main {
    public static void main(String[] args) {
        long clientAccount = 100;
        long payAmount = 1050;
        int bonusPrice= 100;
        int countBonus =0;

        if (payAmount >= 1000) {
            System.out.println("начисляем бонус");
            countBonus =(int) payAmount/bonusPrice;
            System.out.println("сумма бонуса "+ countBonus);
        }
        clientAccount = (long) (clientAccount+payAmount+countBonus);
        System.out.println("текущий счет клиента "+clientAccount);
    }
}




