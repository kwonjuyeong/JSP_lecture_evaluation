package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
    	//관리자의 아이디, 비밀번호 입력(구글 계정)
        return new PasswordAuthentication("자신의 이메일.com","메일 인증 비밀번호");
    	   
    }
    
}
