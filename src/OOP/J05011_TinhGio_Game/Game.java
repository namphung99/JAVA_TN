/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05011_TinhGio_Game;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class Game implements Comparable<Game>{
    private String ma,hoTen;
    private Date start,end;

    public Game(String ma, String hoTen, String start, String end) throws ParseException {
        this.ma = ma;
        this.hoTen = hoTen;
        this.start = new SimpleDateFormat("hh:mm").parse(start);
        this.end = new SimpleDateFormat("hh:mm").parse(end);
    }
    private String caculate(){
        long tDiff = this.end.getTime()-this.start.getTime();
        tDiff /= 1000;
        int h = (int) (tDiff/3600);
        int m = (int) ((tDiff % 3600)/60);
        return h+" gio "+m+" phut";
    }
    public int compareTo(Game o) {
        return (int) ((o.end.getTime()-o.start.getTime()) - (this.end.getTime()-this.start.getTime()));
    }

    public String toString() {
        return ma+" "+hoTen+" "+caculate();
    }
}
