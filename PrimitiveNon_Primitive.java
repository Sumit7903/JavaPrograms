
public class PrimitiveNon_Primitive {
    public static void main(String[] args) {
        //Primitive
        int age = 18;
        float height = 5.5f;
        char grade = 'a';
        boolean isEligible = true;

        //Non-Primitive
        int[] marks = {90,85,95};
        String name = "sumit";

        //Display
        System.out.println("Age:"+age);
        System.out.println("Height:"+height);
        System.out.println("Grade:"+grade);
        System.out.println("IsEligible:"+isEligible);
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Name:"+name);
    }
}