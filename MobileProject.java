package pAYILAGAM;

import java.util.Scanner;


public class MobileProject {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("SPECIAL DISCOUNT OFFER SALE");
	System.out.println("which  u want to see y for yes or n for no");
	String in=obj.nextLine();
	if(in.equalsIgnoreCase("y"))
	{
		System.out.println("which type mobile u want to see");
		System.out.println("1.feature mobile");
		System.out.println("2.3G mobile");
		System.out.println("3.4G mobile");
		System.out.println("4.easy emi");
		System.out.println("5.cashback offer");
		System.out.println("6.VR offer");
		System.out.println("7.jodi offer");
		System.out.println("8.buy and win");
		System.out.println("9.tab offer");
		System.out.println("10.new arrival");
		
	
	}
	else if(in.equalsIgnoreCase("n")){
	System.out.println("thank you");
	
	}
	else{
		System.out.println("enter wrong");
	}
	String enter=obj.nextLine();
	switch(enter)
	{
	case "1":
		System.out.println("mobile name are ");
		System.out.println("a.Itel2130 shine");
		System.out.println("b.micromax");
		System.out.println("c.intex ");
		System.out.println("d.gionee");
		System.out.println("which mobile u want to see");

		String mobile=obj.nextLine();
		
		
		switch(mobile){
	    case "a":
	    	System.out.println("Itel130 mobile specifications are");
	    	System.out.println("camera front 2mp and rear 2mega pixel");
	    	System.out.println("memory upto 32GB");
	    	System.out.println("mobile price : 849");
	    	System.out.println("u want to buy press y for yes or n for no");
	    	String buy=obj.nextLine();
	    	
	    	
	    	if(buy.equalsIgnoreCase("y")){
	    		System.out.println("delivery on day after 3 day");
	    		
	    	}
	    	else if(buy.equalsIgnoreCase("n")){
	    		System.out.println("thank u");
	    	}
	    	else{
	    		System.out.println("enter wrong");
	    	}
	    	
	    	break;
	    case "b":
	    	System.out.println("micromax mobile specifications are");
	    	System.out.println("camera front 2mp and rear 2mega pixel");
	    	System.out.println("memory upto 32GB");
	    	System.out.println("battery backup 2400mah");
	    	System.out.println("mobile price : 1099");
	    	System.out.println("u want to buy press y for yes or n for no");
	    	String b=obj.nextLine();
	    	if(b.equalsIgnoreCase("y")){
	    		System.out.println("delivery on day after 3 day");
	    		
	    	}
	    	else if(b.equalsIgnoreCase("n")){
	    		System.out.println("thank u");
	    	}
	    	else{
	    		System.out.println("enter wrong");
	    	}
	    	
	    	break;
	    	
	    case "c":
	    	System.out.println("intex mobile specifications are");
	    	System.out.println("camera front 2mp and rear 2mega pixel");
	    	System.out.println("memory upto 32GB");
	    	System.out.println("fm rec");
	    	System.out.println("mobile price : 1499");
	    	System.out.println("u want to buy press y for yes and n for no");
	    	String d=obj.nextLine();
	    	if(d.equalsIgnoreCase("y")){
	    		System.out.println("delivery on day after 3 day");
	    		
	    	}
	    	else if(d.equalsIgnoreCase("n")){
	    		System.out.println("thank u");
	    	}
	    	else{
	    		System.out.println("enter wrong");
	    	}
	    	break;
	    case "d":
	    	System.out.println("gionee mobile specifications are");
	    	System.out.println("camera and rear 1.3mega pixel");
	    	System.out.println("memory upto 32GB");
	    	System.out.println("battery backup 3000mah");
	    	System.out.println("mobile price : 2199");
	    	System.out.println("u want to buy press y for yes and n for no");
	    	String dd=obj.nextLine();
	    	if(dd.equalsIgnoreCase("y")){
	    		System.out.println("delivery on day after 3 day");
	    		
	    	}
	    	else if(dd.equalsIgnoreCase("n")){
	    		System.out.println("thank u");
	    	}
	    	else{
	    		System.out.println("enter wrong");
	    	}
	    	System.out.println("u want to go menu press y for yes or n for no");
	    	String y=obj.nextLine();
		}while(in.equalsIgnoreCase("y"));
	    	
	    	
	    	
	    	
		
	
	case "2":
		System.out.println(" 3G mobile name are ");
	System.out.println("a.Intex");
	System.out.println("b.gionee");
	System.out.println("c.karbon ");
	System.out.println("d.micromax");
	System.out.println("which mobile u want to see");
	String G=obj.nextLine();
	
		switch(G){
		case"a":
			System.out.println("intex mobile specifications are:");
			System.out.println("5mp camera");
			System.out.println("quadcore 1.2ghz");
			System.out.println("android ");
			System.out.println("mobile price:3799");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"b":
			System.out.println("gionee mobile specifications are:");
			System.out.println("5mp camera");
			System.out.println("1GB ram");
			System.out.println("android ");
			System.out.println("mobile price:4699");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String gionee=obj.nextLine();
			if(gionee.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(gionee.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"c":
			System.out.println("karbonn mobile specifications are:");
			System.out.println("5mp camera");
			System.out.println("quadcore 1.2ghz");
			System.out.println("android 6.0 ");
			System.out.println("mobile price:4999");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String karbonn=obj.nextLine();
			if(karbonn.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(karbonn.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"d":
			System.out.println("micromax mobile specifications are:");
			System.out.println("13mp camera");
			System.out.println("2gb ram");
			System.out.println("android ");
			System.out.println("mobile price:5499");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String mic=obj.nextLine();
			if(mic.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(mic.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
	}
		break;
	case "3":
		System.out.println(" 4G mobile name are ");
		System.out.println("a.lava");
		System.out.println("b.le tv");
		System.out.println("c.gionee ");
		System.out.println("d.lg xpower");
		System.out.println("which mobile u want to see");
		String GG=obj.nextLine();
		switch(GG){
		case"a":
			System.out.println("lava mobile specifications are:");
			System.out.println("8mp camera");
			System.out.println("1GB");
			System.out.println("android ");
			System.out.println("mobile price:5699");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"b":
			System.out.println("le tv mobile specifications are:");
			System.out.println("13 mp camera");
			System.out.println("3GB ram");
			System.out.println("android ");
			System.out.println("mobile price:9999");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String gionee=obj.nextLine();
			if(gionee.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(gionee.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"c":
			System.out.println("gionee mobile specifications are:");
			System.out.println("13mp camera");
			System.out.println("otg support");
			System.out.println("android 6.0 ");
			System.out.println("mobile price:10990");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String karbonn=obj.nextLine();
			if(karbonn.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(karbonn.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"d":
			System.out.println("lg mobile specifications are:");
			System.out.println("13mp camera");
			System.out.println("2gb ram");
			System.out.println("4100mah");
			System.out.println("mobile price:5499");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String mic=obj.nextLine();
			if(mic.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(mic.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
	}
		break;
		
	case "4":
		System.out.println(" easy emi mobile name are ");
		System.out.println("vivo");

		
		System.out.println(" u want to see that mobile");
		String emi=obj.nextLine();
		switch(emi){
		case"a":
			System.out.println("VIVo mobile specifications are:");
			System.out.println("13 mp camera");
			System.out.println("3GB RAm");
			System.out.println("android ");
			System.out.println("mobile price-just pay:2497 balance on EMI");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
	
	}
		break;
		
	case "5":
		System.out.println(" cashback mobile name are ");
		System.out.println("google pixel");
		System.out.println("apple");
		System.out.println(" u want to see that mobile");
		String cash=obj.nextLine();
		switch(cash){
		case"a":
			System.out.println("google pixel mobile specifications are:");
			System.out.println("12.5 mp camera");
			System.out.println("4 gb ram");
			System.out.println("android ");
			System.out.println("cash back :7000'HDFC'");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"b":
			System.out.println("APPLE mobile specifications are:");
			System.out.println("splash water");
			System.out.println("dust resistant");
			System.out.println("ios ");
			System.out.println("cash back:7000'citi bank'");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String gionee=obj.nextLine();
			if(gionee.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(gionee.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
	
	}
		break;
		
	case "6":
		System.out.println(" VR offer mobile name are ");
		System.out.println("samsung galaxy");
		
		System.out.println(" u want to see that mobile");
		String VR=obj.nextLine();
		switch(VR){
		case"a":
			System.out.println("samsung s7/s5 mobile specifications are:");
			System.out.println("12mp camera");
			System.out.println("4 GB RAM");
			System.out.println("android ");
			System.out.println("get gear VR @ 1990");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
	
	}
		break;
		
	case "7":
		System.out.println("jodi mobilea are");
		System.out.println("karbon flip2");
		System.out.println(" u want to see that mobile");
		String jodi=obj.nextLine();
		switch(jodi){
		case"a":
			System.out.println("karbonn flip mobile specifications are:");
			System.out.println(" camera");
			System.out.println("1000 mah");
			System.out.println("android ");
			System.out.println("mobile price:2790");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		
	}
		break;
		
	case "8":
		System.out.println("buy and win mobile are");
		System.out.println("Vivo v5");
		System.out.println("u wnat to see that mobile");
		String win =obj.nextLine();
	switch(win){
	case "a":
		System.out.println("vivo specifications");
		System.out.println("20 mp camera");
		System.out.println("4 GB RAM");
		System.out.println("marshmallow");
		System.out.println("slogan contest:car,led tv,washing machine");
		System.out.println("u want to buy mobile press y for yes or n for no");
		String vivo=obj.nextLine();
		if(vivo.equalsIgnoreCase("Y")){
			System.out.println("delivery on day after 3 day");
		}
		else if(vivo.equalsIgnoreCase("n")){
			System.out.println("thank you");
		}
		else{
			System.out.println("enter wrong");
		}
	}
	
		
	case"9":
		
		System.out.println("tab offer");
		System.out.println("celkon");
		System.out.println("miromax canvas");
		System.out.println("samsung");
		System.out.println("which u want to see");
		String tab=obj.nextLine();
		switch(tab){
		case"a":
			System.out.println("celkon mobile specifications are:");
			System.out.println("5mp camera");
			System.out.println("2800 mah");
			System.out.println("android ");
			System.out.println("mobile price:4499");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"b":
			System.out.println("micromax mobile specifications are:");
			System.out.println("5mp camera");
			System.out.println("3500 mah");
			System.out.println("android ");
			System.out.println("mobile price:6999");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String gionee=obj.nextLine();
			if(gionee.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(gionee.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			break;
		case"c":
			System.out.println("samsung  mobile specifications are:");
			System.out.println("5mp camera");
			System.out.println("3600 mah");
			System.out.println("android 6.0 ");
			System.out.println("mobile price:8699");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String karbonn=obj.nextLine();
			if(karbonn.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(karbonn.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
	
			System.out.println("u go to menu page press y or  n");
			in=obj.nextLine();
		}while(in.equalsIgnoreCase("y"));
		
		
		
	
	
		
		
	case "10":
	do{
		
	
		System.out.println("new arrival mobile are");
		System.out.println("a.black berry");
		System.out.println("b.lg v20");
		System.out.println("which u want see");
		String arrival=obj.nextLine();
		switch(arrival){
		case"a":
			System.out.println("blackberry mobile specifications are:");
			System.out.println("13mp camera");
			System.out.println("3GB RAM");
			System.out.println("upto 2TB card");
			System.out.println("mobile price:21990");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String intex=obj.nextLine();
			if(intex.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(intex.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
		}
		
	
		System.out.println("u go to menu page press y or  n");
		in=obj.nextLine();
	}while(in.equalsIgnoreCase("y"));
	
	
		
	
	
		case"f":
			while(in.equalsIgnoreCase("y")){
			System.out.println("LG mobile specifications are:");
			System.out.println("16mp camera");
			System.out.println("4 GB ram");
			System.out.println("64 GB internal");
			System.out.println("mobile price:54990");
			System.out.println("u buy this mobile press buy for buy or no for no");
			String gionee=obj.nextLine();
			if(gionee.equalsIgnoreCase("buy")){
				System.out.println("delivery on day after 3 day");
			}
			else if(gionee.equalsIgnoreCase("no")){
				System.out.println("thank you");
			}
			else{
				System.out.println("enter wrong");
			}
			
			System.out.println("u go to menu page press y or  n");
			in=obj.nextLine();
		}
		
		
	         
		
	}
	
		
	
	}
}


		