package elisim2;

import elisim2.domain.Customer;
import elisim2.service.CustomerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CustomerService customerService=new CustomerService();
        while (true){
            System.out.println("Select option: \n"+
                "1. Creat Customer \n"+
                "2. Find All Customer \n"+
                "3. Find Customer By Fincode \n"+
                "4. Delete Customer By Fincode \n"+
                "5. UpData Customer");

            Scanner sc=new Scanner(System.in);
            int menyu=sc.nextInt();

            if(menyu == 1){
                sc=new Scanner(System.in);
                String fincode= sc.nextLine();
                String name= sc.nextLine();
                String surname= sc.nextLine();
                String birthdata= sc.nextLine();
                String birthplace=sc.nextLine();

                Customer customer=new Customer();
                customer.setFincode(fincode);
                customer.setName(name);
                customer.setSurname(surname);
                customer.setBirthdate(birthdata);
                customer.setBirthplace(birthplace);

                customerService.creatCustomer(customer);

            } else if (menyu==2) {
                System.out.println( customerService.findAllCustomer());

            } else if (menyu==3) {
                sc=new Scanner(System.in);
                String fincode= sc.nextLine();
                System.out.println(  customerService.findCustomerByFincode(fincode));

            } else if (menyu==4) {
                sc=new Scanner(System.in);
                String fincode= sc.nextLine();
                customerService.deleteCustomerByFincode(fincode);

            } else if (menyu==5) {
                sc=new Scanner(System.in);
                String fincode= sc.nextLine();
                customerService.upDateCustomer(fincode);


            }


        }




}
}