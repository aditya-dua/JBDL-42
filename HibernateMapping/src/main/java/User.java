
import java.util.Date;

public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private long Id = 0;
	private int UserId = 0;
	private String UserName = null;
	private String UserAddr = null;
	private String UserPhone = null;
	private String UserEmail = null;
	private Date UserDOB = null;
	private int expInMonth = 0;
	private double UserIncome = 0.0;

	public User() {
	}

	public User(int UserId, String UserName, String UserAddr, String UserPhone,
		String UserEmail, Date UserDOB, int expInMonth, double UserIncome) {
		this.UserId = UserId;
		this.UserName = UserName;
		this.UserAddr = UserAddr;
		this.UserPhone = UserPhone;
		this.UserEmail = UserEmail;
		this.UserDOB = UserDOB;
		this.expInMonth = expInMonth;
		this.UserIncome = UserIncome;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserAddr() {
		return UserAddr;
	}

	public void setUserAddr(String userAddr) {
		UserAddr = userAddr;
	}

	public String getUserPhone() {
		return UserPhone;
	}

	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public Date getUserDOB() {
		return UserDOB;
	}

	public void setUserDOB(Date userDOB) {
		UserDOB = userDOB;
	}

	public int getExpInMonth() {
		return expInMonth;
	}

	public void setExpInMonth(int expInMonth) {
		this.expInMonth = expInMonth;
	}

	public double getUserIncome() {
		return UserIncome;
	}

	public void setUserIncome(double userIncome) {
		UserIncome = userIncome;
	}

	@Override
	public String toString() {
		return "User [UserAddr=" + UserAddr + ", UserDOB=" + UserDOB
		+ ", UserEmail=" + UserEmail + ", UserId=" + UserId
		+ ", UserName=" + UserName + ", UserPhone=" + UserPhone
		+ ", UserSalary=" + UserIncome + ", expInMonth=" + expInMonth+ "]";
	}

}