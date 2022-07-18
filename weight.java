import java.util.Scanner;
class convert
{
    void kg_gm(double w)
    {
        double c=w*1000;
        System.out.println("WEIGHT IN GRAM : "+c);
    }
    void kg_pound(double w)
    {
        double c=w*2.20462;
        System.out.println("WEIGHT IN POUNDS : "+c);
    }
    void kg_ounce(double w)
    {
        double c=w*35.274;
        System.out.println("WEIGHT IN POUNDS : "+c);
    }
}
public class weight {
    public static void main(String args[])
    {
        Scanner ab=new Scanner(System.in);
        convert obj=new convert();
        System.out.println("****************** WEIGHT CONVERTER ******************");
        System.out.println("PRESS\n 1.GRAM\n 2.POUND\n 3.OUNCE\n");
        System.out.println("ENTER YOUR CHOICE : ");
        int choice=ab.nextInt();
        System.out.println("ENTER WEIGHT IN KG : ");
        double we=ab.nextDouble();
        switch(choice)
        {
            case 1:obj.kg_gm(we);
            break;
            case 2: obj.kg_pound(we);
            break;
            case 3: obj.kg_ounce(we);
            break;
            default:System.out.println("WRONG CHOICE !! TRY AGAIN");
        }


    }
}
