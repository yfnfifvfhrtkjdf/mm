import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotic1 = new Kotik("Garry", "Meow", 6, 4);
        Kotik kotic2 = new Kotik();
        kotic2.setName("Torry");
        kotic2.setVoce("Meow");
        kotic2.setSatiety(5);
        kotic2.setWeight(3);
        kotic2.setPlay(1);
        kotic2.setSleep(3);
        kotic2.setWalk(2);
        kotic2.setWash(0);
        kotic2.setHunt(5);
       kotic2.liveAnotherDay();
        System.out.println(kotic1.getVoce());
        System.out.println(kotic2.getVoce());
        compareVoice(kotic1, kotic2);
        System.out.println("Второго котика зовут "+ kotic2.getName()+" его вес " + kotic2.getWeight());
        System.out.println("Количество котиков " + Kotik.getCount());
    }
    private static boolean compareVoice(Kotik kot1, Kotik kot2) {
        int kkk = kot1.getVoce().compareTo(kot2.getVoce());
        kot1.setVoce(kot1.getVoce());
        kot2.setVoce(kot2.getVoce());
        if (kkk<0) {
            System.out.println("голос первого кота "+kot1.getVoce() + " голос второго кота "+ kot2.getVoce() +"голоса тиков разные");
            return false;
        }else {
            System.out.println("голоса котиков одинаковые " + "голос первого кота "+kot1.getVoce() + " голос второго кота "+ kot2.getVoce());
            return true;
        } }


    }

