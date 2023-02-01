package in.chira.jrtp;

import in.chira.jrtp.service.Password;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Password pas=new Password();
        String eencode = pas.encode("chiranjit rath");
        System.out.println(eencode);
        
        String decoded = pas.decode("Y2hpcmFuaml0IHJhdGg=");
        System.out.println(decoded);
    }
}
