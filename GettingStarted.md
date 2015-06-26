# Introduction #
The YouTube Direct platform is designed to run on Google App Engine. App Engine allows you to run applications on top of Google's infrastructure. Follow this guide to deploy your own instance of `YTD`. But before you do that, you need to set up your environment for `YTD`:
  * [Set up your YouTube and Google Account for YTD](http://code.google.com/p/youtube-direct/wiki/AccountSetup)
  * [Set up Eclipse for YTD](http://code.google.com/p/youtube-direct/wiki/EclipseSetup)
  * [Set up App Engine for YTD](http://code.google.com/p/youtube-direct/wiki/AppEngineSetup)

If you are upgrading from a previous release, please familiarize yourself with the latest [release notes](http://code.google.com/p/youtube-direct/wiki/YTDReleaseNotes).

# Getting Started Video #

In addition to the material below, you might find the following video tutorial useful when getting started:

<a href='http://www.youtube.com/watch?feature=player_embedded&v=p1pxGe3zLXg' target='_blank'><img src='http://img.youtube.com/vi/p1pxGe3zLXg/0.jpg' width='425' height=344 /></a>

# Details #

## `YouTube` Direct Getting Started Guide ##

Please complete the setup steps listed in the Introduction above before proceeding.

### Sync your Eclipse project to the YTD codebase ###
In your Eclipse window, select the **File menu > New**
  * In the sub menu, choose Other ...
  * With the popup menu, choose SVN > "Checkout projects from SVN". Click the Next button.
  * Click on "Create a new repository location". Click the Next button.
  * Enter "http://youtube-direct.googlecode.com/svn/trunk/" as the URL.
  * Click on the URL to highlight it. Click the Finish button.

Eclipse should now be downloading all the files from YTD repository in a project named "ytd".

### Build the YTD project in Eclipse ###

Once the download is completed, Eclipse should automatically begin to build the deploy binary. While it is building the status bar on the bottom right should say "Building workspace". If you do not have automatic build enabled for Eclipse, you can go to **Project > Build All**.

### Deploy YTD on your local machine ###
Before deploying your YTD instance to App Engine, it's always a good idea to run it locally and test. The App Engine development server was automatically installed when you installed the Google Eclipse plugin in the previous step.

  * Make a copy of war/WEB-INF/appengine-web\_DEFAULT.xml and name it war/WEB-INF/appengine-web.xml. Edit your local copy of the file to:
    * Replace 

&lt;application&gt;

 with your registered App Engine application ID.
    * Replace 

&lt;version&gt;

 with 1, and increment it as you see fit.
    * Replace com.google.ytd.YTDeveloperKey property with your registered YT Developer Key
    * Replace com.google.ytd.YTClientID the unique identifier string of your choice.
    * Deploy YTD using the local development webserver environment that comes with the App Engine SDK. If using Eclipse with the GAE plugin, the default "Run" Eclipse action will do this. The webserver runs at http://localhost:8080/ .
    * You can test the YTD instance by going to http://localhost:8080/admin. The data you entered in the local instance will not be deployed to production. Once you're satisfied with your testing, you can proceed to deploy your YTD instance to Google App Engine.


### Deploy YTD to Google App Engine ###
If local deployment is successful, you can procede to deploy to Google App Engine.
  * Right click on the project "ytd". See the dropdown menu and select **Google > Deploy to App Engine**
  * Enter the email and password for your Google App Engine account. Click on the Deploy button.
  * Once deployment is done, you can access your production instance of YTD at http://APP_ID.appspot.com/admin.

### Configuration of YTD Admin ###
After deployment is completed. You must perform a few configuration before you can start creating assignment.
  * Go to the admin panel for YTD by visiting http://APP_ID.appspot.com/admin, where APP\_ID is your registered App Engine instance name. You'll need to log in with a Google Account that is set up as an administrator for your App Engine instance.
  * Go to the "Configuration" tab and make the desired configuration changes. Mouse over the ? icons for descriptions of each option.
  * Make sure that the YouTube account you authenticate as is linked to the Google Account that owns your YouTube Developer Key.

### Registering your website for AuthSub ###
Register your new YTD instance with Google's AuthSub. This will get rid of the red warning text box that appears when unregistered web sites us AuthSub. There is more information on AuthSub in this document. You can initiate the registration process at https://www.google.com/accounts/ManageDomains.
**Note:** Be sure that you initiate the domain registration with your new YTD APP\_ID.appspot.com domain. You do not need to go through the domain registration process with your host website's domain. Only your YTD App Engine domain needs to be registered.
  * When asked for the Target URL path prefix: you should use http://APP_ID.appspot.com/ (where APP\_ID is the name of your App Engine instance). Be sure that you use http:// and not https://
  * If you enter an incorrect value for Target URL path prefix: then the AuthSub web interface will reject your requests for AuthSub tokens and will display an error message warning that a malicious web site might be requesting tokens on your behalf.
**OPTIONAL** You can now use "secure" AuthSub with YTD 2.0. If you choose to implement secure AuthSub, the login message that users see will explicitly state that their requests are being sent securely.
  * First, follow the previous steps and ensure that your basic AuthSub setup is functional.
  * Follow [the instructions](http://code.google.com/apis/gdata/docs/auth/authsub.html#Registered) to generate both a certificate .pem file (the `openssl req -x509...` command) and a .pk8 private key file for Java (the `openssl pkcs8...` command).
  * Log in at https://www.google.com/accounts/ManageDomains and click on "Manage APP\_ID.appspot.com" to bring up the domain management interface.
  * In the "Upload new X.509 cert:" section, select the .pem file that you generated in the previous step and submit it to Google.
  * Visit your YTD 2.0 Configuration tab at http://APP_ID.appspot.com/admin. In the "YouTube API Settings" section there's a text field labeled "Private Key Certificate". Paste in the contents of the .pk8 private key file you previously generated and save your changes. The .pk8 file should start with `-----BEGIN PRIVATE KEY-----`. Include all lines in the file when you paste in the contents.
When users go through the AuthSub authentication flow they should now see the message `APP_ID.appspot.com: Registered, secure. This website is registered with Google to make authorization requests`


### Creating new assignments & Embedding YTD Uploader to your page ###
  * In your YTD Admin panel, go to the "Assignments" tab and create a new assignment.
  * Set the Assignment to the appropriate category (e.g "Entertainment"), set the status to "Active" to enable video submission and put a description to the assignment.
  * Select the new assignment by highlighting it in the list and click the "Embed Code" button to show the JavaScript code to embed the YTD uploader on your page.
    * Make sure that you modify the ytd-embed.js URL to point to the actual path to the file. By default, ytd-embed.js is hosted on your App Engine instance at http://APP_ID.appspot.com/ytd-embed.js.
    * If your page has an existing window.onload handler, add the ytd.embed() JavaScript code to that instead of creating a new window.onload.
  * Copy the embed code and paste it onto the page where you want the uploader to appear. Save and deploy your updated page. Now your site visitors can start submitting their videos. They have 2 options to do this, they can upload a new video, or submit an existing video that they already own.


### Moderating submissions ###
Once videos have been submitted through the uploader, you can go back the YouTube Direct admin panel to moderate the videos.

  * Visit the "Submissions" tab to view submitted videos and approve/reject them as desired. All newly submitted videos will have the UNREVIEWED statys. As an admin, you can preview the video and details, and once you're satisfied, you can change the status as "APPROVED".
  * Approved videos will be automatically added to a playlist associated with each assignment (owned by your YouTube account), and depending on your configuration settings, will have their descriptions and tags updated to reflect your approval.
  * Note that in the "Configuration" tab, you can specify an address to receive an email whenever a new video is submitted.

### Embedding playlists ###
Once you have approved videos to display, you can go back to Assignment tab to get the code to display the playlist.
  * Select the Assignment, and click on the "Playlist" button.
  * Copy the code and paste it onto the page where you want to display the approved videos. Approved videos are automatically added to the playlist.

### Optional: Setting Up Multiple Instances ###
This is an advanced feature aimed at organizations who want to maintain a single App Engine deployment that hosts multiple logical instance of YouTube Direct. The MultipleInstances guide has more details on setting things up.

# Getting Help #
If you have any questions about setting up YouTube Direct and have already read through the online guides, please let us know in the [YouTube API Developer Forum](https://groups.google.com/group/youtube-api-gdata).