import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class AnimalShelter<T> {
    private PseudoQueue<Dog> dogQueue;
    private PseudoQueue<Cat> catQueue;

    public AnimalShelter() {
        this.dogQueue = new PseudoQueue<>();
        this.catQueue = new PseudoQueue<>();
    }

    public void enque(String input, String name) {
        if (input.toLowerCase().equals("dog")) {
            this.dogQueue.enqueue(new Dog(name));
        } else if (input.toLowerCase().equals("cat")) {
            this.catQueue.enqueue((new Cat(name)));
        }
    }

    public T deque(String animal) {
        if (animal.toLowerCase().equals("dog")) {
            System.out.println("woof!!");
            return (T) this.dogQueue.deque().name;
        } else if (animal.toLowerCase().equals("cat")) {
            System.out.println("meow!");
            return (T) this.catQueue.deque().name;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack3 = new Stack<>();
        stack3.push(3);

        AnimalShelter shelter = new AnimalShelter();
        shelter.enque("cat","Biscuit");
        shelter.enque("dog","Woofer");
        shelter.enque("dog","Sparky");
        shelter.enque("dog","Rex");
        shelter.enque("cat","Casserole");
        shelter.enque("cat","Albert");
        shelter.enque("Dog","Tippy");

        System.out.println(shelter.deque("cat"));
        System.out.println(shelter.deque("dog"));
        System.out.println(shelter.deque("cat"));
        System.out.println(shelter.deque("dog"));

    }
}



