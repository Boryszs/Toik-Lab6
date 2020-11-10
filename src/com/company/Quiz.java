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

/** nalezy zaimplementowac interfejs Quiz. */
class QuizImpl implements Quiz {

    private int digit;

    public QuizImpl() {
        this.digit = 254;    // zmienna moze ulegac zmianie!
    }

    // implementacja metody isCorrectValue...
    @Override
    public void isCorrectValue(int value) throws ParamTooLarge, ParamTooSmall {
        if(value>digit){
            throw new ParamTooLarge(value);
        }else if(value<digit) {
            throw new ParamTooSmall(value);
        }
    }

}