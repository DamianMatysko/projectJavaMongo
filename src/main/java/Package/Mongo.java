package Package;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Mongo {
public MongoClient getConnection() {
    MongoClient mongoClient = new MongoClient("host1", 27017);
    return  mongoClient;
}
    public void insertOne() {
        MongoDatabase mongoDatabase = getConnection().getDatabase("company");
        MongoCollection<Document> mongoCollection=mongoDatabase.getCollection("users");

        Document inputs = new Document("name", "Peto").append("age", 12).append("status", "enchanted");
        mongoCollection.insertOne(inputs);
        getConnection().close();
        System.out.println("success");
    }

    public void delete() {

    }

}
