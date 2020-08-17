public class OsnovniKalkulator {



//    public Integer sabiranje(Integer a, Integer b){
//
//        return a + b;
//
//    }

    public Integer sabiranje(Integer ... brojevi){
        Integer zbir = 0;

        for(Integer n: brojevi) {

            zbir += n;
        }
        return zbir;
    }

    public Double sabiranje(Double ... brojevi){
        Double zbir = 0D;

        for(Double n: brojevi) {

            zbir += n;
        }
        return zbir;
    }

    public Integer oduzimanje(Integer ... brojevi){
        Integer razlika = brojevi[0];

        for(int i = 1; i< brojevi.length; i++) {

            razlika -= brojevi[i];
        }
        return razlika;
    }

    public Integer mnozenje(Integer...brojevi){
        Integer proizvod = 1;

        for(Integer n: brojevi){
            proizvod *= n;
        }
        return proizvod;
    }
    public Double deljenje(Integer...brojevi){
        Double kolicnik = brojevi[0].doubleValue();

        for(int i = 1; i <brojevi.length; i++){
            if(brojevi[i] == 0){
                throw new IllegalArgumentException("Nije dozvoljeno deljenje nulom!");
            }
            kolicnik /=brojevi[i];
        }
        return kolicnik;

    }
}
