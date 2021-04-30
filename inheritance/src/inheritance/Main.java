package inheritance;

public class Main {

	public static void main(String[] args) {
   IndividualCustomer engin = new IndividualCustomer();
   engin.CustomerNumber = "1646846";
   
   CorporateCustomer hepsiBurada = new CorporateCustomer();
   hepsiBurada.CustomerNumber = "4984651";		   
   SendikaCustomer abc = new SendikaCustomer();
   abc.CustomerNumber= "1651846";
   
	
   CustomerManager customerManager = new CustomerManager();
  	   customerManager.add(hepsiBurada);
  	   customerManager.add(engin);
	 Customer[] customers = {engin , abc, hepsiBurada };
	 
	 customerManager.addMultiple(customers);
	
	}

}

