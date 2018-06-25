public enum Money {
    PYATERKA(10), CHERVONEZ(4), DVADZATKA(17), SOTKA(2), DVYHSOTKA(3), PYATISOTKA(7);
    private int banknotesNumber;

    Money(int money) {
        banknotesNumber = money;
    }

    int getBanknotesNumber() {
        return banknotesNumber;
    }
}
