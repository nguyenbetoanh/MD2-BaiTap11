import java.util.*;

public class Main {
    public static void main(String[] args) {
        String st1 = "Hom qua noi qua ma khong qua Hom nay noi khong qua ma lai qua";
        String[] arrSt = st1.split(" ");
        //        đây in ra các chữ có trong chỗi theo sp xếp của set
        Set<String> setSt = new HashSet<>();
        for (String s : arrSt) {
            setSt.add(s);
        }
//sắp xếp lại theo aray
        List<String> stList = new ArrayList<>();
        List<Integer> listCnt = new ArrayList<>();
        for (String st : arrSt) {
            if (!stList.contains(st)) {
                stList.add(st);
                listCnt.add(1);
            } else {
                int index = stList.indexOf(st);
                int count = listCnt.get(index);
                count++;
                listCnt.set(index, count);
            }
        }
        System.out.println("các từ có trong chuỗi list  là: " + stList);
        System.out.println("các từ lặp lại số lần là         : "+listCnt);
    }
}