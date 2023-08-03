import java.util.*;

public class qutsion {
    public static void main(String[] args){

        String[] menu = {"burger","pizza","cold-drink","icecream","chowmin","pavbhaji"};
        double[] price ={15.5,100,40,25,50,50};

        Scanner sc = new Scanner(System.in);

        boolean d = false;

        for(int i = 0;i<menu.length;i++){
            System.out.print(menu[i]+" ");
        }

        ArrayList<String> order=new ArrayList<>();
        boolean x=true;
        while(x){
            String t=sc.nextLine();
            order.add(t);
            if(t=="0"||t=="done") {
                x = false;
                System.out.println("break");
                break;
            }
            }


        System.out.println(order);
    }
}
