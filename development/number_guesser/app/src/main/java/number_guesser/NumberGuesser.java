package number_guesser;

public class NumberGuesser {

    int secretNumber;

    // NumberGuesserTest -> option + Shift + enter or use red bulb abd create this constructor class below:
    public NumberGuesser(int secretNumber) {
        this.secretNumber = secretNumber;
    }


    public String guess(int number) {
        if(number > this.secretNumber) {
            return "Lower";
        } else if(number < this.secretNumber) {
                return "Higher";
            } else {
            return "Correct-A-Reno";
        }
    }
}
