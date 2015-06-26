# Release Notes #
### 3.0-20111214 ###
  * First release in the YouTube Direct 3.0 codebase.
  * Support for multi-instance deployments. See MultipleInstances for more info.
  * Assignments can now be edited after creation (e.g. their associated playlist can be modified).
  * Many bug fixes and general updates to the code.

### 2.0-20100422 ###
  * First release in the YouTube Direct 2.0 codebase.
  * Many changes -- see the [what's new in 2.0](YTD20WhatsNew.md) guide.

### 1.0-20100421 ###
  * Potentially last release in the YouTube Direct 1.0 codebase.
  * Updated Java Google Data client libraries to 1.41.1 release.

### 20100309 ###
  * Modified the code that inserts videos into playlists. It should be more reliable for newly-uploaded videos that are not yet in YouTube's search index.
  * Changed the method that parses YouTube video ids from YouTube URLs to accommodate upcoming [changes](http://apiblog.youtube.com/2010/03/upcoming-change-to-youtube-video-page.html).
  * There is basic support for adding captioning to submitted videos, via the "details" interface in the video submission tab. More information about the format for the captioning data can be found in the [YouTube API developer's guide](http://code.google.com/apis/youtube/2.0/developers_guide_protocol_captions.html).

### 20100202 ###
  * Added a "Loading... please wait." message while the content from the embed.jsp iframe is initialized.
  * Removed the SyncMetadata cron job, in favor of retrieving fresh metadata on demand when a video is accessed in the admin panel.

### 20091113 ###
  * Fixes to support scenarios in which the App Engine domain doesn't match the host page domain, and third-party cookies are disabled in the user's browser.

### 20091104 ###
  * Rebranding for YouTube Direct.

### 20091013 ###
  * Major user interface changes to the administration interface and default submission interface.
  * Many changes to the various data model classes.
  * Automatic creation of YouTube playlists and population of those playlists with approved videos.
  * Support for the new YouTube API moderation feed, to control whether videos uploaded with a developer key are considered approved or rejected.
  * Initial support for mobile uploads--preliminary at this stage.
  * A variety of bug fixes since the last milestone release.

### 20090901 ###
  * First official milestone release; basic uploader functionality.