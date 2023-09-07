import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<String> comps = new ArrayList<>();

    public Shop(String compName){
        this.comps.add(compName);
    }

    public void addComp(String compName){
        this.comps.add(compName);
    }

    public void addComps(){
        System.out.print("Enter number of computers you want to enter: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String temp;
        System.out.print("Enter names of computers: ");
        for (int i = 0; i < n; i++){
            temp = scanner.nextLine();
            addComp(temp);
        }
    }

    public boolean findComp(String compName){
        for (int i = 0; i < comps.size(); i++){
            if (comps.get(i).equals(compName)){
                return true;
            }
        }
        return false;
    }
}
