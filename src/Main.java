import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] integers=new Integer[]{1,2,3,4,5,6};
        for(Integer integer:integers){
            if(integer%2==0){
                System.out.println(integer);
            }
        }
        System.out.println(" ");
        System.out.println("_________________________________");
        Arrays.stream(integers).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer%2==0){
                    return true;
                }else
                return false;
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("________________________________________");

        Arrays.stream(integers).filter(s->s%2==0).forEach(System.out::println);
        System.out.println("________________________________________");
        Integer[] integers1=new Integer[]{1,2,3,4,5,6};
        Arrays.stream(integers1).map(a->a*5).forEach(System.out::println);
        System.out.println("___________________________________________");
        for (int i = 0; i < integers.length; i++) {
            integers1[i] *= 5;
            System.out.println(integers1[i]);
        }
        System.out.println("_________________________________________");
        List <Integer> integers2=new ArrayList<>();
        integers2.add(-1);
        integers2.add(0);
        integers2.add(3);
        integers2.stream().filter(a->a>0).forEach(System.out::println);
        integers2.stream().min(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
       });


        List<User>users=new ArrayList<>();
        users.add(new User("Aigerim",2007));
        users.add(new User("Aidana",2006));
        users.add(new User("Adinai",2008));
        users.add(new User("Aichurok",1998));
        users.add(new User("Aimurok",1999));



        List<Integer> ages =  users.stream().map(f -> 2023- f.getAge()).toList();
        System.out.println(ages);
        ages.stream().forEach(System.out::println);


        System.out.println(ages.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }));
        System.out.println(ages.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }));

        List<String>srings=ages.stream().map(a->a > 18 ? "Жашы жеткен"+a :"Жашы жете элек"+a).toList();
        System.out.println(srings);
        System.out.println(ages.stream().filter(d -> d < 18).count());
        users.stream().filter(o->o.getName().toLowerCase().startsWith("a")).forEach(System.out::println);

    }
}