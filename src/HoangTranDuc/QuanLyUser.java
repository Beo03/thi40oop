/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
import java.util.ArrayList;
import java.util.List;

public class QuanLyUser {

    private final List<User> accounts;

    public QuanLyUser() {
        accounts = new ArrayList<>();
    }

    public void register(User account) {
        accounts.add(account);
    }

    public boolean login(String username, String password) {
        for (User account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public User getAccount(String username) {
        for (User account : accounts) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        return null;
    }
}
