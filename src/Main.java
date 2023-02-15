import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(10);

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        list.add(1);
        list.add(12);
        list.add(45);
        list.add(67);

        list.remove(2);
        list.add(1, 333);

        list.print();



        TreeSetImplementation treeSetImplementation = new TreeSetImplementation();

        treeSetImplementation.add(1);
        treeSetImplementation.add(10);
        treeSetImplementation.add(100);

        System.out.println(treeSetImplementation.root);

        System.out.print(treeSetImplementation.root.left + "       ");
        System.out.println(treeSetImplementation.root.right);

        System.out.print("           " + treeSetImplementation.root.right.left + "           " );
        System.out.println(treeSetImplementation.root.right.right);






    }
}
