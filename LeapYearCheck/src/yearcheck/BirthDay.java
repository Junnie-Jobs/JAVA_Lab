package yearcheck;

public class BirthDay {
	
	//property
	private int year = 0;
	private int month = 0;
	private int day = 0;
	
	//constructor
	public BirthDay(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//method()
	//public으로 제공된 interface
	public void printResult() {
		printDate();
		printValidResult();
	}

	public void printDate() {
		System.out.println(this.yearAnnoDomini()+" "+month+"월 "+day+"일");
	}
	public void printValidResult() {
		if(isValidDate()) {
			System.out.println("유효한 날짜입니다"); return;
		}
		System.out.println("::ERROR::유효한 날짜가 아닙니다");
	}
	
	
	//valid date인지 check
	private boolean isValidDate()	{ return (this.day <= isDays()); }

	//윤년과 각 달을 조합하여 해달 month의 날이 며칠까지인지 확인하는 method()
	private int isDays() {
		if(isLeapYear())	{ return isFeb() ? 29 : 28 ; }
		if(is30DaysMonth())	{ return 30; }
		if(is31DaysMonth())	{ return 31; }
		
		return 0;
	}
	
	//윤년인지 check하는 method()
	private boolean isLeapYear() 	{ 
		if (this.year % 100 == 0) {
			return (this.year % 400 == 0);
		}
		return (this.year % 4 == 0);
	}
	
	//month variable에 1~12외에는 들어갈 수 없다. 자동으로 error처리를 함.
	private boolean isFeb() 		{ return (this.month == 2);	}
	private boolean is30DaysMonth() {
		return (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11);
	}
	private boolean is31DaysMonth() {
		return (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12);
	}
	
	//B.C A.D. 변환
	private String yearAnnoDomini()	{ 
		return (this.year < 0) ? Math.abs(this.year)+" B.C." : "A.D. "+this.year; 
	}
}