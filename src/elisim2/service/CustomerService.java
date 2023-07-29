package elisim2.service;

import elisim2.config.CustomerConfig;
import elisim2.domain.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerService {

    public List<Customer> findAllCustomer(){

        return CustomerConfig.customers;
    }

    public Customer findCustomerByFincode(String fincode){
        for (int i = 0; i < CustomerConfig.customers.size(); i++) {
            if(CustomerConfig.customers.get(i).getFincode().equals(fincode)){
               return CustomerConfig.customers.get(i);

            }

        }
        return null;
    }

    public void deleteCustomerByFincode(String fincode){
        for (int i = 0; i < CustomerConfig.customers.size(); i++) {
            if(CustomerConfig.customers.get(i).getFincode().equals(fincode)){
                CustomerConfig.customers.remove(i);
            }

        }


        }
        public void creatCustomer(Customer customer){
        CustomerConfig.customers.add(customer);

        }
        public void upDateCustomer(String fincode){
        Customer customer=null;
            for (int i = 0; i < CustomerConfig.customers.size(); i++) {
                if (CustomerConfig.customers.get(i).getFincode().equals(fincode)){
                    customer=CustomerConfig.customers.get(i);
                    break;

                }

            }
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter new name:");
            String newName=sc.nextLine();
            customer.setName(newName);
        }


    }




