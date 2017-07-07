package model;

public class User {

	private int UserId;
	private String UserName;
	private String password;
	private int Admin;
	private int VotePicture;
	private int VoteScene;
	private int VotePlant;


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public int getAdmin() {
		return Admin;
	}
	public void setAdmin(int admin) {
		Admin = admin;
	}
	public int getVotePicture() {
		return VotePicture;
	}
	public void setVotePicture(int votePicture) {
		VotePicture = votePicture;
	}
	public int getVoteScene() {
		return VoteScene;
	}
	public void setVoteScene(int voteScene) {
		VoteScene = voteScene;
	}
	public int getVotePlant() {
		return VotePlant;
	}
	public void setVotePlant(int votePlant) {
		VotePlant = votePlant;
	}
	public int getVoteCeramics() {
		return VoteCeramics;
	}
	public void setVoteCeramics(int voteCeramics) {
		VoteCeramics = voteCeramics;
	}
	private int VoteCeramics;
}
