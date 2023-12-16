import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SetFromHashmap<Integer,Integer> s = new SetFromHashmap<>();
        s.add(1,1);
        s.add(2,2);
        s.add(3,3);
        for(Integer key : s.s.keySet()){
            System.out.print(key+" ");
        }
        System.out.println(" ");

        SetFromHashmap<Integer,Integer> h = new SetFromHashmap<>();
        h.add(4,4);
        h.add(5,5);
        for(Integer key : h.s.keySet()){
            System.out.print(key+" ");
        }
        System.out.println(" ");

        s.addAll(h);

        System.out.print("s.addAll(h): ");
        for(Integer key : s.s.keySet()){
            System.out.print(key+" ");
        }
        System.out.println(" ");
        System.out.println("size of s : "+s.size());
        System.out.println("s is empty? : "+s.isEmpty());
        System.out.println("s contains 5? : "+s.contains(5));
        System.out.println("s contains all of h ?: "+s.containsAll(h));

        System.out.println("Removed element: "+s.remove(5));
        System.out.println("Removed element: "+s.remove(2));

        System.out.print("Elements Left: ");
        for(Integer key : s.s.keySet()){
            System.out.print(key+" ");
        }
        s.add(5,5);
        s.removeAll(h);
        System.out.print("\ns after removeAll from h: ");
        for(Integer key : s.s.keySet()){
            System.out.print(key+" ");
        }

        SetFromHashmap<Integer,Integer> a = new SetFromHashmap<>();
        SetFromHashmap<Integer,Integer> b = new SetFromHashmap<>();

        a.add(1,1);
        a.add(2,2);
        a.add(3,3);

        b.add(2,2);
        b.add(3,3);
        b.add(4,4);

        System.out.print("\na: ");
        for(Integer key : a.s.keySet()){
            System.out.print(key+" ");
        }
        System.out.println(" ");

        System.out.print("b: ");
        for(Integer key : b.s.keySet()){
            System.out.print(key+" ");
        }

        System.out.println("\nIntersect b to a: "+a.retainAll(b));

        System.out.print("\na: ");
        for(Integer key : a.s.keySet()){
            System.out.print(key+" ");
        }
        System.out.println(" ");
    }
}