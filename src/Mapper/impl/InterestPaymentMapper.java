/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper.impl;

import Mapper.IObjectMapper;
import Model.Customer;
import Model.InterestPayment;
import Model.PawnCoupon;
import Model.Product;
import Model.TypeOfProduct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NVS
 */
@SuppressWarnings("ClassWithoutLogger")
public class InterestPaymentMapper implements IObjectMapper<InterestPayment> {

    @Override
    public InterestPayment mapObject(ResultSet rs) {
        try {
            String id = rs.getString(1);
            Customer customer = new Customer(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));
            Product product = new Product(rs.getString(8), new TypeOfProduct(rs.getString(9), rs.getString(10), rs.getBoolean(11)), rs.getString(12), rs.getString(13), rs.getString(14));
            int amount = rs.getInt(15);
            int price = rs.getInt(16);
            float interestRate = rs.getFloat(17);
            String pawnDate = rs.getString(18);
            String redeemOrLiquidartionDate = rs.getString(19);
            int liquidationPrice = rs.getInt(20);
            String status = rs.getString(21);
            PawnCoupon pawnCoupon = new PawnCoupon(id, customer, product, amount, price, interestRate, pawnDate, redeemOrLiquidartionDate, liquidationPrice, status);
            int times = rs.getInt(22);
            String paymentDate = rs.getString(23);
            int money = rs.getInt(24);
            int debt = rs.getInt(25);
            String note = rs.getString(26);
            return new InterestPayment(pawnCoupon, times, paymentDate, money, debt, note);
        } catch (SQLException ex) {
            Logger.getLogger(AccountMapper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
