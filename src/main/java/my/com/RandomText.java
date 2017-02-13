package my.com;

class RandomText {
    String name;
    int random;


    public RandomText() {
        this.name = name;

    }


    public int getRandom() {
        return random;
    }

    public int setRandom() {
        this.random = (int) (Math.random() * 10);
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String setName() {
        if (random < 5) {
            this.name = "ok";
        } else {
            this.name = "ne_ok";
        }
        return this.name;

    }

}