/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Account;
import java.util.ArrayList;

/**
 *
 * @author NVS
 */
public interface IAccountService {

    ArrayList<Account> getList();

    Account getAccount(String username);

    boolean insert(Account account);

    boolean update(Account account);

    boolean delete(Account account);

    ArrayList<Account> findAccountByUsernameKey(String usernameKey);

    ArrayList<Account> findAccountByFullnameKey(String fullnameKey);

    ArrayList<Account> findAccountByDeleteflagKey(boolean deleteflag);

}
