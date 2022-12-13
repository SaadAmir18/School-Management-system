import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Oop {

    private int a=12;

    public int getA() {
        return a;
    }

    static void loopArray(String Lname) {
        String name[][] = {{"saad", "bilal", "zaid"}, {"hamza", "saim", "akhtar"}};

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.println(name[i][j] + " " + Lname);


            }
        }
    }

//    public int para(int x,int y) {
//       return x-y;
//
//    }
//
//    public double para(double g,double h) {
//        return g-h;
//
//    }
//
//    double id;
//    double van;
//    public Oop(int i,double v){
//
//        id=i+v;
//
//    }
//
//    public Oop(int i,double v,int j){
//
//        van=v+i+j;
//
//
//    }
//    public void show(){
//        System.out.println("employee with Id number" + " " +id+ " "+ " will go in Van with Id"+ " "+ van);
//    }

    public void theArray() {
        int array[] = new int[5];
        array[0] = 12;
        array[1] = 62;
        array[2] = 52;
        array[3] = 42;
        array[4] = 2;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

    public static void collection() {

        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("Karachi", 100);
        newMap.put("Islamabad", 436);
        newMap.put("lahore", 436);
        newMap.put("Faisalabad", 1685);
        ArrayList<Integer> a = new ArrayList<>();
        newMap.forEach((s, integer) -> {
            a.add(integer);
        });


        System.out.println(newMap);

        if (newMap.containsKey("Karachi")) {

            System.out.println("city is in the list");

        } else {
            System.out.println("city not in the list");
        }

        System.out.println(newMap.get("Karachi"));
        System.out.println(newMap.get("peshawar"));

        for (Map.Entry<String,Integer> e : newMap.entrySet()){

            System.out.print(e.getKey()+ " ");

            System.out.println(e.getValue());


        }
    }

    public static void newFor(){
        int [] arr={3,4,5,6};


        for(int val:arr){

            System.out.print(val+ " ");


        }

        System.out.println();



    }


}