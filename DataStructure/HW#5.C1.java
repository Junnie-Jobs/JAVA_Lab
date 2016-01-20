package passport;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Passport {

	private String passportNum;
	private String name;
	private String birthday;

	public Passport() {
	}

	public Passport(String passportNum, String name, String birthday) {

		this.passportNum = passportNum;
		this.name = name;
		this.birthday = birthday;

	}

	@Override
	public int hashCode() {
		return passportNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		Passport passport = (Passport) obj;
		if (this.passportNum.equals(passport.passportNum))
			return true;
		return false;
	}

	public String toString() {
		return name + "님의 여권번호는 " + passportNum + "입니다";

	}

}

class PassportHashMap {

	private Map<String, Passport> passports = new HashMap<String, Passport>();

	public void makePassport(String passportNum, String name, String birthday) {

		Passport passport = new Passport(passportNum, name, birthday);
		passports.put(passportNum, passport);

	}

	public void displayAll() {

		Set<String> keyset = passports.keySet();
		Iterator<String> ir = keyset.iterator();

		while (ir.hasNext()) {

			String key = ir.next();
			Passport passport = passports.get(key);
			System.out.println(passport);
		}

	}

}

public class PassportTest {

	public static void main(String[] args) {

		PassportHashMap passportList = new PassportHashMap();

		passportList.makePassport("131020", "Junnie", "900515");
		passportList.makePassport("131021", "Kimmi", "890513");
		passportList.makePassport("131022", "Hyolee", "790821");
		passportList.makePassport("131023", "Jiwon", "790612");
		passportList.makePassport("131023", "Finkle", "790613");
		// Finkle은 Jiwon과 여권번호가 같으므로 나중에 추가되는 인물은 입력이 되지 않는다.

		passportList.displayAll();
	}
}
