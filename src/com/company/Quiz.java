package com.company;

/** interfejs dla gry Quiz */
interface Quiz {

    // minimalny zakres poszukiwan
    int MIN_VALUE = 0;
    // maksymalny zakres poszukiwan
    int MAX_VALUE = 1000;

    /**
     * metoda rzuca wyjatek ParamTooLarge w
     * przypadku gdy parametr wejsciowy jest wiekszy
     * od oczekiwanej zmiennej, w przeciwnym wypadku
     * rzuca wyjatek ParamTooSmall.
     */
    void isCorrectValue(int value)
            throws Quiz.ParamTooLarge, Quiz.ParamTooSmall;

    class ParamTooLarge extends Exception {
        private int number;

        public ParamTooLarge(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    class ParamTooSmall extends Exception {
        private int number;

        public ParamTooSmall(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
}

