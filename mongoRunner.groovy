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

//        {
//            "id": 881,
//            "iid": 548,
//            "project_id": 1,
//            "title": "Halo 4201 - Integrate RIS to Spring Boot with XML conversion to FHIR",
//            "description": "Paul's code integrating Sujay's code with the \"mega container\"\r\n\r\nPassing adhoc-to-dev gate http://jenkins.halo.dekaresearch.com/view/Pipelines/view/halo-adhoc-to-dev-gate/job/halo-adhoc-to-dev-gate/269/",
//            "state": "merged",
//            "created_at": "2017-01-08T14:48:00.472-05:00",
//            "updated_at": "2017-01-11T13:54:58.472-05:00",
//            "target_branch": "dev",
//            "source_branch": "halo-4201",
//            "upvotes": 0,
//            "downvotes": 0,
//            "author": {
//            "name": "Eric Masson",
//            "username": "emasson",
//            "id": 13,
//            "state": "active",
//            "avatar_url": "http://gitlab.halo.dekaresearch.com/uploads/user/avatar/13/wheatley.jpg",
//            "web_url": "http://gitlab.halo.dekaresearch.com/emasson"
//        },
//            "assignee": null,
//            "source_project_id": 1,
//            "target_project_id": 1,
//            "labels": [],
//            "work_in_progress": false,
//            "milestone": null,
//            "merge_when_build_succeeds": false,
//            "merge_status": "can_be_merged",
//            "sha": "74aae69d817f970905750ddd34227c943f65514a",
//            "merge_commit_sha": "3c044274ec003b989cf05779c2375bc543e98753",
//            "subscribed": false,
//            "user_notes_count": 17,
//            "approvals_before_merge": null,
//            "should_remove_source_branch": false,
//            "force_remove_source_branch": false,
//            "web_url": "http://gitlab.halo.dekaresearch.com/halo/halo/merge_requests/548"
//        }