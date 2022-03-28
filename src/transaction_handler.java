/**
 *  Removed imported modules from here and put them in the main class. This should work as all methods within 
 *  this class will be called from the bankManager.java class.
 */ 





public class transaction_handler {

	
	
	public static String masterfile = "bankdeatils.txt"; //stores local file for database
//	private static int runmode;
//	private File latestdetails;
	public static String path = "newdetails.txt";
	
	
	public static void main(String[] args) {
		System.out.println("ATM Options \n 1) Withdraw Money \n 2) Deposit Money \n 3) Check Balance \n 4) ");
		if (runmode == 1) { //this runs the following indented code if option 1 is selected 
			System.out.println("Withdraw Mode");
		} else if (runmode == 2) {
			System.out.println("Deposit Mode");
		} else if (runmode == 3) {
			System.out.println("Balance Mode");
		} else {
			System.out.println("Invalid Option");
			
		}
	}
	
	
	public String getContents(String path) {
		String data = "";
		String line = "";
		FileReader fr;
		BufferedReader br = null;
		File file = new File(path);
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while((line=br.readLine()) != null) {
				data = data + line + System.lineSeparator();
			}
			br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	
	

	public String customer_statement(int CustomerNo) {
		return null;
	}	
	
	
	public static String withdraw_handler(int CustomerNo, int WithdrawAmount) {
		
		return null;
		
	}

	public static String deposit_handler(int CustomerNo, int DepositAmount) {
		
		return null;
	}

}
