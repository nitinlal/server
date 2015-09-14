import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;


public class MongoProducer {

	DB db;
	Mongo mongo;
	
	
	public void formConnection(){
		try {
			mongo= new Mongo();
			db = mongo.getDB("test");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	public void publish(){
		DBCollection collecton = db.getCollection("tickets");
		for(int i=10;i<100;i++){
			i=(i%4)+43;
		collecton.insert(new BasicDBObject("marks",i));
		}
	}
	
	public static void main(String[] args) {
    MongoProducer propProducer = new MongoProducer();
    propProducer.formConnection();
    propProducer.publish();
    
		
	}

}
