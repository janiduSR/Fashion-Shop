import java.util.*;
class Example{
	
	public static void main(String args[]){	
		homepage();
	}
	
	public static void homepage(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n");
		System.out.println("\t /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                          ");
		System.out.println("\t| $$_____/                | $$      |__/                           /$$__  $$| $$                          ");
		System.out.println("\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ ");
		System.out.println("\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$");
		System.out.println("\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$");
		System.out.println("\t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$");
		System.out.println("\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/");
		System.out.println("\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ ");
		System.out.println("\t                                                                                                | $$      ");
		System.out.println("\t                                                                                                | $$      ");
		System.out.println("\t                                                                                                |__/      ");
		System.out.println("\n\t-----------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		System.out.print("\t\t[1] Place Order \t\t\t\t\t[2] Search Customer");
		System.out.print("\n\n\t\t[3] Search Order \t\t\t\t\t[4] View Reports");
		System.out.print("\n\n\t\t[5] Set Order Status \t\t\t\t\t[6] Delete Order");
		System.out.println("\n\n");
		
		System.out.print("\n\tInput Option : ");
		int option1=input.nextInt();
		switch(option1){
			case 1:clearConsole();
				   placeOrder();
				   break;
			case 2:clearConsole();
				   searchCustomer();
				   break;
			case 3:clearConsole();
			       searchOrder();
			       break;
			case 4:clearConsole();
				   viewReports();
				   break;
			case 5:clearConsole();
				   setOrderStatus();
				   break;
			case 6:clearConsole();
				   deleteOrder();
				   break;
			default:clearConsole();
					homepage();
					break;
		}		
	}
	
	public static void placeOrder(){
		Scanner input=new Scanner(System.in);

		
		System.out.println("\t\t  _____  _                   ____          _           ");
		System.out.println("\t\t |  __ \\| |                 / __ \\        | |          ");
		System.out.println("\t\t | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ ");
		System.out.println("\t\t |  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|");
		System.out.println("\t\t | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   ");
		System.out.println("\t\t |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   ");
		System.out.println("\n\t\t ------------------------------------------------------");
		

		String orderId=generateID();
		System.out.println("\n\tOrderID :"+orderId);
		orderIdArray = extendArray6(orderIdArray, orderId);
		String phoneNumber="";
	L1 :while(true){
			System.out.print("\n\tEnter Customer Phone Number : ");
			phoneNumber=input.next();
			if(phoneNumber.charAt(0)!='0' || phoneNumber.length()!=10){
				System.out.println("\n\t\tInvalid Phone number.. Try again");
				continue L1;
			}else{
				break;
			}
		}
	   int qty=0;
	   double value=0;
	   String size="";
	while(true){
			System.out.print("\n\tEnter T-shirt Size (XS/S/M/L/XL/XXL) : ");
			size=input.next();
			
			switch(size.toUpperCase()){
				case "XS" : value=600;break ;
				case "S"  : value=800;break ;
				case "M"  : value=900;break ;
				case "L"  : value=1000;break ;
				case "XL" : value=1100;break ;
				case "XXL": value=1200;break ;
				default   : System.out.println("\n\t\t\tIncorrect size...");continue ; 	
			}
		
		
		System.out.print("\n\tEnter QTY : ");	
		qty=input.nextInt();
		
		switch(size.toUpperCase()){
			case "XS":xsArray = extendArray7(xsArray, qty);break;
			case "S":sArray = extendArray8(sArray, qty);break;
			case "M":mArray = extendArray9(mArray, qty);break;
			case "L":lArray = extendArray10(lArray, qty);break;
			case "XL":xlArray = extendArray11(xlArray, qty);break;
			case "XXL":xxlArray = extendArray12(xxlArray, qty);break;
		}
		break;
	}
		if(qty<=0){
		System.out.println("\n\t\tInvalid input..try again");
		clearConsole();
		placeOrder();
		}
		double amount=value*qty;
		System.out.println("\n\tAmount : "+amount);
		
		System.out.print("\n\n\tDo you want to place this order? (y/n) : ");
		char ch1=input.next().charAt(0);
		if(ch1=='y' || ch1=='Y'){
			incrementID();
			
			sizeArray=extendArray2(sizeArray,size);
			qtyArray=extendArray3(qtyArray,qty);
			amountArray=extendArray4(amountArray,amount);
			phoneArray=extendArray1(phoneArray,phoneNumber);	
			statusArray = extendArray5(statusArray, PROCESSING);
				
			System.out.println("\n\t\tOrder Placed..!");		
			
			System.out.print("\n\tDo you want to place another order? (y/n) : ");
			char ch2=input.next().charAt(0);
			if(ch2=='y' || ch2=='Y'){
				clearConsole();
				placeOrder();
			}else if(ch2=='n' || ch2=='N'){
				clearConsole();
				homepage();
				return;
			}			
		}else if(ch1=='n' || ch1=='N'){
			clearConsole();
			homepage();
			return;
		}
	}
	
	
	
    public static void incrementID() {
        lastId++;
    }
			
    public static String generateID() {
        return String.format("ODR#%05d",lastId);
    }			

	public static int lastId = 1;
	
	
	
    public static String[] extendArray1(String[] phoneArray,String phoneNumber) {
		String[] tempArray1=new String[phoneArray.length+1];
		for(int i=0; i<phoneArray.length; i++){
			tempArray1[i]=phoneArray[i];
		}
		tempArray1[phoneArray.length]=phoneNumber;
        return tempArray1;
    }	
     
    public static String[] extendArray2(String[] sizeArray,String size) {
		String[] tempArray2=new String[sizeArray.length+1];
		for(int i=0; i<sizeArray.length; i++){
			tempArray2[i]=sizeArray[i];
		}
		tempArray2[sizeArray.length]=size;
        return tempArray2;
    }	  
    
 
     public static int[] extendArray3(int[] qtyArray,int qty) {
		int[] tempArray3=new int[qtyArray.length+1];
		for(int i=0; i<qtyArray.length; i++){
			tempArray3[i]=qtyArray[i];
		}
		tempArray3[qtyArray.length]=qty;
        return tempArray3;
    }  
    
     public static double[] extendArray4(double[] amountArray,double amount) {
		double[] tempArray4=new double[amountArray.length+1];
		for(int i=0; i<amountArray.length; i++){
			tempArray4[i]=amountArray[i];
		}
		tempArray4[amountArray.length]=amount;
        return tempArray4;
    }       
    
	public static int[] extendArray5(int[] statusArray, int status) {
		int[] tempArray5 = new int[statusArray.length+1];
		for (int i=0; i<statusArray.length; i++) {
			tempArray5[i] = statusArray[i];
		}
		tempArray5[statusArray.length] = status;  
		return tempArray5;
	}   
    
	public static String[] extendArray6(String[] orderIdArray, String orderId) {
		String[] tempArray6 = new String[orderIdArray.length+1];
		for (int i=0; i<orderIdArray.length; i++) {
			tempArray6[i] = orderIdArray[i];
		}
		tempArray6[orderIdArray.length] = orderId;
		return tempArray6;
	}
	
	
	
//---------------------------------------

	public static int[] extendArray7(int[] xsArray, int size) {
		int[] tempArray7 = new int[xsArray.length+1];
		for (int i=0; i<xsArray.length; i++) {
			tempArray7[i] = xsArray[i];
		}
		tempArray7[xsArray.length] = size;  
		return tempArray7;
	} 	
	
	public static int[] extendArray8(int[] sArray, int size) {
		int[] tempArray8 = new int[sArray.length+1];
		for (int i=0; i<sArray.length; i++) {
			tempArray8[i] = sArray[i];
		}
		tempArray8[sArray.length] = size;  
		return tempArray8;
	} 
	
	public static int[] extendArray9(int[] mArray, int size) {
		int[] tempArray9 = new int[mArray.length+1];
		for (int i=0; i<mArray.length; i++) {
			tempArray9[i] = mArray[i];
		}
		tempArray9[mArray.length] = size;  
		return tempArray9;
	} 
	
	public static int[] extendArray10(int[] lArray, int size) {
		int[] tempArray10 = new int[lArray.length+1];
		for (int i=0; i<lArray.length; i++) {
			tempArray10[i] = lArray[i];
		}
		tempArray10[lArray.length] = size;  
		return tempArray10;
	} 			
	
	public static int[] extendArray11(int[] xlArray, int size) {
		int[] tempArray11 = new int[xlArray.length+1];
		for (int i=0; i<xlArray.length; i++) {
			tempArray11[i] = xlArray[i];
		}
		tempArray11[xlArray.length] = size;  
		return tempArray11;
	} 	
	
	public static int[] extendArray12(int[] xxlArray, int size) {
		int[] tempArray12 = new int[xxlArray.length+1];
		for (int i=0; i<xxlArray.length; i++) {
			tempArray12[i] = xxlArray[i];
		}
		tempArray12[xxlArray.length] = size;  
		return tempArray12;
	} 	
		

	public static void searchCustomer(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t   _____                     _        _____          _                            ");
		System.out.println("\t  / ____|                   | |      / ____|        | |                           ");
		System.out.println("\t | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ");
		System.out.println("\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|");
		System.out.println("\t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   ");
		System.out.println("\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   ");
		System.out.println("\t ---------------------------------------------------------------------------------");
		System.out.println("\n\n");


		String phoneNumber2="";
	L1 :while(true){
			System.out.print("\n\tEnter Customer Phone Number : ");
			phoneNumber2=input.next();
			if(phoneNumber2.charAt(0)!='0' || phoneNumber2.length()!=10){
				System.out.println("\n\t\tInvalid input..");
				System.out.print("\n\tDo you want to search another customer? (y/n) : ");
				char ch3=input.next().charAt(0);
				if(ch3=='y' || ch3=='Y'){
					clearConsole();
					continue L1;
				}else if(ch3=='n' || ch3=='N'){
					break;
				}
			}else{
				break;
			}
		
		}
		boolean found = false;
		System.out.println("\n");
		System.out.println("\t\t\t+----------------------------------------------+");
		System.out.println("\t\t\t|   Size    |   QTY    |       Amount          |");
		System.out.println("\t\t\t+----------------------------------------------+");
		
		double total=0;
		for (int i=0; i<phoneArray.length; i++) {
			if (phoneArray[i].equals(phoneNumber2)) {
					found = true;
					System.out.println("\t\t\t|           |          |                       |");
					System.out.printf("\t\t\t|    %-6s |   %-6d |     %13.2f     |\n",sizeArray[i],qtyArray[i],amountArray[i]);
					total+=amountArray[i];
			}
		}
		System.out.println("\t\t\t|           |          |                       |");
		System.out.println("\t\t\t+----------------------------------------------+");
		System.out.printf("\t\t\t|  %16s    | %17.2f     |\n","Total Amount",total);
		System.out.println("\t\t\t+----------------------------------------------+");
		
		
		
		if (found==false) {
			System.out.println("\n\t\t\tInvalid Number...");
		}	
		System.out.print("\n\n\tDo you want to search another customer? (y/n) : ");
		char ch3=input.next().charAt(0);
			if(ch3=='y' || ch3=='Y'){
				clearConsole();
				searchCustomer();
				return;
			}else if(ch3=='n' || ch3=='N'){
				clearConsole();
				homepage();
				return;
			}		
			
	}



	
	public static void searchOrder(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t   _____                     _        ____          _           ");
		System.out.println("\t\t  / ____|                   | |      / __ \\        | |          ");
		System.out.println("\t\t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ ");
		System.out.println("\t\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|");
		System.out.println("\t\t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   ");
		System.out.println("\t\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|   ");
		System.out.println("\n\n");
		
		System.out.print("\tEnter order ID : ");
		String OrderID=input.nextLine();
		boolean found1 = false;
		for(int i=0; i<orderIdArray.length; i++){
			if(orderIdArray[i].equals(OrderID)){
				System.out.println("\n\n\tPhone Number   : "+phoneArray[i]);
				System.out.println("\tSize           : "+sizeArray[i]);
				System.out.println("\tQTY            : "+qtyArray[i]);
				System.out.println("\tAmount         : "+amountArray[i]);
				String currentStatus=getStatusString(statusArray[i]);
				System.out.println("\tStatus         :"+currentStatus);
				found1=true;
				System.out.print("\n\nDo you want to search another order? (y/n) : ");
				char ch4=input.next().charAt(0);
					if(ch4=='y' || ch4=='Y'){
						clearConsole();
						searchOrder();
						return;
					}else if(ch4=='n' || ch4=='N'){
						clearConsole();
						homepage();
						return;
					}				

				break;
			}
		}
		if(found1==false){
			System.out.println("\n\t\tInvalid ID..");
			System.out.print("\n\nDo you want to search another order? (y/n) : ");
			char ch4=input.next().charAt(0);
				if(ch4=='y' || ch4=='Y'){
					clearConsole();
					searchOrder();
					return;
				}else if(ch4=='n' || ch4=='N'){
					clearConsole();
					homepage();
					return;
				}				
			
		}
	}


	public static void deleteOrder(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t  _____       _      _          ____          _           ");
		System.out.println("\t\t |  __ \\     | |    | |        / __ \\        | |          ");
		System.out.println("\t\t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ ");
		System.out.println("\t\t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|");
		System.out.println("\t\t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   ");
		System.out.println("\t\t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   ");
		System.out.println("\t\t ----------------------------------------------------------");
		System.out.println("\n\n");
			
		
		System.out.print("\tEnter order ID : ");
		String OrderID=input.nextLine();
		boolean found1 = false;
		for(int i=0; i<orderIdArray.length; i++){
			if(orderIdArray[i].equals(OrderID)){
				System.out.println("\n\n\tPhone Number   : "+phoneArray[i]);
				System.out.println("\tSize           : "+sizeArray[i]);
				System.out.println("\tQTY            : "+qtyArray[i]);
				System.out.println("\tAmount         : "+amountArray[i]);
				System.out.println("\tStatus         :Delivering");
				found1=true;
				
				System.out.print("\n\tDo you want to delete this order? (y/n) : ");
				char ch6=input.next().charAt(0);
				if(ch6=='y' || ch6=='Y'){

				sizeArray=deleteArray1(sizeArray,i);
				qtyArray=deleteArray2(qtyArray,i);
				amountArray=deleteArray3(amountArray,i);
				phoneArray=deleteArray4(phoneArray,i);	
				statusArray = deleteArray5(statusArray,i);	
				orderIdArray=deleteArray6(orderIdArray,i);
				
				
				System.out.println("\n\t\tOrder Deleted..!");							
				
			}
				
				System.out.print("\n\n\tDo you want to delete another order? (y/n) : ");
				char ch5=input.next().charAt(0);
					if(ch5=='y' || ch5=='Y'){
						clearConsole();
						deleteOrder();
						return;
					}else if(ch5=='n' || ch5=='N'){
						clearConsole();
						homepage();
						return;
					}				

				break;
			}
		}
		if(found1==false){
			System.out.println("\n\t\tInvalid ID..");
			System.out.print("\n\nDo you want to delete another order? (y/n) : ");
			char ch4=input.next().charAt(0);
				if(ch4=='y' || ch4=='Y'){
					clearConsole();
					searchOrder();
					return;
				}else if(ch4=='n' || ch4=='N'){
					clearConsole();
					homepage();
					return;
				}				
			
			}		
		}
		
		

    public static String[] deleteArray1(String[] sizeArray,int j) {
		String[] tempArray1=new String[sizeArray.length-1];
		for(int i=0,k=0; i<sizeArray.length; i++){
			if(i==j){
				continue;
			}
			tempArray1[k++]=sizeArray[i];
		}
       return tempArray1;
    }
     
	
    
    public static int[] deleteArray2(int[] qtyArray,int j) {
		int[] tempArray2=new int[qtyArray.length-1];
		for(int i=0,k=0; i<qtyArray.length; i++){
			if(i==j){
				continue;
			}
			tempArray2[k++]=qtyArray[i];
		}
        return tempArray2;
    }
    
	

    public static double[] deleteArray3(double[] amountArray,int j) {
		double[] tempArray3=new double[amountArray.length-1];
		for(int i=0,k=0; i<amountArray.length; i++){
			if(i==j){
				continue;
			}
			tempArray3[k++]=amountArray[i];
		}
        return tempArray3;
    }
    
	

    public static String[] deleteArray4(String[] phoneArray,int j) {
		String[] tempArray4=new String[phoneArray.length-1];
		for(int i=0,k=0; i<phoneArray.length; i++){
			if(i==j){
				continue;
			}
			tempArray4[k++]=phoneArray[i];
		}
      return tempArray4;
    }
      
	


    public static int[] deleteArray5(int[] statusArray,int j) {
		int[] tempArray5=new int[statusArray.length-1];
		for(int i=0,k=0; i<statusArray.length; i++){
			if(i==j){
				continue;
			}
			tempArray5[k++]=statusArray[i];
		}
        return tempArray5;
    }
    
    public static String[] deleteArray6(String[] orderIdArray,int j) {
		String[] tempArray6=new String[orderIdArray.length-1];
		for(int i=0,k=0; i<orderIdArray.length; i++){
			if(i==j){
				continue;
			}
			tempArray6[k++]=orderIdArray[i];
		}
       return tempArray6;
    }
    
    
    	
	
	public static void viewReports(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("\t  _____                       _       ");
		System.out.println("\t |  __ \\                     | |      ");
		System.out.println("\t | |__) |___ _ __   ___  _ __| |_ ___ ");
		System.out.println("\t |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
		System.out.println("\t | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
		System.out.println("\t |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
		System.out.println("\t            | |                       ");
		System.out.println("\t            |_|                       ");
		System.out.println("\t --------------------------------------");
		
		System.out.println("\n\n\t\t[1] Customer Reports");
		System.out.println("\n\t\t[2] Item Repots");
		System.out.println("\n\t\t[3] Orders Reports");
		System.out.print("\n\n\t Enter option : ");
		int option2=input.nextInt();
		
		switch(option2){
			case 1: clearConsole();
					customerReports();
					break;
			case 2: clearConsole();
					itemReports();
					break;
			case 3: clearConsole();
					ordersReports();
					break;
			default:System.out.println("\n\t\tInvalid option...");
					System.out.print("\n\t\tDo you want to try again? (y/n) : ");
					char ch7=input.next().charAt(0);
					if(ch7=='y' || ch7=='Y'){
						clearConsole();
						viewReports();
						break;
					}else{
						clearConsole();
						homepage();
						break;	
					}
			}
	}
		
	public static void customerReports(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t   _____          _                              _____                       _       ");
		System.out.println("\t  / ____|        | |                            |  __ \\                     | |      ");
		System.out.println("\t | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ ");
		System.out.println("\t | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
		System.out.println("\t | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
		System.out.println("\t  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
		System.out.println("\t                                                           | |                       ");
		System.out.println("\t                                                           |_|                       ");
		System.out.println("\t -------------------------------------------------------------------------------------");
		System.out.println("\n\n\t\t[1] Best in Customers");
		System.out.println("\n\t\t[2] View Customers");
		System.out.println("\n\t\t[3] All Customer Report");
		System.out.print("\n\n\tEnter option : ");
		int option3=input.nextInt();
		
		switch(option3){
			case 1: clearConsole();bestCustomer();break;
			case 2: clearConsole();viewCustomer();break;
			case 3: clearConsole();allCustomers();break;
			default:System.out.println("\n\t\tInvalid option...try again");
					try{Thread.sleep(3000);}catch(Exception ex){}
					clearConsole();customerReports();break;
		}
	}
	
	
	
	public static void bestCustomer(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t  ____            _     _____          _____          _                                ");
		System.out.println("\t |  _ \\          | |   |_   _|        / ____|        | |                               ");
		System.out.println("\t | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ ");
		System.out.println("\t |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|");
		System.out.println("\t | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\");
		System.out.println("\t |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/");
		System.out.println("\t---------------------------------------------------------------------------------------");
		
		System.out.println("\n");
		System.out.println("\t\t\t+----------------------------------------------------------+");
		System.out.println("\t\t\t|   Customer ID          |  All QTY    |  Total Amount     |");
		System.out.println("\t\t\t+----------------------------------------------------------+");

		String[] customerIDs=new String[phoneArray.length];
		int[] totalQuantities = new int[phoneArray.length];
		double[] totalAmounts = new double[phoneArray.length];
		boolean[] processed = new boolean[phoneArray.length];
		int uniqueCustomerCount = 0;



		for(int i=0; i<phoneArray.length; i++){
			if (phoneArray[i] != null && !processed[i]){
			String currentCustID=phoneArray[i];
			double totalAmount=amountArray[i];
			int totalQty=qtyArray[i];
			for(int j=i+1; j<phoneArray.length; j++){
				if(phoneArray[j]!=null && phoneArray[j].equals(currentCustID)){
					totalAmount+=amountArray[j];
					totalQty+=qtyArray[j];
					processed[j]=true;	
				}	
			}	
		
			customerIDs[uniqueCustomerCount] = currentCustID;
            totalQuantities[uniqueCustomerCount] = totalQty;
            totalAmounts[uniqueCustomerCount] = totalAmount;
            uniqueCustomerCount++;
            
            
		}
	} 
	for(int i=0; i<uniqueCustomerCount-1; i++){
		for(int j=0; j<uniqueCustomerCount-i-1; j++){
			if(totalAmounts[j]<totalAmounts[j+1]){
				double tempAmount=totalAmounts[j];
                totalAmounts[j]=totalAmounts[j+1];
                totalAmounts[j+1]=tempAmount;
                
                int tempQty=totalQuantities[j];
                totalQuantities[j]=totalQuantities[j+1];
                totalQuantities[j+1]=tempQty;                
				
                String tempID=customerIDs[j];
                customerIDs[j]=customerIDs[j+1];
                customerIDs[j+1]=tempID;
                
			}
		}
	}				
	
		for(int i=0; i<uniqueCustomerCount; i++){
		if(customerIDs[i]!=null){
		System.out.printf("\t\t\t|    %-14s      |    %-4d     |    %-11.2f    |\n", customerIDs[i], totalQuantities[i], totalAmounts[i]);	
		}
	}
	System.out.println("\t\t\t+----------------------------------------------------------+");
	
	do{
	System.out.print("\n\n\tTo access the Main Menu,please enter 0 : ");
	int option4=input.nextInt();
	if(option4==0){
		clearConsole();
		homepage();
		break;
	}else{
		clearConsole();
		bestCustomer();
		continue;
	}
	}while(true);

	}
			
	
		
		
		public static void viewCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\t __      ___                  _____          _                                ");
		System.out.println("\t \\ \\    / (_)                / ____|        | |                               ");
		System.out.println("\t  \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ ");
		System.out.println("\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|");
		System.out.println("\t    \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\");
		System.out.println("\t     \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/");
		System.out.println("\t---------------------------------------------------------------------------------------");

		System.out.println("\n");
		System.out.println("\t\t\t+----------------------------------------------------------+");
		System.out.println("\t\t\t|   Customer ID          |  All QTY    |  Total Amount     |");
		System.out.println("\t\t\t+----------------------------------------------------------+");
		
		String[] customerIDs = new String[phoneArray.length];
		int[] totalQuantities = new int[phoneArray.length];
		double[] totalAmounts = new double[phoneArray.length];
		boolean[] processed = new boolean[phoneArray.length];		
		int uniqueCustomerCount = 0;
		
		
		
		for (int i=0; i<phoneArray.length; i++) {
			if (phoneArray[i]!=null && !processed[i]) {
			String currentCustID=phoneArray[i];			
			double totalAmount=amountArray[i];
			int totalQty=qtyArray[i];
				
            for (int j = i + 1; j < phoneArray.length; j++) {
                if (phoneArray[j] != null && phoneArray[j].equals(currentCustID)) {
                    totalAmount += amountArray[j];
                    totalQty += qtyArray[j];
                    processed[j]=true;
                }
            }						
		
            customerIDs[uniqueCustomerCount] = currentCustID;
            totalQuantities[uniqueCustomerCount] = totalQty;
            totalAmounts[uniqueCustomerCount] = totalAmount;
            uniqueCustomerCount++;
		}
	}
	for(int i=0; i<uniqueCustomerCount; i++){
		if(customerIDs[i]!=null){
				System.out.printf("\t\t\t|    %-14s      |    %-4d     |    %-11.2f    |\n",customerIDs[i], totalQuantities[i], totalAmounts[i]);
			}
		}
	
		System.out.println("\t\t\t+----------------------------------------------------------+");
	
		do {
			System.out.print("\n\n\tTo access the Main Menu, please enter 0 : ");
			int option4 = input.nextInt();
			if (option4 == 0) {
				clearConsole();
				homepage();
				break;
			} else {
				clearConsole();
				bestCustomer();
				continue;
			}
		} while (true);
	}			
				
		
	public static void allCustomers(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t           _ _    _____          _                              _____                       _   ");
		System.out.println("\t     /\\   | | |  / ____|        | |                            |  __ \\                     | |  ");
		System.out.println("\t    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ");
		System.out.println("\t   / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __|");
		System.out.println("\t  / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_ ");
		System.out.println("\t /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|");
		System.out.println("\t                                                                          | |                   ");
		System.out.println("\t                                                                          |_|                   ");
		System.out.println("\t------------------------------------------------------------------------------------------------");
		
		System.out.println("\n\n\t\t+-------------------------------------------------------------------------+");
		System.out.println("\t\t|  Phone Number  |  XS  |  S   |  M   |  L   |  XL   |  XXL  |   Total    |");
		System.out.println("\t\t+-------------------------------------------------------------------------+");
		
		
	L3:	for(int i=0; i<phoneArray.length; i++){
			boolean isUnique=true;
			for(int j=0; j<i; j++){
				if(phoneArray[j].equals(phoneArray[i])){
					isUnique=false;
					break;
				}
			}
			if(isUnique){
				System.out.print("\t\t|  " + phoneArray[i] + "  |  ");
				
				
				int qtyXS = 0, qtyS = 0, qtyM = 0, qtyL = 0, qtyXL = 0, qtyXXL = 0;

				
				for(int k=0; k<phoneArray.length; k++){
					if(phoneArray[k].equals(phoneArray[i])){						
						qtyXS+=(k<xsArray.length) ? xsArray[k] : 0;
						qtyS+= (k<sArray.length) ? sArray[k] : 0;
						qtyM+= (k<mArray.length) ? mArray[k] : 0;
						qtyL+= (k<lArray.length) ? lArray[k] : 0;
						qtyXL+=(k<xlArray.length) ? xlArray[k]:0;
						qtyXXL+=(k<xxlArray.length) ? xxlArray[k]:0; 
					}
				}
                    
				int total = (qtyXS * 600) + (qtyS * 800) + (qtyM * 900) + (qtyL * 1000) + (qtyXL * 1100) + (qtyXXL * 1200);
						
				System.out.print(qtyXS + " | " + qtyS + " | " + qtyM + " | " + qtyL + " | " + qtyXL + " | " + qtyXXL + " | ");
				System.out.print(total + " |");
				System.out.println("");						

			}
		}
		System.out.println("\t\t+-------------------------------------------------------------------------+");
		
				do {
			System.out.print("\n\n\tTo access the Main Menu, please enter 0 : ");
			int option4 = input.nextInt();
			if (option4 == 0) {
				clearConsole();
				homepage();
				break;
			} else {
				clearConsole();
				bestCustomer();
				continue;
			}
		} while (true);
	}
	
				
		
	public static void itemReports(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t  _____ _                   _____                       _       ");
		System.out.println("\t |_   _| |                 |  __ \\                     | |      ");
		System.out.println("\t   | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ ___ ");
		System.out.println("\t   | | | __/ _ \\ '_ ` _ \\  |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
		System.out.println("\t  _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
		System.out.println("\t |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
		System.out.println("\t                                      | |                       ");
		System.out.println("\t                                      |_|                       ");
		System.out.println("\t----------------------------------------------------------------");
		System.out.println("\n\n\t\t[1]Best Selling Categories Sorted by QTY");
		System.out.println("\n\t\t[2]Best Selling Categories Sorted by Amount");
		System.out.print("\n\n\tEnter option: ");
		int option5=input.nextInt();
		
		switch(option5){
			case 1: clearConsole();sortedQTY();break;
			case 2: clearConsole();sortedAmount();break;
			default:System.out.print("\n\t\t\tInvalid option...retry!");
					try{Thread.sleep(2500);}catch(Exception ex){}
					clearConsole();itemReports();break;
		}
	}
	
	public static void sortedQTY(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t   _____            _           _   ____           ____ _________     __");
		System.out.println("\t  / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / /");
		System.out.println("\t | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ / ");
		System.out.println("\t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /  ");
		System.out.println("\t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |   ");
		System.out.println("\t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|   ");
		System.out.println("\t                                           __/ |                        ");
		System.out.println("\t                                          |___/                         ");
		System.out.println("\t------------------------------------------------------------------------");
		
	
		String tempSize2[]=new String[sizeArray.length];
		int tempQty2[]=new int[qtyArray.length];
		double tempTotalAmount[]=new double[amountArray.length];
		
		for(int i=0; i<qtyArray.length-1; i++){
			for(int j=0; j<qtyArray.length-1; j++){
				if(qtyArray[j]<qtyArray[j+1]){
					String P=orderIdArray[j];
					orderIdArray[j]=orderIdArray[j+1];
					orderIdArray[j+1]=P;
					
					String Q=phoneArray[j];
					phoneArray[j]=phoneArray[j+1];
					phoneArray[j+1]=Q;
					
					String R=sizeArray[j];
					sizeArray[j]=sizeArray[j+1];
					sizeArray[j+1]=R;
					
					int S=qtyArray[j];
					qtyArray[j]=qtyArray[j+1];
					qtyArray[j+1]=S;
					
					double T=amountArray[j];
					amountArray[j]=amountArray[j+1];
					amountArray[j+1]=T;
					
					int U=statusArray[j];
					statusArray[j]=statusArray[j+1];
					statusArray[j+1]=U;
				}
			}
		}
		
		//System.out.println(Arrays.toString(qtyArray));
		//System.out.println(Arrays.toString(sizeArray));
		//System.out.println(Arrays.toString(amountArray));
		
		System.out.println("\n\t\t\t+---------------------------------------+");
		System.out.println("\t\t\t|   Size   |   QTY   |   Total Amount   |");
		System.out.println("\t\t\t+---------------------------------------+");
		
		for(int i=0; i<qtyArray.length; i++){
			System.out.printf("\t\t\t|   %-6s |   %-5d |   %-13.2f  |\n", sizeArray[i], qtyArray[i], amountArray[i]);
			System.out.println("\t\t\t|          |         |                  |");
		}
		System.out.println("\t\t\t+---------------------------------------+");	
		
				do {
			System.out.print("\n\n\tTo access the Main Menu, please enter 0 : ");
			int option4 = input.nextInt();
			if (option4 == 0) {
				clearConsole();
				homepage();
				break;
			} else {
				clearConsole();
				bestCustomer();
				continue;
			}
		} while (true);		
		
	}
		
	
	public static void sortedAmount(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t   _____            _           _   ____                                               _   ");
		System.out.println("\t  / ____|          | |         | | |  _ \\            /\\                               | |  ");
		System.out.println("\t | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ ");
		System.out.println("\t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|");
		System.out.println("\t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ ");
		System.out.println("\t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|");
		System.out.println("\t                                           __/ |                                           ");
		System.out.println("\t                                          |___/                                            ");
		System.out.println("\t-------------------------------------------------------------------------------------------");
		
		String tempSize3[]=new String[sizeArray.length];
		int tempQty3[]=new int[qtyArray.length];
		double tempTotalAmount3[]=new double[amountArray.length];
		
		for(int i=0; i<amountArray.length-1; i++){
			for(int j=0; j<amountArray.length-1; j++){
				if(amountArray[j]<amountArray[j+1]){
					String P=orderIdArray[j];
					orderIdArray[j]=orderIdArray[j+1];
					orderIdArray[j+1]=P;
					
					String Q=phoneArray[j];
					phoneArray[j]=phoneArray[j+1];
					phoneArray[j+1]=Q;
					
					String R=sizeArray[j];
					sizeArray[j]=sizeArray[j+1];
					sizeArray[j+1]=R;
					
					int S=qtyArray[j];
					qtyArray[j]=qtyArray[j+1];
					qtyArray[j+1]=S;
					
					double T=amountArray[j];
					amountArray[j]=amountArray[j+1];
					amountArray[j+1]=T;
					
					int U=statusArray[j];
					statusArray[j]=statusArray[j+1];
					statusArray[j+1]=U;
				}
			}
		}
	
		System.out.println("\n\t\t\t+---------------------------------------+");
		System.out.println("\t\t\t|   Size   |   QTY   |   Total Amount   |");
		System.out.println("\t\t\t+---------------------------------------+");
		
		for(int i=0; i<qtyArray.length; i++){
			System.out.printf("\t\t\t|   %-6s |   %-5d |   %-13.2f  |\n", sizeArray[i], qtyArray[i], amountArray[i]);
			System.out.println("\t\t\t|          |         |                  |");
		}
		System.out.println("\t\t\t+---------------------------------------+");		
	
	
		
				do {
			System.out.print("\n\n\tTo access the Main Menu, please enter 0 : ");
			int option4 = input.nextInt();
			if (option4 == 0) {
				clearConsole();
				homepage();
				break;
			} else {
				clearConsole();
				bestCustomer();
				continue;
			}
		} while (true);				
		
	}
	
		
	public static void ordersReports(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t   ____          _             _____                       _       ");
		System.out.println("\t  / __ \\        | |           |  __ \\                     | |      ");
		System.out.println("\t | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ ");
		System.out.println("\t | |  | | '__/ _` |/ _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
		System.out.println("\t | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
		System.out.println("\t  \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
		System.out.println("\t                                         | |                       ");
		System.out.println("\t                                         |_|                       ");
		System.out.println("\t-------------------------------------------------------------------");
		
		System.out.println("\n\n\t\t[1] All Orders");
		System.out.println("\n\t\t[2] Orders By Amount");
		System.out.print("\n\n\tEnter option : ");
		int option6=input.nextInt();
		
		switch(option6){
			case 1: clearConsole();allOrders();break;
			case 2: clearConsole();orderByAmount();break;
			default:System.out.print("\n\n\t\tInvalid option...retry!");
					try{Thread.sleep(2500);}catch(Exception ex){}
					clearConsole();ordersReports();break;
					
		}
	}
	
	public static void allOrders(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t\t __      ___                  ____          _               ");
		System.out.println("\t\t \\ \\    / (_)                / __ \\        | |              ");
		System.out.println("\t\t  \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___ ");
		System.out.println("\t\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | '__/ _` |/ _ \\ '__/ __|");
		System.out.println("\t\t    \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\");
		System.out.println("\t\t     \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/");
		System.out.println("\t\t------------------------------------------------------------");
		System.out.println("\n\n");
		
		String tempOrderId4[]=new String[orderIdArray.length];
		String tempPhone4[]=new String[phoneArray.length];	
		String tempSize4[]=new String[sizeArray.length];
		int tempQty4[]=new int[qtyArray.length];
		double tempTotalAmount4[]=new double[amountArray.length];
		int tempStatus4[]=new int[statusArray.length];	
		
		
		for(int i=0; i<orderIdArray.length-1; i++){
			for(int j=0; j<orderIdArray.length-1-i; j++){
				
				String num1=extractNumericPart(orderIdArray[j]);
				String num2=extractNumericPart(orderIdArray[j+1]);

				if (isSmaller(num1, num2)){

					
					String P=orderIdArray[j];
					orderIdArray[j]=orderIdArray[j+1];
					orderIdArray[j+1]=P;
					
					String Q=phoneArray[j];
					phoneArray[j]=phoneArray[j+1];
					phoneArray[j+1]=Q;
					
					String R=sizeArray[j];
					sizeArray[j]=sizeArray[j+1];
					sizeArray[j+1]=R;
					
					int S=qtyArray[j];
					qtyArray[j]=qtyArray[j+1];
					qtyArray[j+1]=S;
					
					double T=amountArray[j];
					amountArray[j]=amountArray[j+1];
					amountArray[j+1]=T;
					
					int U=statusArray[j];
					statusArray[j]=statusArray[j+1];
					statusArray[j+1]=U;			

				}
			}
		}


		System.out.println("\n\t\t\t+-------------------------------------------------------------------------------+");
		System.out.println("\t\t\t|   Order ID   |   CustomerID   |   Size    |   QTY   |   Amount   |   Status   |");
		System.out.println("\t\t\t+-------------------------------------------------------------------------------+");
		
			for (int i = 0; i < qtyArray.length; i++) {
			System.out.printf("\t\t\t|   %-10s |   %-12s |   %-7s |  %-5d  |   %-8.2f |   %-8d |\n",orderIdArray[i], phoneArray[i], sizeArray[i], qtyArray[i], amountArray[i], statusArray[i]);
		}
		System.out.println("\t\t\t+-------------------------------------------------------------------------------+");
				
		
				do {
			System.out.print("\n\n\tTo access the Main Menu, please enter 0 : ");
			int option4 = input.nextInt();
			if (option4 == 0) {
				clearConsole();
				homepage();
				break;
			} else {
				clearConsole();
				bestCustomer();
				continue;
			}
		} while (true);			
				
	}

	

    public static String extractNumericPart(String id) {
        return id.substring(4);
    }
						
    public static boolean isSmaller(String num1, String num2) {
        for (int i=0; i<num1.length(); i++) {
            if (num1.charAt(i)<num2.charAt(i)) {
                return true;
            } else if (num1.charAt(i)>num2.charAt(i)) {
                return false;
            }
        }
        return false;
    }			

	public static void orderByAmount(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\t   ____          _                 ____                                               _   ");
		System.out.println("\t  / __ \\        | |               |  _ \\            /\\                               | |  ");
		System.out.println("\t | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ ");
		System.out.println("\t | |  | | '__/ _` |/ _ \\ '__/ __| |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|");
		System.out.println("\t | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ ");
		System.out.println("\t  \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|");
		System.out.println("\t                                          __/ |                                           ");
		System.out.println("\t                                         |___/                                            ");
		System.out.println("\t -------------------------------------------------------------------------------------------");
		System.out.println("\n\n");
		
		
		for(int i=0; i<amountArray.length-1; i++){
			for(int j=0; j<amountArray.length-1; j++){
				if(amountArray[j]<amountArray[j+1]){
					String P=orderIdArray[j];
					orderIdArray[j]=orderIdArray[j+1];
					orderIdArray[j+1]=P;
					
					String Q=phoneArray[j];
					phoneArray[j]=phoneArray[j+1];
					phoneArray[j+1]=Q;
					
					String R=sizeArray[j];
					sizeArray[j]=sizeArray[j+1];
					sizeArray[j+1]=R;
					
					int S=qtyArray[j];
					qtyArray[j]=qtyArray[j+1];
					qtyArray[j+1]=S;
					
					double T=amountArray[j];
					amountArray[j]=amountArray[j+1];
					amountArray[j+1]=T;
					
					int U=statusArray[j];
					statusArray[j]=statusArray[j+1];
					statusArray[j+1]=U;
				}
			}
		}		
		
		System.out.println("\n\t\t\t+-------------------------------------------------------------------------------+");
		System.out.println("\t\t\t|   Order ID   |   CustomerID   |   Size    |   QTY   |   Amount   |   Status   |");
		System.out.println("\t\t\t+-------------------------------------------------------------------------------+");
		
			for (int i = 0; i < qtyArray.length; i++) {
			System.out.printf("\t\t\t|   %-10s |   %-12s |   %-7s |  %-5d  |   %-8.2f |   %-8d |\n",orderIdArray[i], phoneArray[i], sizeArray[i], qtyArray[i], amountArray[i], statusArray[i]);
		}
		System.out.println("\t\t\t+-------------------------------------------------------------------------------+");
				
		
				do {
			System.out.print("\n\n\tTo access the Main Menu, please enter 0 : ");
			int option4 = input.nextInt();
			if (option4 == 0) {
				clearConsole();
				homepage();
				break;
			} else {
				clearConsole();
				bestCustomer();
				continue;
			}
		} while (true);			
		
	}
	
	public static void setOrderStatus(){
		Scanner input=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("\t   ____          _              _____ _        _             ");
		System.out.println("\t  / __ \\        | |            / ____| |      | |            ");
		System.out.println("\t | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___ ");
		System.out.println("\t | |  | | '__/ _` |/ _ \\ '__|  \\___ \\| __/ _` | __| | | / __|");
		System.out.println("\t | |__| | | | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\");
		System.out.println("\t  \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/");
		System.out.println("\t--------------------------------------------------------------");
		System.out.println("\n\n");
		
		System.out.print("\tEnter order ID : ");
		String OrderID=input.next();
		boolean found1 = false;
		for(int i=0; i<orderIdArray.length; i++){
			if(orderIdArray[i].equals(OrderID)){
				System.out.println("\n\n\tPhone Number   : "+phoneArray[i]);
				System.out.println("\tSize           : "+sizeArray[i]);
				System.out.println("\tQTY            : "+qtyArray[i]);
				System.out.println("\tAmount         : "+amountArray[i]);
				String currentStatus=getStatusString(statusArray[i]);
				System.out.println("\tStatus         :"+currentStatus);
				found1=true;
				System.out.print("\n\nDo you want to change this order status (y/n) : ");
				char ch4=input.next().charAt(0);
					if(ch4=='y' || ch4=='Y'){
						int newStatus=-1;	
						
					while(true){
						switch(statusArray[i]){
							case PROCESSING: System.out.println("\n\t\t[1] Order Delivering");
											 System.out.println("\n\t\t[2] Order Delivered");
											 System.out.print("\n\tEnter option : ");
											 newStatus=input.nextInt();
											 
											 if(newStatus==1){
												 statusArray[i]=DELIVERING;
												 System.out.println("\n\t\tStatus Updated..!");
												System.out.print("\nDo you want to change another order status? (y/n) : ");
												char ch8=input.next().charAt(0);
													if(ch8=='y' || ch8=='Y'){
														clearConsole();
														setOrderStatus();
														return;
													}else if(ch8=='n' || ch8=='N'){
														clearConsole();
														homepage();
														return;
													}
												 break;
											 }else if(newStatus==2){
												 statusArray[i]=DELIVERED;
												 System.out.println("\n\t\tStatus Updated..!");
												System.out.print("\nDo you want to change another order status? (y/n) : ");
												char ch8=input.next().charAt(0);
													if(ch8=='y' || ch8=='Y'){
														clearConsole();
														setOrderStatus();
														return;
													}else if(ch8=='n' || ch8=='N'){
														clearConsole();
														homepage();
														return;
													}												 
												 break;
											 }else{
												 System.out.println("\n\t\tInvalidinput..");
												 continue;
											 }
												 
							case DELIVERING:System.out.println("\n\t\t[1]Order Delivered");
											System.out.print("\n\tEnter option : ");
											newStatus=input.nextInt();
											
											if(newStatus==1){
												statusArray[i]=DELIVERED;
												System.out.println("\n\t\tStatus Updated..!");
												System.out.print("\nDo you want to change another order status? (y/n) : ");
												char ch8=input.next().charAt(0);
													if(ch8=='y' || ch8=='Y'){
														clearConsole();
														setOrderStatus();
														return;
													}else if(ch8=='n' || ch8=='N'){
														clearConsole();
														homepage();
														return;
													}												
																		
												break;
											}else{
												System.out.println("\n\t\tInvalidinput..");
												continue;
											}
												
							case DELIVERED:System.out.println("\n\t\tCant't change this order status,Order already delivered..!");
											System.out.print("\nDo you want to change another order status? (y/n) : ");
											char ch8=input.next().charAt(0);
												if(ch8=='y' || ch8=='Y'){
													clearConsole();
													setOrderStatus();
													return;
												}else if(ch8=='n' || ch8=='N'){
													clearConsole();
													homepage();
													return;
												}							
							
										   break;
									   }
									   break;									
							}
					
					}else if(ch4=='n' || ch4=='N'){
						System.out.print("\nDo you want to change another order status? (y/n) : ");
					char ch8=input.next().charAt(0);
						if(ch8=='y' || ch8=='Y'){
							clearConsole();
							setOrderStatus();
							return;
						}else if(ch8=='n' || ch8=='N'){
							clearConsole();
							homepage();
							return;
						}
						return;
					}				

				break;
			}
		}
		if(found1==false){
			System.out.println("\n\t\tInvalid ID..");
			System.out.print("\n\nDo you want to search another order status? (y/n) : ");
			char ch4=input.next().charAt(0);
				if(ch4=='y' || ch4=='Y'){
					clearConsole();
					setOrderStatus();
					return;
				}else if(ch4=='n' || ch4=='N'){
					clearConsole();
					homepage();
					return;
				}					
		}			
	}	
	
	
    public static final int PROCESSING = 0;
    public static final int DELIVERING = 1;
    public static final int DELIVERED = 2;   
    public int status;
    
    
	public static String getStatusString(int status) {
		switch (status) {
			case PROCESSING:
				return "PROCESSING";
			case DELIVERING:
				return "DELIVERING";
			case DELIVERED:
				return "DELIVERED";
			default:
				return "UNKNOWN";
		}
	}    	
	
	
	
	
	
	public static String[] sizeArray=new String[0];
	public static 	int[] qtyArray=new int[0];
	public static 	double[] amountArray=new double[0];	
	public static 	String[] phoneArray=new String[0];	
	public static int[] statusArray = new int[0];
	public static String[] orderIdArray = new String[0];
	
    public static int[] xsArray =new int[0];  
    public static int[] sArray = new int[0];  
    public static int[] mArray = new int[0];  
    public static int[] lArray = new int[0];  
    public static int[] xlArray = new int[0]; 
    public static int[] xxlArray = new int[0]; 	

    
    	
	public final static void clearConsole() { 
		try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", 
				"cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
			}
		} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
		}
	}	
}
