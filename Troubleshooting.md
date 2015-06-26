YouTube Direct has a number of "moving parts" and pieces that need to be configured. It also makes heavy use of the App Engine and YouTube APIs. While we hope that the existing guides and configuration details are enough to get you started using YouTube Direct, we wanted to highlight a number of troubleshoot tips that might get you over some bumps in the road.

## Check your logs! ##
YouTube Direct runs on App Engine, and stores a good amount of information to App Engine's logs. If you're experiencing a seemingly random failure, your first step should be to check out your logs, as it should contain some explanation for what's going on. [This article](http://code.google.com/appengine/articles/logging.html) contains instructions on how to access your App Engine logs.

## Check your JDK! ##
If you're a developer running Windows who does not have an existing [Eclipse IDE](http://www.eclipse.org/) installation, then you need to make sure that you install a compatible Java Development Kit on your Windows machine and configure Eclipse to use it. More information can be found at the start of the EclipseSetup guide.

## Check your AuthSub registration! ##
When you're configuring AuthSub support for your App Engine domain, be sure that you register `APP_ID.appspot.com`, as explained in the [configuration guide](http://code.google.com/p/youtube-direct/wiki/GettingStarted#Registering_your_website_for). A common mistake is to register the hostname of the site that contains the embedded uploader. If you don't register your App Engine instance correctly for AuthSub, users will see a red warning message when they attempt to authenticate, or they'll see an error message indicating that a site sent a malformed authorization request.