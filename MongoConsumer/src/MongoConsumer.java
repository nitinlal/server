import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;


public class MongoConsumer {

	private Mongo mongo;
	private DB db;
	
	public void formConnection(){
		
		try {
			mongo=new Mongo();
			db = mongo.getDB("test");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	public Object getMessage(){
     DBCollection queues = db.getCollection("tickets");
    
      
     DBObject updatedQue =new BasicDBObject();
     
     while(null!=updatedQue){
     updatedQue= queues.findAndModify(new BasicDBObject("status","new"),new BasicDBObject("_id",1),new BasicDBObject("$set",new BasicDBObject("status","processed"))); 
     
     if(null!=updatedQue){
     System.out.println(updatedQue.get("message"));
     }
 
     if(null==updatedQue){
         System.out.println("processing Complete");
         }
     
     }
      return updatedQue;
	 
	}
	
	public static void main(String[] args) {

		MongoConsumer consumer = new MongoConsumer();
		consumer.formConnection();
		consumer.getMessage();
		
		
	}

}
