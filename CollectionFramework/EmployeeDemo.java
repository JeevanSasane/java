package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo implements Comparable<EmployeeDemo> {

    int id;
    String name;
    String address;

    public EmployeeDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        EmployeeDemo obj1=new EmployeeDemo(52,"Jeevan","Satara");
        EmployeeDemo obj2=new EmployeeDemo(98,"Amit","Satara");
        EmployeeDemo obj3=new EmployeeDemo(26,"Tejas","Satara");

        List<EmployeeDemo> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }

    @Override
    public int compareTo(EmployeeDemo o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(EmployeeDemo o) {
//        if (this.id==o.id){
//            return 0;
//        }else if (this.id>o.id){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
}
