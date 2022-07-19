import java.util.*;

public class TN06_Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> listResult = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String s = sc.nextLine();
            s = s.trim();
            StringTokenizer stk = new StringTokenizer(s," ");
            List<String> listStr = new ArrayList<>();
            while(stk.hasMoreTokens()){
                listStr.add(stk.nextToken());
            }
            StringBuilder result = new StringBuilder("");
            for(int j = 0; j < listStr.get(listStr.size()-1).length(); j++){
                char z = listStr.get(listStr.size()-1).charAt(j);
                if(z >= 'A' && z <= 'Z'){
                    z += 32;
                }
                result.append(z);
            }
            for(int j = 0; j < listStr.size()-1; j++){
                char z = listStr.get(j).charAt(0);
                if(z >= 'A' && z <= 'Z'){
                    z += 32;
                }
                result.append(z);
            }
            String temp = result.toString();
            if(listResult.contains(temp)){
                result.append(map.get(result.toString())+1);
                map.put(temp,map.get(temp)+1);
            }else{
                listResult.add(result.toString());
                map.put(result.toString(), 1);
            }
            result.append("@ptit.edu.vn");
            System.out.println(result);
        }
    }
}

