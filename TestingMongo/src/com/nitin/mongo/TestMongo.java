package com.nitin.mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class TestMongo {

	
	public static void main(String args[]){
		DB db=null;
		Mongo m=null;
		try {
			 m = new Mongo();
			db = m.getDB("test");
			
	
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DBCollection collection=db.getCollection("scores");
		
		BasicDBObject document= new BasicDBObject();
		document.put("scores", 23);
		document.put("scores", 24);
		document.put("scores", 25);
		document.put("scores", 26);
		collection.insert(document);
		
		BasicDBObject document1= new BasicDBObject();
		document1.put("scores",new BasicDBObject("$gt",20));
		
		DBCursor cursor=collection.find(document1);
		
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
		/*
		 * Database Names
		 */
		System.out.println();
		
		System.out.println("Database name:" +m.getDatabaseNames());
	
		
	}
}
