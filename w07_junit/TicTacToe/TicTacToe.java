import java.util.*;
/**
 * TicTacToe
 */
public class TicTacToe {

    static ArrayList<Integer> m2ngijaK2igud = new ArrayList<Integer>();
    static ArrayList<Integer> cpuK2igud = new ArrayList<Integer>();

    public static void printM2nguV2li(char[][] m2nguV2li){
        for(char[] rida : m2nguV2li){
            for(char c : rida){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void teeK2ik(char[][] m2nguV2li, int pos, String kasutaja){
        char symbol = ' ';
        if(kasutaja.equals("m2ngija")){
            symbol = 'X';
            m2ngijaK2igud.add(pos);
        } else if(kasutaja.equals("CPU")){
            symbol = 'O';
            cpuK2igud.add(pos);
        }
        switch(pos) {
            case 1: 
                m2nguV2li[0][0] = symbol;
                break;
            case 2: 
                m2nguV2li[0][2] = symbol;
                break;
            case 3: 
                m2nguV2li[0][4] = symbol;
                break;
            case 4: 
                m2nguV2li[2][0] = symbol;
                break;
            case 5: 
                m2nguV2li[2][2] = symbol;
                break;
            case 6: 
                m2nguV2li[2][4] = symbol;
                break;
            case 7: 
                m2nguV2li[4][0] = symbol;
                break;
            case 8: 
                m2nguV2li[4][2] = symbol;
                break;
            case 9: 
                m2nguV2li[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkV6itja(){
        List rida1 = Arrays.asList(1, 2, 3);
        List rida2 = Arrays.asList(4, 5, 6);
        List rida3 = Arrays.asList(7, 8, 9);
        List veerg1 = Arrays.asList(1, 4, 7);
        List veerg2 = Arrays.asList(2, 5, 8);
        List veerg3 = Arrays.asList(3, 6, 9);
        List diag1 = Arrays.asList(1, 5, 9);
        List diag2 = Arrays.asList(3, 5, 7);

        List<List> v6idud = new ArrayList<List>();
        v6idud.add(rida1);
        v6idud.add(rida2);
        v6idud.add(rida3);
        v6idud.add(veerg1);
        v6idud.add(veerg2);
        v6idud.add(veerg3);
        v6idud.add(diag1);
        v6idud.add(diag2);

        for(List l : v6idud) {
            if(m2ngijaK2igud.containsAll(l)){
                return "Sinu võit!";
            }else if(cpuK2igud.containsAll(l)){
                return "Sina kaotasid!";
            }
            if(m2ngijaK2igud.size() + cpuK2igud.size() == 9){
                return "Viik!";
            }
        }

        return "";
    }

    public static void main(String[] args) {
        char[][] m2nguV2li = {{' ', '|', ' ', '|', ' '}, 
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}, 
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printM2nguV2li(m2nguV2li);

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Sisesta käik (1-9): ");
            int m2ngijaPos = scan.nextInt();
            while(m2ngijaK2igud.contains(m2ngijaPos) || cpuK2igud.contains(m2ngijaPos)){
                System.out.println("See koht on võetud, proovi uuesti!");
                m2ngijaPos = scan.nextInt();
            }
            //System.out.println(m2ngijaPos);
            teeK2ik(m2nguV2li, m2ngijaPos, "m2ngija");
            printM2nguV2li(m2nguV2li);

            String tulemus = checkV6itja();
            if(tulemus.length()> 0){
                System.out.println(tulemus);
                break;
            }            

            Random rand = new Random();
            int cpuPos = rand.nextInt(9)+1;
            while(m2ngijaK2igud.contains(cpuPos) || cpuK2igud.contains(cpuPos)){
                cpuPos = rand.nextInt(9)+1;
            }
            teeK2ik(m2nguV2li, cpuPos, "CPU");
            
            printM2nguV2li(m2nguV2li);
            tulemus = checkV6itja();
            if(tulemus.length()> 0){
                System.out.println(tulemus);
                break;
            }
       
        }
        
    }
}
