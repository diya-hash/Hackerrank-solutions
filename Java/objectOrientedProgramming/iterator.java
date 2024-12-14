package objectOrientedProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class str {
    String s = "###";
}

public class iterator {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        String s = new String("####");
        while (it.hasNext()) {
            Object element = it.next();
            if (element.toString().contains("###"))// Hints: use instanceof operator

                break;
        }
        return it;

    }
}
