package JSONEXtractor.JsonExtract;

import JSONEXtractor.Common.DbConnectAndExtract;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DbConnectAndExtract dbcnt=new DbConnectAndExtract();
    	String dataf=dbcnt.retriveTheData();
    	System.out.println(dataf);
    	
    }
}
