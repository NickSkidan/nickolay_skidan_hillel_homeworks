public class TestMoney {
    public static void main(String[] args) {
        Money money1;
        Money money2 = Money.CHERVONEZ;
        Money money3 = Money.PYATISOTKA;
        System.out.println("Имеющиеся купюры: ");
        for (Money money : Money.values()) {
            System.out.println(money);
        }
        money1 = Money.valueOf("DVYHSOTKA");
        System.out.println("Заданная купюра - " + money1);
        switch (money1) {
            case PYATERKA:
                System.out.println("Не купишь ничего");
                break;
            case CHERVONEZ:
                System.out.println("Можно купить булку");
                break;
            case DVADZATKA:
                System.out.println("Хватит на 0.5 колы");
                break;
            case SOTKA:
                System.out.println("У тебя достаточно на обед в столовой");
                break;
            case DVYHSOTKA:
                System.out.println("Теперь в столовой можно не только пообедать, но еще и поужинать");
                break;
            case PYATISOTKA:
                System.out.println("Смело приглашай на свидание девушку! Но лучше его провести пиццерии");
                break;
            default:
                System.out.println("Такой купюры нет");
        }
        System.out.println("У тебя сейчас в кармане: ");
        for (Money money : Money.values()) {
            System.out.println(money + ": " + money.getBanknotesNumber() + " штук");
        }
        System.out.println("Порядковые значения купюр в Money: ");
        for (Money money : Money.values()) {
            System.out.println(money + ": " + money.ordinal());
        }
        if (money1.compareTo(money2) > 0)
            System.out.println(money1 + " больше, чем " + money2);
        if (money1.compareTo(money3) < 0)
            System.out.println(money1 + " меньше, чем " + money3);
    }
}
