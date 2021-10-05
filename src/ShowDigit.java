
public class ShowDigit implements Runnable {
    char Digit;

    public ShowDigit(char digit) {
        setDigit(digit);
    }

    public void setDigit(char digit) {
        this.Digit = digit;
    }

    public char getDigit() {
        return Digit;
    }

    @Override
    public void run() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        for (int i = 0; i < 100 && Thread.currentThread().isAlive(); i++) {
            try {
                System.out.print(getDigit());
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread ID: " + Thread.currentThread().getId());

        /*Thread creation*/
        ShowDigit digit1 = new ShowDigit('1');
        Thread th1 = new Thread(digit1);
        ShowDigit digit2 = new ShowDigit('2');
        Thread th2 = new Thread(digit2);

        /*Thread execution*/
        th1.start();
        th2.start();
    }
}