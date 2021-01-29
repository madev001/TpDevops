package com.tp.devops;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// delete data
		BasicDBObject deleteQuery = new BasicDBObject();
		deleteQuery.put("name", "John");
		collection.remove(deleteQuery);
	}

}
