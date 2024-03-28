package Exceptions;

import javax.naming.AuthenticationException;

public class CustomException {

    public static void main(String[] args) throws AuthenticationException {

        try{

            throw new AuthenticationException("Provide valid credentials");

        }catch(AuthenticationException a){

           // a.printStackTrace();
           throw new AuthenticationException("Provide valid ");

        }


        }
    }

