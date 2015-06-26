**NOTE:** This feature is only available in YTD 2.0 branch. YTD v2.0 is still under active development and is not yet stable.


# Introduction #

In YTD v2.0, the admin backend is complemented with a JSON-RPC API that enables you to fetch all the data relating to assignments, submissions and configuration programmatically.

The admin API is based on the JSON-RPC protocol format. It is essentially a REST-ful POST request with a JSON payload. For more information on JSON-RPC - [http://en.wikipedia.org/wiki/JSON-RPC](http://en.wikipedia.org/wiki/JSON-RPC).

# Details #

## Example: ##

**INPUT** -> {"method": "GET\_VIDEO\_SUBMISSIONS", "sortBy": "created", "sortOrder": "desc", "filterType": "all", "pageIndex": "1", "pageSize": "10"}

**OUTPUT** -> {"result":[{"videoSource":"MOBILE\_SUBMIT","status":"UNREVIEWED","videoTitle":"Android Test","assignmentId":16002,"id":"agNkdWlyFwsSD1ZpZGVvU3VibWlzc2lvbhifyAIM","videoDescription":"Just a test.","videoTags":"test","created":"Fri, 12 Feb 2010 22:32:04 +0000","updated":"Fri, 12 Feb 2010 22:32:04 +0000","videoId":"3m5Yhk9FjZA","isInPlaylist":false,"youTubeState":"UNKNOWN","youTubeName":"elleon0","viewCount":-1},{"videoSource":"MOBILE\_SUBMIT","status":"UNREVIEWED","videoTitle":"Android Test","assignmentId":16002,"id":"agNkdWlyFwsSD1ZpZGVvU3VibWlzc2lvbhjn1wIM","videoDescription":"Just a test.","videoTags":"test","created":"Fri, 12 Feb 2010 21:34:27 +0000","updated":"Fri, 12 Feb 2010 21:34:27 +0000","videoId":"8u3oa4cBRGE","isInPlaylist":false,"youTubeState":"UNKNOWN","youTubeName":"elleon0","viewCount":-1}],"totalSize":46,"totalPages":23}

## List of API commands ##

### GET\_VIDEO\_SUBMISSIONS ###

  * This command fetches the list of all video submission

**Params**

  * sortBy (required)
    * possible values - id, created, updated, videoTitle, videoDescription, videoDate, videoLocation, articleUrl
  * sortOrder (required)
    * possible values - asc, desc
  * filterType (required)
    * possible values - unreviewed, approved, rejected, spam
  * pageIndex (required) - paging index, starting at 1
  * pageSize (required) - paging size

### UPDATE\_VIDEO\_SUBMISSION\_STATUS ###

  * This command updates the video moderation status

**Params**

  * id (required) - The video submission id
  * status(required)
    * possible values - unreviewed, approved, rejected, spam


### UPDATE\_VIDEO\_SUBMISSION\_ADMIN\_NOTES ###

  * This command updates the admin notes for a video submission

**Params**

  * id (required) - The video submission id
  * adminNotes (required) - String of text

### GET\_ASSIGNMENTS ###

  * This command fetches the list of all assignments
  * required params: sortBy, sortOrder, filterType, pageIndex, pageSize

**Params**

  * sortBy (required)
    * possible values - id, created, updated, description, playlistId, category, status
  * sortOrder (required)
    * possible values - asc, desc
  * filterType (required)
    * possible values - pending, active archived
  * pageIndex (required) - paging index, starting at 1
  * pageSize (required) - paging size


### UPDATE\_ASSIGNMENT ###

  * This command updates the meta data pertaining to an assignment

**Params**

  * id (required) - The assignment id
  * status (optional)
    * possible values: pending, active, archived
    * description (optional) - String of text
  * category (optional)
  * possible values: News,People,Tech,Music,Entertainment,Film


### GET\_ADMIN\_CONFIG ###

  * This command returns all the admin configuration properties

**No params are needed**

## Tools: ##

  * Interactive API console is available on 