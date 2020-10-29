package com.wellsfargo.batch5.fmvc.service;

import com.wellsfargo.batch5.fmvc.model.Login;

public interface IUserService {
	
	Login verifyUser(Login login);
    
}
