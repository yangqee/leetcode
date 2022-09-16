package newTerm;

/**
 * @author yangqee
 * @date 2022/9/16 10:20 AM
 */
public class RobotZookeeper {
    int monkeyScore = 0;
    int lionScore = 0;
    int elephantScore = 0;

    int minScore;

    public Food feedAnimal(Animal animal) {
        Food ans;
        switch (animal) {
            case LION:
                ans = Food.MEAT;
                break;
            case ELEPHANT:
                ans = Food.LEAVES;
                break;
            case MONKEY:
                ans = Food.MEAT;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animal);
        }
        return ans;
    }

    public Toy entertainAnimal(Animal animal) {
        Toy ans;
        switch (animal) {
            case LION:
                ans = Toy.BOX;
                break;
            case ELEPHANT:
                ans = Toy.HAT;
                break;
            case MONKEY:
                ans = Toy.BALL;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animal);
        }
        return ans;
    }

    public Attention showAttention(Animal animal) {
        Attention ans;
        switch (animal) {
            case LION:
                ans = Attention.PETS;
                break;
            case ELEPHANT:
                ans = Attention.SCRATCHES;
                break;
            case MONKEY:
                ans = Attention.TALKING;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animal);
        }
        return ans;
    }

    public Animal handleRequests() {
        Animal flag;

        monkeyScore = getElephantScore();
        lionScore = getLionScore();
        elephantScore = getElephantScore();

        flag = (monkeyScore < lionScore) ? Animal.MONKEY:Animal.LION;
        minScore = (monkeyScore < lionScore) ? monkeyScore:lionScore;
        flag = (minScore < elephantScore) ? flag:Animal.ELEPHANT;

        return flag;
    }

    public int getMonkeyScore() {
        return monkeyScore;
    }

    public void setMonkeyScore(int score) {
        monkeyScore += score;
    }

    public int getLionScore() {
        return lionScore;
    }

    public void setLionScore(int score) {
        lionScore += score;
    }

    public int getElephantScore() {
        return elephantScore;
    }

    public void setElephantScore(int score) {
        elephantScore += score;
    }

}
enum Animal {
    LION, ELEPHANT, MONKEY
}

enum AnimalNeed {
    FOOD, TOYS, ATTENTION
}

enum Food {
    FRUIT, LEAVES, MEAT
}

enum Toy {
    BALL, HAT, BOX
}

enum Attention {
    SCRATCHES, PETS, TALKING
}
