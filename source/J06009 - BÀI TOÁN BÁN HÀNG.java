import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

class Customer {
    private String ID, name, sex, birth, address;

    public Customer(int iD, String name, String sex, String birth, String address) {
        this.ID = "KH" + String.format("%03d", iD);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

}

class Item {
    private String code, nameMH, init;
    private Long buy, pass;

    public Item(int code, String nameMH, String init, Long buy, Long pass) {
        this.code = "MH" + String.format("%03d", code);
        this.nameMH = nameMH;
        this.init = init;
        this.buy = buy;
        this.pass = pass;
    }

    public String getCode() {
        return code;
    }

    public String getNameMH() {
        return nameMH;
    }

    public String getInit() {
        return init;
    }

    public Long getBuy() {
        return buy;
    }

    public Long getPass() {
        return pass;
    }

}

class Invoice {
    private String idMH;
    private Customer customer;
    private Item item;
    private long quantity;

    public Invoice(int idMH, Customer customer, Item item, long quantity) {
        this.idMH = "HD" + String.format("%03d", idMH);
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    public Long getTotal() {
        return this.quantity * this.item.getPass();
    }

    public String toString() {
        return this.idMH + " " + this.customer.getName() + " " + this.customer.getAddress() + " "
                + this.item.getNameMH() + " " + this.item.getInit() + " " + this.item.getBuy() + " "
                + this.item.getPass() + " " + this.quantity + " " + this.getTotal();
    }
}

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("KH.in"));
            Map<String, Customer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                Customer a = new Customer(i, br.readLine(), br.readLine(), br.readLine(), br.readLine());
                map.put(a.getID(), a);
            }
            BufferedReader br1 = new BufferedReader(new FileReader("MH.in"));
            int m = Integer.parseInt(br1.readLine());
            Map<String, Item> mp = new HashMap<>();
            for (int i = 1; i <= m; i++) {
                Item a = new Item(i, br1.readLine(), br1.readLine(), Long.parseLong(br1.readLine()),
                        Long.parseLong(br1.readLine()));
                mp.put(a.getCode(), a);
            }
            ArrayList<Invoice> arr = new ArrayList<>();
            BufferedReader br2 = new BufferedReader(new FileReader("HD.in"));
            int p = Integer.parseInt(br2.readLine());
            for (int i = 1; i <= p; i++) {
                String s = br2.readLine();
                String[] a = s.trim().split("\\s+");
                Invoice temp = new Invoice(i, map.get(a[0]), mp.get(a[1]), Long.parseLong(a[2]));
                arr.add(temp);
            }
            for (Invoice x : arr) {
                System.out.println(x);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
