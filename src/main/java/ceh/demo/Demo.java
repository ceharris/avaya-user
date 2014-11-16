package ceh.demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Demo {

  public static void main(String[] args) throws Exception {
    User user = new User();
    user.setAuthenticationType("password");
    user.setGivenName("Joe");
    user.setSurname("Hutson");
    user.setLoginName("hutsonj");
    user.setUserName("hutsonj");
    user.setUserPassword("sekret");
    Users users = new Users();
    users.addUser(user);
    
    JAXBContext context = JAXBContext.newInstance(Users.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    
    marshaller.marshal(users, System.out);
  }
  
}
