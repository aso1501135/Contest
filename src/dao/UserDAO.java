package dao;

import model.User;

public class UserDAO extends DBOpenBean {
	String sql;
	User user = new User();

	public boolean getUser(int userid,String password) {
	try {
		DbOpen();
		sql = "SELECT u_name FROM user WHERE u_id = ? AND password = ? ";
		ps = con.prepareStatement(sql);

		ps.setInt(1, userid);
		ps.setString(2, password);
		rs = ps.executeQuery();
		rs.next();
		String name = rs.getString("u_name");
		//↓ここで、文字が一文字以上入ってたらログイン成功としてます
		//ここは、if(name == null)で良かったかもしれない
		if(name.length()>0){
			user.setUserName(name);
			return true;
		}
	} catch (Exception e) {
		//下のfinallyは今後とも書いてください、そうしないとDBが閉じれないようになってます
	}finally{
		try{
			DbClose();
		}catch(Exception e){

		}
	}
	return false;

}


}
