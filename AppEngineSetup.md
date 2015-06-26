## Setting Up App Engine for YouTube Direct ##

YouTube Direct is designed to run on [Google App Engine](http://code.google.com/appengine/) - Google's highly scalable hosting platform. App Engine comes with a set of free resource quotas that will allow your application to serve ~ 5M pageviews per month. If your application need more quota, you can simply add a credit card, set a maximum budget and App Engine will automatically scale up your application to serve the traffic as needed. You will only be charged for the extra quota that you used. You can read more about App Engine billing [here](http://googleappengine.blogspot.com/2009/02/new-grow-your-app-beyond-free-quotas.html).

You need to set up your Google App Engine account before using YouTube Direct. Please follow the steps below.

### Steps ###

  1. Sign up for an App Engine account at http://appengine.google.com
    * You can use your Gmail or Google Apps for your domain account to sign up. Please note that if you're using a Google Apps account, you have to sign in at http://appengine.google.com/a/YOUR_DOMAIN_NAME.
  1. Create a new app for your instance of YouTube Direct by entering a new app\_id. The app\_id cannot be changed once it's set up, but you can set it up to be accessable through your domain name. App Engine uses Google Apps to manage domains. Please view this [short screencast](http://www.youtube.com/watch?v=7mh9vUzOVng) that explains the simple set up process.
  1. Familiarize yourself with the App Engine Admin Console. The Google App Engine Administration Console gives you complete access to the public version of your application. Access the Console by visiting https://appengine.google.com/
    * Sign in with your Google account, or create one with an email address and password. If you are using App Engine with your [Google Apps](http://www.google.com/a/) account, you can sign in to App Engine for your domain using a URL similar to the following, where _your-domain.com_ is your Google Apps domain: https://appengine.google.com/a/your-domain.com

You can use the Administration Console to:
  * create a new application, and set up a free appspot.com sub-domain, or a top-level domain name of your choosing
  * invite other people to be developers for your application, so they can access the Console, YouTube Direct admin panel, and upload new versions of the code
  * view access data and error logs, and analyze traffic
  * browse your application's datastore and manage indexes
  * view the status of your application's scheduled tasks
  * test new versions of your application, and switch the version that your users see

Add additional Google Account addresses to be administrators of your App Engine instance. You should invite all users who will need to create assignments and moderate submissions, as well as any email addresses that you would like to use as the From: address for mails that App Engine sends.