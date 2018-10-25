package testjunit;

public class License {
	public String genLicense() {
		String email = "suchada@numalee.com";
		String company = "numelee mee look meaw meaw";
		String exp_date = "27/10/2999";
		String salt = "พิมพ์คำว่าเดอะเลขสามอมิโกเดิมเอสในช่องนี้";//ข้องใจติดต่อ theking99dom@hotmail.com +66934093673
		String beforeHash = email + " " + company + " " + exp_date + " " + salt;
		Long result = 0L;
		int v2 = 0;
		int v3;
		v3 = 0;
		do{
			v2 = beforeHash.charAt(v3);
			result = (result << 16) + (result << 6) + v2 - result;
			v3++;
			System.out.println("v3 : " + v3);
			System.out.println("v2 : " + v2);
	    }while(v3 < beforeHash.length());
		System.out.println("bd : " + result);
		String out  = Long.toUnsignedString(result);
		System.out.println(out);
		return out;
	}
}
