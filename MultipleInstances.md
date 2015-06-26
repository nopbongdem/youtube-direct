## Configuring YouTube Direct's Multi-Instance Mode ##

### Introduction ###

As of the 3.0 release, YouTube Direct supports multiple, logically separated instances to be served out of a single App Engine deployment. Each logical instance has its own configuration, set of administrators, and potentially its own custom UI.

While this functionality isn't for everyone, we envision service providers, agencies or consultants being able to deploy a single App Engine app and then set up multiple logical instances to handle different client deployments.

### Technical Details ###

Multi-instance mode relies on App Engine's support for [namespaces and multitenancy](http://code.google.com/appengine/docs/java/multitenancy/multitenancy.html). A filter is defined in a special `web.xml` configuration file that automatically applies the correct namespace to a given incoming HTTP request.

### Configuration Steps ###

  1. Ensure that you're starting with an up to date codebase. Either [download](http://code.google.com/p/youtube-direct/downloads/list) a 3.0 (or higher) `tar.gz` archive or sync to the [SVN trunk](http://code.google.com/p/youtube-direct/source/checkout) using an SVN client of your choice.
  1. Rename the `web.xml` file (in the `war/WEB-INF/` directory of the downloaded code) to something else, like `web_ORIGINAL.xml`.
  1. Rename the existing `web_INSTANCES.xml` file (in the same `war/WEB-INF` directory) to `web.xml`.
  1. Follow the normal YouTube Direct deployment and configuration process, as outlined in the GettingStarted guide.
  1. After you've deployed your instance to App Engine, visit https://APP_ID.appspot.com/instances/ and log in using the Google Account that owns the App Engine instance.
  1. Create a new instance (referred to as `INSTANCE_NAME` in this guide) and permission at least one Google Account email address as an instance administrator. Repeat with additional instances and additional administrators as needed. _Note: The Google Account email address you provide in this step does not need to be permissioned as an owner of the App Engine instance. Any Google Account email address will work._
  1. Each instance administrator will receive an email with a confirmation link that they need to visit before they're activated as an administrator. _Note: The App Engine development server can't send emails, so attempting this process from anything other than the production environment will not work._
  1. For each new instance you add, create a directory under `war/` in your codebase that has the same name (i.e. `war/INSTANCE_NAME`), and add a copy of `embed.jsp` to the directory.
  1. You can then customize that `war/INSTANCE_NAME/embed.jsp` file as you see fit. Each instance's web submission form can maintain its own look and feel based on the customized `embed.jsp` file.
  1. Deploy your updated code to App Engine again. When an administrator visits the https://APP_ID.appspot.com/admin interface from now on, they'll automatically be routed to the correct instance's administrative interface and can moderate submissions for that instance.

### Getting Help ###

You can ask questions about setting up multiple instances or about anything else related to YouTube Direct in our [YouTube API Developer's Forum](https://groups.google.com/group/youtube-api-gdata).