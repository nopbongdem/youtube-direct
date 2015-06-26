# YouTube Direct 2.0 Migration Guide #

The migration from a YouTube Direct 1.0 instance to YouTube Direct 2.0 (e.g. anything after the `20100422` release) should be fairly painless. Here are a few things to keep in mind:

  * All your existing assignments and submissions should carry over in between versions.

  * All string values in the Configuration tab (http://APP_ID.appspot.com/admin -> "Configuration") will need to be re-entered. In the course of adding full [Unicode support](http://code.google.com/p/youtube-direct/issues/detail?id=8), we changed the way strings are escaped when they're saved and read from the datastore. You should re-enter strings exactly as you'd like them to appear in your uploader interface, including HTML tags if desired, after upgrading.

  * If you've made any customizations to your local YouTube Direct codebase, you need to be very careful when upgrading to YouTube Direct 2.0 to ensure that they're not overwritten. There's no foolproof way of doing this, unfortunately, and it may be easiest to start with the base YouTube Direct 2.0 installation and then re-apply your customizations. Alternatively, you could try to perform an SVN merge with the YouTube Direct 2.0 SVN release and your local working copy.

  * It's recommended that when deploying your new YouTube Direct 2.0 instance to production, you use a new App Engine version number. You can specify your version number in your local `war/WEB-INF/appengine-web.xml` file, as described in the [App Engine documentation](http://code.google.com/appengine/docs/java/config/appconfig.html#About_appengine_web_xml). After you've deployed your new version, you should mark it as the default in the [App Engine administration control panel](http://appengine.google.com). You will always have the option of reverting to your previous YouTube Direct 1.0 as the default if you need to roll back.