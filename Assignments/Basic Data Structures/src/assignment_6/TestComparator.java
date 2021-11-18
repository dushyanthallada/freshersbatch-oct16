package assignment_6;
import java.util.*;
import java.io.*;
class TestComparator {
   public static void main(String[] args) {

       // Creating the TreeSet with Comparator object passed
       // as the parameter which will sort the user defined
       // objects of TreeSet
       var treeSet = new TreeSet<Employee>();
       var e1 = new Employee(1, "Anil", "MCA", 20000);
       var e2 = new Employee(2, "Varun", "MCA", 18000);
       var e3 = new Employee(3, "Varun", "IT", 25000);
       var e4 = new Employee(4, "Shekar", "MCA", 20000);
       var e5 = new Employee(5, "Ramesh", "Bsc", 20000);

       Employee.field="name";


       treeSet.add(e1);
       treeSet.add(e4);
       treeSet.add(e2);
       treeSet.add(e3);
       treeSet.add(e5);
       Employee e = null;
           for (var h : treeSet) {
               e = h;
               System.out.println(e.getName());
           }
   }
}

