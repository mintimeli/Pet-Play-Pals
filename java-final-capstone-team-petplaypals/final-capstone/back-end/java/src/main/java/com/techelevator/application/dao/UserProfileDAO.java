package com.techelevator.application.dao;

import java.util.List;

import com.techelevator.application.model.UserProfile;

public interface UserProfileDAO {
	
	//Create user profile
	public UserProfile createUserProfile(UserProfile newUserProfile);
	
	//Retrieve user profile -- get user profile by name
//	public UserProfile getUserProfileByUsername(String username);
	
	//Update user profile
	public void updateUserProfile(UserProfile updatedUserProfile);
	
	//Delete user profile
//	public void deleteUserProfile(UserProfile aUserProfile);
	
	//Get list of users
	public List<UserProfile> listOfAllProfiles();
	
	// Get a profile by the User ID
	public UserProfile getProfileByUserId(int id);
	
	//	Get a profile by the email address
	public UserProfile getProfileByEmail(String email);
}
