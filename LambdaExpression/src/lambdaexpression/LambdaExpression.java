
package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpression {

    
    public LambdaExpression() {
        ArrayList<Student> students;
        students = new ArrayList<>();
        
        students.add(new Student(5,"Amitsoh",1.5));
        students.add(new Student(1,"Abul",3.0));
        students.add(new Student(3,"Babul",2.5));
        students.add(new Student(2,"Abcd",2.3));

        System.out.println("Before Sorted");

        for(Student student: students)
            System.out.println(student);
        
        //Collections.sort(students);
        
        //Collections.sort(students, new IDComparator());
        
        /* In Interface object can't be instantiate but you can
        declare an object. */
        
        /*
        //Anonymous Class
        Collections.sort(students, new Comparator(){
            
            @Override
            public int compare(Object o1, Object o2){
                Student a = (Student) o1;
                Student b = (Student) o2;
                double value = a.getCgpa() - b.getCgpa();
                if(value < 0 )
                    return -1; 
                else if(value>0 )
                    return +1; 
                else return 0;
            }
        });
        */
        
        Collections.sort(students,(a,b) -> a.getName().compareTo(b.getName()));
        System.out.println("After Sorted");
        for(Student student: students)
            System.out.println(student);
        
        Printer printA = new Printer("A",1000);
        Printer printB = new Printer("B",1000);
        new Thread(printA).start();
        new Thread(printB).start();
        new Thread(()-> {
            for(int i=1; i<=1000; i++)
                System.out.printf("C%d\n",i);
            }).start();
    } 

    public static void main(String[] args) {
        new LambdaExpression();
    }
    
}
