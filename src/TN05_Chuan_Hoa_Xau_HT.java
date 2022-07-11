/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class TN05_Chuan_Hoa_Xau_HT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            System.out.println(chuanHoa(in.nextLine()));
        }
    }
    
    public static String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens()){
            String tmp =st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i =1; i<tmp.length();i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
