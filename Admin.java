package com.fawzySystem.payment_service.user;

import com.fawzySystem.payment_service.payment.*;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Scanner;

public class Admin extends User {
    Payment p = new Cash();
    Discount d = new SpecDiscount(p);
    public Admin(String e,String p,String u) {
        this.email=e;
        this.password=p;
        this.username=u;
    }
    public Admin(){}

    public void showRefundRequests()
    {
        while(Refund.refunds.size()>0)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("[ ");
            for (int i = 0; i<Refund.refunds.size(); i++)
            {

                System.out.print((i+1) + "     " + Refund.refunds.get(i).getServiceName() + "   ");
                System.out.print(Refund.refunds.get(i).getAmount()+"    ");
                System.out.print(Refund.refunds.get(i).getUsername());

                System.out.print(" , ");
            }
            System.out.println("] ");

            System.out.println("Enter service index ");
            int ind = in.nextInt();

            System.out.println("Enter 0 to reject request ");
            System.out.println("Enter 1 to accept request ");
            int ac = in.nextInt();
            if (ac == 1)
            {
                System.out.println("refund transaction processed successfully");

            }
            else
            {
                System.out.println("Request refused");
            }
            Refund.refunds.remove(ind-1);



            System.out.println("Enter 1 to continue 0 to exit");

            int e = in.nextInt();
            if (e == 0)
            {
                System.out.println("[ ");
                for (int i = 0; i<Refund.refunds.size(); i++)
                {

                 System.out.print((i+1) + " " + Refund.refunds.get(i).getServiceName() + ' ');
                 System.out.print(Refund.refunds.get(i).getAmount());
                 System.out.print(" , ");
                }
                System.out.println(" ]");
                break;
            }
            else
            {
                continue;
            }


        }


    }
}
