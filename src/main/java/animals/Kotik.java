package animals;

import java.util.ArrayList;

public class Kotik {
    private String name; // имя
    private String voce; // голос
    private int satiety; // сытость
    private int weight; // вес
    private static int count=0; // отвечает за кол-во экземпляров класса
    private static final int[] METHODS = {1, 2, 3, 4, 5};
    private  static ArrayList cat = new ArrayList(count);
    // Конструкторы //
    public Kotik(String name, String voce, int satiety, int weight) {
        this.name = name;
        this.voce = voce;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }
    public Kotik() {
        name = getName();
        voce = getVoce();
        satiety = getSatiety();
        weight = getWeight();
        count++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVoce() {
        return voce;
    }
    public void setVoce(String voce) {
        this.voce = voce;
    }
    public int getSatiety() {
        return satiety;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count++;
    }
    public void setCount(int count) {this.count = count++;}

    public int getWeight() {return weight;}
    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int play; // играть
    private int sleep; // спать
    private int wash; // умываться
    private int walk; // гулять
    private int hunt; // охотиться
    private String eda;

    public String getEda () {return  eda;}
    public void setEda () {this.eda=eda;}
    public int getPlay() {return play;}
    public void setPlay(int play) {this.play = play;}
    public int getSleep() {return sleep;}
    public void setSleep(int sleep) {this.sleep = sleep;}
    public int getWash() {return wash;}
    public void setWash(int wash) {this.wash = wash;}
    public int getWalk() {return walk;}
    public void setWalk(int walk) {this.walk = walk;}
    public int getHunt() {return play;}
    public void setHunt(int hunt) {this.hunt = hunt;}

    public boolean play() {
        setPlay(play);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик играет");
            return true;
        } else {
            System.out.println("Котик просит есть ");
            return false;
        }
    }
    public boolean sleep() {
        setSleep(sleep);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик спит");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean wash () {
        setWash(wash);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик умывается");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean walk() {
        setWalk(walk);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик гуляет");
        return  true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean hunt () {
        setHunt(hunt);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик охотится");
        return  true;
        } else {
            System.out.println("Котик просит есть");
            return  false;
        }

    }
    public boolean eat(int s2) {
        this.satiety=satiety;
        if (satiety<1) {
            satiety += s2;
            System.out.println("котик поел. Сытость: " + satiety);
            return true;
        }else {
            System.out.println("Котик не голоден. Уровень сытости: " + satiety);
            return false;
        }
    }

    public boolean eat( int satiety, String eda) {
        this.eda=eda;
        this.satiety=satiety;
            System.out.println("Котик ел "+eda + " Уровень сытости " +satiety);
return true;
    }
    public void eat() {
        eat(satiety, eda);
    }

    public boolean getSatiety (int s2) {
        if (satiety<0) {
            eat(satiety);
            return true;
        }else {
            return false;
        }
    }

    public static int[] getMETHODS(int play, int sleep, int walk, int wash, int hunt) {
        play=(int) (Math.random() * METHODS[5]) + 1;
        sleep = (int) (Math.random() * METHODS[5]) + 1;
                walk=(int) (Math.random() * METHODS[5]) + 1;
                        wash= (int) (Math.random() * METHODS[5]) + 1;
                                hunt=(int) (Math.random() * METHODS[5]) + 1;
        return METHODS;
    }

    public void liveAnotherDay() {
        int number;
        int rand = (int) (Math.random() * 5) + 1;

        for (number = 0; number <24; number++){
            switch (rand) {
                case 1:
                        play();
                        number++;
                        System.out.println(number + " - Играл");

                case 2:

                        sleep();
                        number++;
                        System.out.println(number + " - Спал");


                case 3:

                    wash();
                    number++;
                    System.out.println(number + " - Умывался");


                case 4:

                    walk();
                    number++;
                    System.out.println(number + " - Гулял");

                case 5:

                    hunt();
                    number++;
                    System.out.println(number + " - Охотился");

                default:
                    number++;
                    eat(2);
                    System.out.println( number + " - Ел "+ satiety);
break;
            }
        }
    }

}
