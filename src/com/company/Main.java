package com.company;

class Main {

    /**
     * metoda main powinna implementowac algorytm do
     * jak najszybszego wyszukiwania wartosci
     * zmiennej digit z klasy QuizImpl (zakladamy ze
     * programista nie zna zawartosci klasy QuizImpl).
     * Nalezy zalozyc, ze pole digit w klasie QuizImpl
     * moze w kazdej chwili ulec zmianie. Do wyszukiwania
     * odpowiedniej wartosci nalezy wykorzystywac tylko
     * i wylacznie metode isCorrectValue - jesli metoda
     * przestanie rzucac wyjatki wowczas mamy pewnosc ze
     * poszukiwana zmienna zostala odnaleziona.
     */
    public static void main(String[] args) {

        Quiz quiz = new QuizImpl();
        Compartment compartment=new Compartment();
        int digit =  100; // zainicjuj zmienna

        for(int counter = 1; ;counter++) {

            try {

                quiz.isCorrectValue(digit);
                System.out.println("Trafiona proba!!! Szukana liczba to: "
                        + digit + " Ilosc prob: " + counter);
                System.out.println(compartment.getMax()+" "+compartment.getMin());

                break;

            } catch(Quiz.ParamTooLarge e) {

                System.out.println("Argument za duzy!!!");
                // implementacja logiki...

                compartment.setMax(e.getNumber());
                digit=(compartment.getMax()+compartment.getMin())/2;

            } catch(Quiz.ParamTooSmall e) {

                System.out.println("Argument za maly!!!");
                // implementacja logiki...

                compartment.setMin(e.getNumber());
                digit=(compartment.getMax()+compartment.getMin())/2;
            }
        }
    }
}
