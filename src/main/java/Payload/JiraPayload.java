package Payload;

public class JiraPayload {

	
	
	public static String payload() 
	{
		return "{\r\n" + 
				"    \"expand\": \"schema,names\",\r\n" + 
				"    \"startAt\": 0,\r\n" + 
				"    \"maxResults\": 50,\r\n" + 
				"    \"total\": 9,\r\n" + 
				"    \"issues\": [\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10109\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10109\",\r\n" + 
				"            \"key\": \"APITEST-11\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10002\",\r\n" + 
				"                    \"id\": \"10002\",\r\n" + 
				"                    \"description\": \"Created by Jira Software - do not edit or delete. Issue type for a user story.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/issuetypes/story.svg\",\r\n" + 
				"                    \"name\": \"Story\",\r\n" + 
				"                    \"subtask\": false\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an bug using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i0001r:\",\r\n" + 
				"                \"customfield_10106\": null,\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Rest test\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T10:15:59.847+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-11/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T09:38:34.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@62d3a657[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@7028ab94[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@51fc7688[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@643d1328[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@6cea62b5[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@56d219d1[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@64a87db5[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@6880965b[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@5740ae34[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@111a299c[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@36f8bbdf[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@5aa6d115[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/3\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/medium.svg\",\r\n" + 
				"                    \"name\": \"Medium\",\r\n" + 
				"                    \"id\": \"3\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": \"APITEST-6\",\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-11/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T10:15:59.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10108\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10108\",\r\n" + 
				"            \"key\": \"APITEST-10\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10002\",\r\n" + 
				"                    \"id\": \"10002\",\r\n" + 
				"                    \"description\": \"Created by Jira Software - do not edit or delete. Issue type for a user story.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/issuetypes/story.svg\",\r\n" + 
				"                    \"name\": \"Story\",\r\n" + 
				"                    \"subtask\": false\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an bug using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i0001j:\",\r\n" + 
				"                \"customfield_10106\": null,\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Rest test\",\r\n" + 
				"                \"lastViewed\": null,\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-10/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T09:37:18.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@4f4b1240[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@32e9f163[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@38445b1d[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@45dbc79f[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@626aaf47[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@19b6f141[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@3b0cdd9[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@18cc150f[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@2f6b81c6[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@1794193[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@4229a60[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@7cbe8386[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/3\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/medium.svg\",\r\n" + 
				"                    \"name\": \"Medium\",\r\n" + 
				"                    \"id\": \"3\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-10/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T09:37:18.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10107\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10107\",\r\n" + 
				"            \"key\": \"APITEST-9\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10002\",\r\n" + 
				"                    \"id\": \"10002\",\r\n" + 
				"                    \"description\": \"Created by Jira Software - do not edit or delete. Issue type for a user story.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/issuetypes/story.svg\",\r\n" + 
				"                    \"name\": \"Story\",\r\n" + 
				"                    \"subtask\": false\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an bug using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i0001b:\",\r\n" + 
				"                \"customfield_10106\": null,\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Rest test\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T10:08:01.762+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-9/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T09:08:14.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@421675f2[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@204ed368[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@77aeafc8[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@21adf7c6[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@27de67c0[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@1691e6d3[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@14c3cb26[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@5a9e1dbf[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@e2a914b[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@17944923[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@1d042a0c[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@37ddbff6[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/3\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/medium.svg\",\r\n" + 
				"                    \"name\": \"Medium\",\r\n" + 
				"                    \"id\": \"3\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-9/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T09:08:14.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10106\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10106\",\r\n" + 
				"            \"key\": \"APITEST-8\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10101\",\r\n" + 
				"                    \"id\": \"10101\",\r\n" + 
				"                    \"description\": \"A problem which impairs or prevents the functions of the product.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/secure/viewavatar?size=xsmall&avatarId=10303&avatarType=issuetype\",\r\n" + 
				"                    \"name\": \"Bug\",\r\n" + 
				"                    \"subtask\": false,\r\n" + 
				"                    \"avatarId\": 10303\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an bug using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i00013:\",\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Rest test\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T09:08:22.480+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-8/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T08:55:05.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@5063f37[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@20ee13f6[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@5b2172b0[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@b00bb81[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@5ad85e8c[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@65b26f55[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@35d625a1[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@3b845c29[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@233049eb[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@550e521f[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@51f18e32[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@488df531[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/5\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/lowest.svg\",\r\n" + 
				"                    \"name\": \"Lowest\",\r\n" + 
				"                    \"id\": \"5\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-8/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T09:04:46.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10105\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10105\",\r\n" + 
				"            \"key\": \"APITEST-7\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10101\",\r\n" + 
				"                    \"id\": \"10101\",\r\n" + 
				"                    \"description\": \"A problem which impairs or prevents the functions of the product.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/secure/viewavatar?size=xsmall&avatarId=10303&avatarType=issuetype\",\r\n" + 
				"                    \"name\": \"Bug\",\r\n" + 
				"                    \"subtask\": false,\r\n" + 
				"                    \"avatarId\": 10303\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an bug using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i0000v:\",\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Rest test\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T08:49:50.737+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-7/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T08:49:43.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@57e92ec7[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@5f801134[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@2c529154[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@73042c5b[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@2a428f72[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@4dc983[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@382d30ef[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@6a19a545[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@549e8e6b[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@3a7144aa[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@6b8aa143[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@4c1e12fa[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/3\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/medium.svg\",\r\n" + 
				"                    \"name\": \"Medium\",\r\n" + 
				"                    \"id\": \"3\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-7/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T08:49:43.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10104\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10104\",\r\n" + 
				"            \"key\": \"APITEST-6\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10001\",\r\n" + 
				"                    \"id\": \"10001\",\r\n" + 
				"                    \"description\": \"Created by Jira Software - do not edit or delete. Issue type for a big user story that needs to be broken down.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/issuetypes/epic.svg\",\r\n" + 
				"                    \"name\": \"Epic\",\r\n" + 
				"                    \"subtask\": false\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an bug using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i0000n:\",\r\n" + 
				"                \"customfield_10106\": null,\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Rest test\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T13:43:18.341+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-6/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T08:45:10.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@85d0247[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@1964232[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@2c47a6de[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@1ff3e6b6[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@1267ef1e[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@1854fe46[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@9b4dac4[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@9725b12[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@24404a3d[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@1b59363d[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@3414ad68[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@2fa5ca33[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/1\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/highest.svg\",\r\n" + 
				"                    \"name\": \"Highest\",\r\n" + 
				"                    \"id\": \"1\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"customfield_10101\": null,\r\n" + 
				"                \"customfield_10102\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"customfield_10103\": null,\r\n" + 
				"                \"environment\": \"enviornment testing\",\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-6/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T10:15:59.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10103\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10103\",\r\n" + 
				"            \"key\": \"APITEST-5\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10101\",\r\n" + 
				"                    \"id\": \"10101\",\r\n" + 
				"                    \"description\": \"A problem which impairs or prevents the functions of the product.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/secure/viewavatar?size=xsmall&avatarId=10303&avatarType=issuetype\",\r\n" + 
				"                    \"name\": \"Bug\",\r\n" + 
				"                    \"subtask\": false,\r\n" + 
				"                    \"avatarId\": 10303\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an bug using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i0000f:\",\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Rest test\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T08:34:08.319+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-5/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T08:19:27.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@476553d[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@71b38c0e[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@12bdfdbc[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@7f83d019[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@e0ff7e1[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@e0644bd[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@73ab08dc[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@12490da8[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@630840ff[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@5f17d38f[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@7451cd59[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@2e2faa36[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/3\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/medium.svg\",\r\n" + 
				"                    \"name\": \"Medium\",\r\n" + 
				"                    \"id\": \"3\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-5/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T08:33:44.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10101\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10101\",\r\n" + 
				"            \"key\": \"APITEST-3\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10101\",\r\n" + 
				"                    \"id\": \"10101\",\r\n" + 
				"                    \"description\": \"A problem which impairs or prevents the functions of the product.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/secure/viewavatar?size=xsmall&avatarId=10303&avatarType=issuetype\",\r\n" + 
				"                    \"name\": \"Bug\",\r\n" + 
				"                    \"subtask\": false,\r\n" + 
				"                    \"avatarId\": 10303\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|i00007:\",\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Main order flow broken.\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T08:18:09.557+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-3/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T07:39:11.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@65aa4b5[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@70824d13[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@2a2fa314[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@48278997[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@79c12afb[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@1e59fde9[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@49b9da35[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@3da689a4[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@4d40ea19[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@1ca7e0ed[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@1b48f93e[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@12aaa85a[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/3\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/medium.svg\",\r\n" + 
				"                    \"name\": \"Medium\",\r\n" + 
				"                    \"id\": \"3\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-3/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T07:39:11.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
				"            \"id\": \"10100\",\r\n" + 
				"            \"self\": \"http://localhost:8080/rest/api/2/issue/10100\",\r\n" + 
				"            \"key\": \"APITEST-2\",\r\n" + 
				"            \"fields\": {\r\n" + 
				"                \"issuetype\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issuetype/10101\",\r\n" + 
				"                    \"id\": \"10101\",\r\n" + 
				"                    \"description\": \"A problem which impairs or prevents the functions of the product.\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/secure/viewavatar?size=xsmall&avatarId=10303&avatarType=issuetype\",\r\n" + 
				"                    \"name\": \"Bug\",\r\n" + 
				"                    \"subtask\": false,\r\n" + 
				"                    \"avatarId\": 10303\r\n" + 
				"                },\r\n" + 
				"                \"components\": [],\r\n" + 
				"                \"timespent\": null,\r\n" + 
				"                \"timeoriginalestimate\": null,\r\n" + 
				"                \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
				"                \"project\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/project/10000\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"key\": \"APITEST\",\r\n" + 
				"                    \"name\": \"APITesting\",\r\n" + 
				"                    \"projectTypeKey\": \"software\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"http://localhost:8080/secure/projectavatar?avatarId=10324\",\r\n" + 
				"                        \"24x24\": \"http://localhost:8080/secure/projectavatar?size=small&avatarId=10324\",\r\n" + 
				"                        \"16x16\": \"http://localhost:8080/secure/projectavatar?size=xsmall&avatarId=10324\",\r\n" + 
				"                        \"32x32\": \"http://localhost:8080/secure/projectavatar?size=medium&avatarId=10324\"\r\n" + 
				"                    }\r\n" + 
				"                },\r\n" + 
				"                \"fixVersions\": [],\r\n" + 
				"                \"aggregatetimespent\": null,\r\n" + 
				"                \"resolution\": null,\r\n" + 
				"                \"customfield_10104\": null,\r\n" + 
				"                \"customfield_10105\": \"0|hzzzzz:\",\r\n" + 
				"                \"aggregatetimeestimate\": null,\r\n" + 
				"                \"resolutiondate\": null,\r\n" + 
				"                \"workratio\": -1,\r\n" + 
				"                \"summary\": \"Main order flow broken.\",\r\n" + 
				"                \"lastViewed\": \"2020-04-17T08:17:25.450+0530\",\r\n" + 
				"                \"watches\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-2/watchers\",\r\n" + 
				"                    \"watchCount\": 1,\r\n" + 
				"                    \"isWatching\": true\r\n" + 
				"                },\r\n" + 
				"                \"creator\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"subtasks\": [],\r\n" + 
				"                \"created\": \"2020-04-17T07:28:07.000+0530\",\r\n" + 
				"                \"reporter\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/user?username=Mr.vishal.deshpande\",\r\n" + 
				"                    \"name\": \"Mr.vishal.deshpande\",\r\n" + 
				"                    \"key\": \"JIRAUSER10000\",\r\n" + 
				"                    \"emailAddress\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"avatarUrls\": {\r\n" + 
				"                        \"48x48\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=48\",\r\n" + 
				"                        \"24x24\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=24\",\r\n" + 
				"                        \"16x16\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=16\",\r\n" + 
				"                        \"32x32\": \"https://www.gravatar.com/avatar/cece58cea506d6058849bcf6ad347447?d=mm&s=32\"\r\n" + 
				"                    },\r\n" + 
				"                    \"displayName\": \"Mr.vishal.deshpande@gmail.com\",\r\n" + 
				"                    \"active\": true,\r\n" + 
				"                    \"timeZone\": \"Asia/Calcutta\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10000\": \"{summaryBean=com.atlassian.jira.plugin.devstatus.rest.SummaryBean@5b35761d[summary={pullrequest=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@6fa9d472[overall=PullRequestOverallBean{stateCount=0, state='OPEN', details=PullRequestOverallDetails{openCount=0, mergedCount=0, declinedCount=0}},byInstanceType={}], build=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@3131c43e[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BuildOverallBean@101a8c2e[failedBuildCount=0,successfulBuildCount=0,unknownBuildCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], review=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@21f81aff[overall=com.atlassian.jira.plugin.devstatus.summary.beans.ReviewsOverallBean@4667193a[stateCount=0,state=<null>,dueDate=<null>,overDue=false,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], deployment-environment=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@79c835fc[overall=com.atlassian.jira.plugin.devstatus.summary.beans.DeploymentOverallBean@3d77ad17[topEnvironments=[],showProjects=false,successfulCount=0,count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], repository=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@5c3967a4[overall=com.atlassian.jira.plugin.devstatus.summary.beans.CommitOverallBean@22e90bd0[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}], branch=com.atlassian.jira.plugin.devstatus.rest.SummaryItemBean@1a36bda4[overall=com.atlassian.jira.plugin.devstatus.summary.beans.BranchOverallBean@1aa9a4e0[count=0,lastUpdated=<null>,lastUpdatedTimestamp=<null>],byInstanceType={}]},errors=[],configErrors=[]], devSummaryJson={\\\"cachedValue\\\":{\\\"errors\\\":[],\\\"configErrors\\\":[],\\\"summary\\\":{\\\"pullrequest\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":\\\"OPEN\\\",\\\"details\\\":{\\\"openCount\\\":0,\\\"mergedCount\\\":0,\\\"declinedCount\\\":0,\\\"total\\\":0},\\\"open\\\":true},\\\"byInstanceType\\\":{}},\\\"build\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"failedBuildCount\\\":0,\\\"successfulBuildCount\\\":0,\\\"unknownBuildCount\\\":0},\\\"byInstanceType\\\":{}},\\\"review\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"stateCount\\\":0,\\\"state\\\":null,\\\"dueDate\\\":null,\\\"overDue\\\":false,\\\"completed\\\":false},\\\"byInstanceType\\\":{}},\\\"deployment-environment\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null,\\\"topEnvironments\\\":[],\\\"showProjects\\\":false,\\\"successfulCount\\\":0},\\\"byInstanceType\\\":{}},\\\"repository\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}},\\\"branch\\\":{\\\"overall\\\":{\\\"count\\\":0,\\\"lastUpdated\\\":null},\\\"byInstanceType\\\":{}}}},\\\"isStale\\\":false}}\",\r\n" + 
				"                \"aggregateprogress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"priority\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/priority/3\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/images/icons/priorities/medium.svg\",\r\n" + 
				"                    \"name\": \"Medium\",\r\n" + 
				"                    \"id\": \"3\"\r\n" + 
				"                },\r\n" + 
				"                \"customfield_10100\": null,\r\n" + 
				"                \"labels\": [],\r\n" + 
				"                \"environment\": null,\r\n" + 
				"                \"timeestimate\": null,\r\n" + 
				"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
				"                \"versions\": [],\r\n" + 
				"                \"duedate\": null,\r\n" + 
				"                \"progress\": {\r\n" + 
				"                    \"progress\": 0,\r\n" + 
				"                    \"total\": 0\r\n" + 
				"                },\r\n" + 
				"                \"issuelinks\": [],\r\n" + 
				"                \"votes\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/issue/APITEST-2/votes\",\r\n" + 
				"                    \"votes\": 0,\r\n" + 
				"                    \"hasVoted\": false\r\n" + 
				"                },\r\n" + 
				"                \"assignee\": null,\r\n" + 
				"                \"updated\": \"2020-04-17T07:28:07.000+0530\",\r\n" + 
				"                \"status\": {\r\n" + 
				"                    \"self\": \"http://localhost:8080/rest/api/2/status/10000\",\r\n" + 
				"                    \"description\": \"\",\r\n" + 
				"                    \"iconUrl\": \"http://localhost:8080/\",\r\n" + 
				"                    \"name\": \"To Do\",\r\n" + 
				"                    \"id\": \"10000\",\r\n" + 
				"                    \"statusCategory\": {\r\n" + 
				"                        \"self\": \"http://localhost:8080/rest/api/2/statuscategory/2\",\r\n" + 
				"                        \"id\": 2,\r\n" + 
				"                        \"key\": \"new\",\r\n" + 
				"                        \"colorName\": \"blue-gray\",\r\n" + 
				"                        \"name\": \"To Do\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}";
	}
}
