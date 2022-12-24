import java.util.ArrayList;

public class tugas {
    public static void main(String[] args) {
        ArrayList<int[]> Stopgo = new ArrayList<int[]>();
        Stopgo.add(new int[]{10,0});
        Stopgo.add(new int[]{3,5});
        Stopgo.add(new int[]{2,5});

        System.out.println(getPassenger(Stopgo));

    }
    // DISINI SAYAA MENCOBA MENGUNAKAN FOR EACH namun hasil masi salah dan saya masih bingung di for each
    public static int getPassenger(ArrayList<int[]>biskota){
        int result= 0;
        for (int[] bus:biskota){
            result += bus[1];
        }
        return result;

    }

    }


