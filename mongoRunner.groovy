/**
 * Created by jcampbell on 1/23/17.
 */
@Grab(group='com.gmongo', module='gmongo', version='0.9.3')
import com.gmongo.GMongo

// Instantiate gmongo.GMongo object
// It defaults to localhost, but you can pass connection settings through the constructor
def mongo = new GMongo()

// Get a reference to the db
def db = mongo.getDB("mergeRequest1")

println(db.merges.count())

// find Eric's merge request
ericMR = db.merges.findOne(id: 881)
println("Description: " + ericMR.description)
println()
