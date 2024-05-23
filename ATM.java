
			
import java.util.Scanner;
import java.util.*;
import java.lang.*;


			
			class Account {

				int amount = 10000;
			
				void deposit(int depositAmount) {
					
					amount +=  depositAmount;
					System.out.println("Deposited");

				}
				void withdraw(int withdrawAmount) {

					amount -= withdrawAmount;
					System.out.println("Withdraw");

				}
				void availableAmount() {
					System.out.println("availableAmount"+amount);
				}
				
			}
			class Transactions {
				Account mAccout;
				
				Transactions(Account accout) {
					this.mAccout = accout;
				}
				
				void showOptions() {
					System.out.println("1.Deposit");
					System.out.println("2.withdraw");
					System.out.println("3.CheckBalance");
					Scanner sc = new Scanner(System.in);
					String name = sc.nextLine();
					if(name.equals("1")) {
						mAccout.deposit(1000);
					} else if(name.equals("2")) {
						mAccout.withdraw(3000);
					} else {
						mAccout.availableAmount();
					}

					userNavigation();
				}

				void userNavigation() {
					System.out.println("Do you want continue?. Type yes or no.");
					Scanner sc = new Scanner(System.in);
					String name = sc.nextLine();
					if(name.equals("yes")) {
						showOptions();
					} else {
						System.out.println("exit");
                		System.exit(0);
					}


				}
			}
			class ATM {
				
				public static void main(String[] args) {
					    Transactions my = new Transactions(new Account());
					    my.showOptions();
				}
			}