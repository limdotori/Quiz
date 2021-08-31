package quiz03;

public class Account {
String name;
String password;
int balance;

	Account(){ 
 		}
 	
	Account(String pName,String pPassword,int pBalance){
 		name=pName;
 		password=pPassword;
 		balance=pBalance;
 		}
 	
 	void deposit(int a) {
 		balance+=a;	
 		}
 	void withDraw(int b) {
 		balance-=b;
 	}
 	int getBalance() {
 		return balance;
 	}
	}
