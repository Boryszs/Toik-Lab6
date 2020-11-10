package com.company;

/**
 * nalezy zaimplementowac interfejs Quiz.
 */
class QuizImpl implements Quiz {

    private int digit;

    public QuizImpl() {
        this.digit = 254;    // zmienna moze ulegac zmianie!
    }

    // implementacja metody isCorrectValue...
    @Override
    public void isCorrectValue(int value) throws ParamTooLarge, ParamTooSmall {
        if (value > digit) {
            throw new ParamTooLarge(value);
        } else if (value < digit) {
            throw new ParamTooSmall(value);
        }
    }

}
