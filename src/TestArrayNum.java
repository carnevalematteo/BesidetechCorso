import java.util.Arrays;

public class TestArrayNum {

    public static void main(String[] args) {

        UtilityMethods utilityMethods=new UtilityMethods();

        int[] result = utilityMethods.riempiArray(10);

        System.out.println(Arrays.toString(result));

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

        for(int numero : result){
            System.out.println(numero);
        }

    }
}
