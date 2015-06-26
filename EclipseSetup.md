## Set up Eclipse environment for YTD ##

YTD is source-controlled, built and deployed using Eclipse and its plugins. If you already have Eclipse installed, please go to the next section to install plugins. If not, please first install [Eclipse IDE for Java EE Developers](http://www.eclipse.org/downloads/).

Please make sure, especially if you are on Windows, that you have a JDK installed, not just a JRE. The latest [Java 6 JDK from Sun](http://www.oracle.com/technetwork/java/javase/downloads/jdk-6u27-download-440405.html) should be fine. **Note that there may be issues with JDK7, so for the time being JDK6 is recommended.** If you're first installing a JDK, you also need to configure Eclipse to use it. This is done in Window -> Preferences -> Java -> Istalled JREs. You may need to "Add" the path to your JDK if it isn't listed there (something like C:\Program Files\Java\jdk1.6.X if you are on Windows).

### Install the Google App Engine plugin ###

You can install the Google Plugin for Eclipse using the Software Update feature of Eclipse.

**Note:** We haven't yet tested things with **Eclipse 3.6 (Helios)**. It's likely that different plugin versions will be needed if you're using that release.

To install the plugin, using **Eclipse 3.5 (Galileo)**:

  1. Select the **Help** menu > **Install New Software...**.
  1. In the **Work with** text box, enter: http://dl.google.com/eclipse/plugin/3.5 the Add... button. In the dialog that shows, click **OK** (keep the name blank; it will be retrieved from the update site.)
  1. Click the triangle next to "Plugin" and "SDKs". Check the boxes next to "Google Plugin for Eclipse 3.5" and "Google App Engine Java SDK". Click the **Next** button. Follow the prompts to accept the terms of service and install the plugin.
  1. When the installation is complete, Eclipse prompts you to restart. Click Yes. Eclipse restarts. The plugin is installed.

To install the plugin, using **Eclipse 3.4 (Ganymede)**:

  1. elect the **Help** menu > **Software Updates...** The "Software Updates and Add-ons" window opens.
  1. Select the **Available Software** tab. Click the **Add Site...** button. The "Add Site" window opens. For "Location," enter the install location for the Eclipse 3.4 version of the plugin: http://dl.google.com/eclipse/plugin/3.4 then click **OK**. The dialog closes, and the new location is added to the list of available software.
  1. Click the triangle next to the new install location, then click the triangle next to "Google" to display installation options. Check the boxes next to "Google Plugin for Eclipse 3.4" and "Google App Engine Java SDK". Click the I\*nstall...**button. Follow the prompts to accept the terms of service and install the plugin.
  1. When the installation is complete, Eclipse prompts you to restart. Click**Yes**. Eclipse restarts. The plugin is installed.**

### Install the Subclipse plugin ###

You can install the Subclipse for Eclipse using the Software Update feature of Eclipse.

To install the plugin, using **Eclipse 3.5 (Galileo)**:

  1. Select the **Help** menu > **Install New Software...**.
  1. In the **Work with** text box, enter: http://subclipse.tigris.org/update_1.6.x the **Add...** button. In the dialog that shows, click **OK** (keep the name blank; it will be retrieved from the update site.)
  1. Click the triangle next to "Subclipse". Check the boxes next to "Subclipse". Click the **Next** button. Follow the prompts to accept the terms of service and install the plugin.
  1. When the installation is complete, Eclipse prompts you to restart. Click **Yes**. Eclipse restarts. The plugin is installed.

To install the plugin, using **Eclipse 3.4 (Ganymede)**:

  1. Select the **Help** menu > **Software Updates...** The "Software Updates and Add-ons" window opens.
  1. Select the **Available Software** tab. Click the **Add Site...** button. The "Add Site" window opens. For "Location," enter http://subclipse.tigris.org/update_1.6.x then click **OK**. The dialog closes, and the new location is added to the list of available software.
  1. Open the URL and select "Subclipse". Click the **Install...** button. Follow the prompts to accept the terms of service and install the plugin.
  1. When the installation is complete, Eclipse prompts you to restart. Click **Yes**. Eclipse restarts. The plugin is installed.