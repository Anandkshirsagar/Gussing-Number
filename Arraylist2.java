import java.util.ArrayList;
public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0,1);
        l.add(1,2);
        l.add(2,3);
        System.out.println(l);

        System.out.println(l.get(1));

        //l.remove(2);
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
        }
    }
}
